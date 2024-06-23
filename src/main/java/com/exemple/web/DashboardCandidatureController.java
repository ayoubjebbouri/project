package com.exemple.web;

import com.exemple.dao.*;
import com.exemple.entities.Deplom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardCandidatureController {
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


    @GetMapping("/Profiloe")
    public String profile(Model model,
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
}
