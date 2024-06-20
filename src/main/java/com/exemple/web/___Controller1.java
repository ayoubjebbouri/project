package com.exemple.web;
import com.exemple.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ___Controller1 {
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






    /*
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






    @GetMapping("/listedeploms")
    public String getdeplom(){
        return "Admin/societe";
    }


    @GetMapping("/dmin/deletedeplom")
    public String deletedeplom(@RequestParam(name = "id") Long id, String keyword , int page){
        deplomService.deleteById(id);
        return "Admin/Deplom";
    }
    @GetMapping("/admin/adddeplom")
    public String adddeplom(@Valid Deplom deplom, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return "editdeplom";
        deplomService.save(deplom);
        return "/admin/editdeplom";
    }
    @GetMapping("/admin/editdeplom1")
    public String edisqtdeplom(@RequestParam(name = "id" ) Long id ,Model model){
        Deplom deplom =deplomService.findById(id).get();
        model.addAttribute("deplom", deplom);
        return "/admin/editdeplom";

    }
    @GetMapping("/pageaddeplom")
    public String pageaddeplom(Model model){
        model.addAttribute("deplom", new Deplom());
        return "/admin/editdeolom";
    }

    @GetMapping("/admin/addeplom")
    public String addeplom(Deplom deplom){
        System.out.println("Id :" +deplom.getId());
        System.out.println("Branche :" +deplom.getBranche());
        System.out.println("Name :" +deplom.getName());
        System.out.println("niveau :" +deplom.getniveau());
        System.out.println("\n");
        deplomService.save(deplom);
        return "Admin/Addeplom";
    }

    @GetMapping("/dmin/deleteoffer")
    public String deleteoffer(@RequestParam(name = "id") Long id ,Model model){
        Offer offer = offerRepository.findById(id).get();
        offerRepository.delete(offer);
        return "Admin/Offeradmin";
    }




   /* @GetMapping("/admin/addeplom")
    public String editdeplom(@RequestParam String name ,@RequestParam String branche,@RequestParam String niveau){
        Deplom deplom = new Deplom();
        deplom.setName(name);
        deplom.setBranche(branche);
        deplom.setniveau(niveau);
        deplomService.save(deplom);
        return "redirect:/Admin/Deplom";
    }
    @PostMapping("/admin/editdeplom")
    public String editdeplom1(@RequestParam("name") String name ,@RequestParam("branche") String branche,@RequestParam("niveau") String niveau){
        Deplom deplom = new Deplom();
        deplom.setName(name);
        deplom.setBranche(branche);
        deplom.setniveau(niveau);
        deplomService.save(deplom);
        return "redirect:/Admin/Deplom";

    }*/

}
/*
        if (Objects.equals(id, "2")) {
            return new Admin(Long.valueOf(2), "Achtarmoun", "hahsa@gmail.com", "dqsdjqsdopd");
        } else {
            return new Admin(Long.valueOf(1), "Achtarmoun","hahsa@gmail.com", "dqsdjqsdopd");
        }
        */