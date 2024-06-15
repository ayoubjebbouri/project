package com.exemple.web;

import com.exemple.dao.*;
import com.exemple.entities.Candidature;
import com.exemple.entities.Societe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CreateAccount {
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
    @GetMapping("/signupSociete")
    public String signupSociete(Model model){
        model.addAttribute("societe", new Societe());
        return "Societe/SignupSociete";
    }
    //  Create account logic
    @GetMapping("/savesociete")
    public String savesociete(Societe societe){
        societeRepository.save(societe);
        return "Societe/Loginsociete";
    }


    // serve static page
    @GetMapping("/signupcondidature")
    public String signupcon(Model model){
        model.addAttribute("candidature", new Candidature());
        return "Candidature/signupCondidature";
    }

    //  Create account logic
    @GetMapping("/savecondidature")
    public String savecondidature(Candidature candidature){
        candidatureRepository.save(candidature);
        return "Candidature/Logincondidature";
    }
}
