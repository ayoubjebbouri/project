package com.exemple.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import com.exemple.entities.Deplom;
import com.exemple.dao.DeplomRepository;

@RequestMapping("/deplom")
@Controller
public class DeplomController {
	@Autowired
    private DeplomRepository deplomService;



    @GetMapping("/savedeplom")
    public String showNewDeplomForm(Model model) {
        model.addAttribute("deplom", new Deplom());
        return "AddDeplom";
    }

    @PostMapping("/save25")
    public String saveDeplom(@ModelAttribute("deplom") Deplom deplom, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "deplom/form";
        }
        deplomService.save(deplom);
        return "redirect:/deplom";
    }
    @GetMapping("/Admin/deplom")
    public String index(Model model,
                        @RequestParam(name = "page",defaultValue = "0") int page,
                        @RequestParam(name = "size",defaultValue = "5") int size,
                        @RequestParam(name = "keyword",defaultValue = "") String kw
    ){
        Page<Deplom> pageDeplom = deplomService.findByniveauContains(kw, PageRequest.of(page,size));
        model.addAttribute("listDeplom",pageDeplom.getContent());
        model.addAttribute("pages",new int[pageDeplom.getTotalPages()]);
        model.addAttribute("currentPage",page);
        model.addAttribute("keyword",kw);
        return "Admin/Deplom";
    }
}
