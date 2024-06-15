package com.exemple.web;

import com.exemple.dao.*;
import com.exemple.entities.Candidature;
import com.exemple.entities.Deplom;
import com.exemple.entities.Offer;
import com.exemple.entities.Societe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping("/Admin")
@Controller
public class DashboardAdminController {
    @Autowired
    public OfferRepository offerRepository;
    @Autowired
    private DeplomRepository deplomService;
    @Autowired
    private SocieteRepository societeRepository;
    @Autowired
    private CandidatureRepository candidatureRepository;
    @Autowired
    private AdminRepository adminRepository;

    // serve static page
    @GetMapping("/Deploms")
    public String liste(Model model,
                        @RequestParam(name = "page", defaultValue = "0") int page,
                        @RequestParam(name = "size", defaultValue = "5") int size,
                        @RequestParam(name = "keyword", defaultValue = "") String kw) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Deplom> deplomPage = deplomService.findByniveauContains(kw, pageable);

        model.addAttribute("listDeplom", deplomPage.getContent());
        model.addAttribute("pages", new int[deplomPage.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword", kw);
        return "Admin/Deploms";
    }

    // serve static page
    @GetMapping("/offers")
    public String offerliste(Model model,
                             @RequestParam(name = "page", defaultValue = "0") int page,
                             @RequestParam(name = "size", defaultValue = "5") int size,
                             @RequestParam(name = "keyword", defaultValue = "") String kw) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Offer> offersPage = offerRepository.findAll( pageable);

        model.addAttribute("listOffers", offersPage.getContent());
        model.addAttribute("pages", new int[offersPage.getTotalPages()]);
        model.addAttribute("currentPage", page);
        model.addAttribute("keyword", kw);
        return "Admin/Offers";
    }

    // serve static page
    @GetMapping("/candidatures")
    public String conliste(Model model,
                           @RequestParam(name = "page", defaultValue = "0") int page,
                           @RequestParam(name = "size", defaultValue = "5") int size,
                           @RequestParam(name = "keyword", defaultValue = "") String kw) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Candidature> candidatures = candidatureRepository.findAll(pageable);

        model.addAttribute("condidaturesliste", candidatures.getContent());
        model.addAttribute("pages", new int[candidatures.getTotalPages()]);
        model.addAttribute("currentPage", page);
        return "Admin/condidatures";
    }

    // serve static page
    @GetMapping("/societe")
    public String societe2liste(Model model,
                                @RequestParam(name = "page", defaultValue = "0") int page,
                                @RequestParam(name = "size", defaultValue = "50") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Societe> societes = societeRepository.findAll(pageable);

        model.addAttribute("listsociete", societes.getContent());
        model.addAttribute("pages", new int[societes.getTotalPages()]);
        model.addAttribute("currentPage", page);
        return "Admin/societe";
    }

    // serve static page
    @GetMapping("/pageaddeploms")
    public String pageaddeploms(Model model){
        model.addAttribute("deplom", new Deplom());
        return "Admin/Addeplom";
    }
}
