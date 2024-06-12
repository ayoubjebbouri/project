package com.exemple.web;
import com.exemple.dao.CandidatureRepository;
import com.exemple.dao.DeplomRepository;
import com.exemple.dao.SocieteRepository;
import com.exemple.entities.Candidature;
import com.exemple.entities.Deplom;
import com.exemple.entities.Societe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller1 {
    @Autowired
    private DeplomRepository deplomService;
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

        return "Admin/Offeradmin";
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

    @GetMapping("/listedeploms")
    public String getdeplom(){
        return "Admin/societe";
    }
    @GetMapping("/deploma")
    public String liste(Model model,
                        @RequestParam(name = "page", defaultValue = "0") int page,
                        @RequestParam(name = "size", defaultValue = "5") int size,
                        @RequestParam(name = "keyword", defaultValue = "") String kw) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Deplom> deplomPage = deplomService.findByniveauContains(kw, pageable);

        model.addAttribute("listDeplom", deplomPage.getContent());
        model.addAttribute("pages", new int[deplomPage.getTotalPages()]);
        model.addAttribute("currentPage", page);

        return "Admin/Deplom";
    }
    @GetMapping("/dmin/deletedeplom")
    public String deletedeplom(@RequestParam(name = "id") Long id, String keyword , int page){
        deplomService.deleteById(id);
        return "Admin/Deplom";
    }
    @GetMapping("/admin/adddeplom")
    public String adddeplom(Deplom deplom){
        deplomService.save(deplom);
        return "Admin/Deplom";
    }
    @GetMapping("/admin/editdeplom1")
    public String edisqtdeplom(@RequestParam(name = "id" ) Long id ,Model model){
        Deplom deplom =deplomService.findById(id).get();
        model.addAttribute("deplom", deplom);
        return "Admin/Deplom";

    }
    @GetMapping("/pageaddeplom")
    public String pageaddeplom(Model model){
        model.addAttribute("deplom", new Deplom());
        return "Admin/test";
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