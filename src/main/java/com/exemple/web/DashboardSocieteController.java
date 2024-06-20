package com.exemple.web;

import com.exemple.dao.*;
import com.exemple.entities.Deplom;
import com.exemple.entities.Offer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/Societe")
@Controller
public class DashboardSocieteController {
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
    @GetMapping("/hommeaddoffer")
    public String pageaddeploms(Model model){
        model.addAttribute("offer", new Offer());
        return "Societe/AddDeplom";
    }
    // ADD OFFER
    @GetMapping("/Addoffer")
    public String addOffer(@Valid Offer offer, BindingResult bindingResult){
        if (bindingResult.hasErrors()) return "Societe/Addoffer";
        offerRepository.save(offer);
        return "Societe/Listeoffer";
    }
}
