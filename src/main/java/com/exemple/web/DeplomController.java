package com.exemple.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.exemple.entities.Deplom;
import com.exemple.dao.DeplomRepository;

@RequestMapping("/deplom")
@Controller
public class DeplomController {
	@Autowired
    private DeplomRepository deplomService;

    @GetMapping
    public String getAllDeploms(Model model) {
        List<Deplom> deploms = deplomService.findAll();
        model.addAttribute("deploms", deploms);
        return "deplom/list";
    }

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
}
