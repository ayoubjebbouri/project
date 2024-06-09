package com.exemple.web;
import com.exemple.dao.CandidatureRepository;
import com.exemple.dao.SocieteRepository;
import com.exemple.entities.Candidature;
import com.exemple.entities.Societe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controller1 {
    @Autowired
    private SocieteRepository societeRepository;
    @Autowired
    private CandidatureRepository candidatureRepository;
    @GetMapping("/test")
    public String getAdmin() {
        return "Controller1html";
    }

    @GetMapping("/index")
    public String getsdmin() {
        return "/accessible/page1";
    }
    @GetMapping("/accessible/about1")
    public String getabout(){

        return "accessible/about";
    }
    @GetMapping("/format")
    public String getformat(){
        return "accessible/about";
    }

    @GetMapping("/accessible/contact")
    public String getcontact(){

        return "/accessible/Contact";
    }
    @GetMapping("/loginadmin")
    public String loginadmin(){

        return "accessible/loginadmin";
    }
    @GetMapping("/logincondida")
    public String logincondida(){

        return "accessible/logincondida";
    }
    @GetMapping("/signupcon")
    public String signupcon(Model model){
        model.addAttribute("candidature", new Candidature());
        return "accessible/signupCondidature";
    }
    @PostMapping("/saveCandidature")
    public String saveCandidature(Candidature candidature) throws Exception  {
        System.out.println(candidature);
        candidatureRepository.save(candidature);
        return "accessible/logincondida";
        // return "redirect:accessible/logincondida";
    }
    @GetMapping("/saveuser")
    public String saveuser(Candidature candidature){
        candidatureRepository.save(candidature);
        return "accessible/logincondida";
    }
   @GetMapping("/savesociete")
   public String savesociete(Societe societe){
        societeRepository.save(societe);
       return "accessible/logsociete";
   }

    @GetMapping("/signupSociete")
    public String signupSociete(Model model){
        model.addAttribute("societe", new Societe());
        return "accessible/SignupSociete";
    }

    @GetMapping("/loginsociete")
    public String loginsociete(){

        return "accessible/logsociete";
    }
}
/*
        if (Objects.equals(id, "2")) {
            return new Admin(Long.valueOf(2), "Achtarmoun", "hahsa@gmail.com", "dqsdjqsdopd");
        } else {
            return new Admin(Long.valueOf(1), "Achtarmoun","hahsa@gmail.com", "dqsdjqsdopd");
        }
        */