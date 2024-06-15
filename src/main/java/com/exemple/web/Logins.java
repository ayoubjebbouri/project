package com.exemple.web;

import com.exemple.dao.*;
import com.exemple.entities.Admin;
import com.exemple.entities.Candidature;
import com.exemple.entities.Societe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class Logins {
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
    @GetMapping("/loginadmin")
    public String loginadmin(Model model){
        model.addAttribute("admin", new Admin());
        return "Admin/Loginadmin";
    }
    //  login logic
    @GetMapping("/logadmin")
    public String logadmin(Admin admin, Model model){
        try {
            Admin ad;
            List<Admin> addmin = adminRepository.findAll();
            ad = addmin.getFirst();
            if(ad.getPassword().equals(admin.getPassword())){
                if (ad.getEmail().equals(admin.getEmail())){
                    return "Admin/DashboardAdmin";
                }
            }
        }catch(Exception e){
            return "Admin/Loginadmin";
        }
        return "Admin/Loginadmin";
    }


    // serve static page
    @GetMapping("/logincondidature")
    public String logincondidature(Model model){
        model.addAttribute("candidature",new Candidature());
        return "Candidature/Logincondidature";
    }


    //  login logic
    @GetMapping("/logcondidature")
    public String logcondidature(Candidature candidature){
        try {
            Candidature Ca;
            List<Candidature> candidatures = candidatureRepository.findAll();
            Ca = candidatures.getFirst();
            if(Ca.getPassword().equals(candidature.getPassword())){
                if (Ca.getEmail().equals(candidature.getEmail())){
                    return "Candidature/DashboardCandidature";
                }
            }
        }catch(Exception e){
            return "Candidature/Logincondidature";
        }
        return "Candidature/Logincondidature";
    }





    // serve static page
    @GetMapping("/loginsociete")
    public String loginsociete(Model model){
        model.addAttribute("societe",new Societe());
        return "Societe/Loginsociete";
    }
    //  login logic
    @GetMapping("/logsociete")
    public String logsociete(Societe societe,Model model){
        try {
            Societe Sc;
            List<Societe> Societe1 = societeRepository.findAll();
            Sc = Societe1.getFirst();
            if(Sc.getPassword().equals(societe.getPassword())){
                if (Sc.getEmail().equals(societe.getEmail())){
                    return "Admin/DashboardSociete";
                }
            }
        }catch(Exception e){
            return "Societe/Loginsociete";
        }
        return "Societe/Loginsociete";

    }





}
