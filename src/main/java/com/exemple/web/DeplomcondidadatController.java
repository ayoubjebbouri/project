package com.exemple.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.exemple.dao.DeplomcondidatRepository;
import com.exemple.entities.Deplomcondidat;



@Controller
public class DeplomcondidadatController {
	@Autowired
	 private DeplomcondidatRepository deplomcondidatrepository;
	

	@GetMapping("/new")
    public String showNewDeplomcondidatForm(Model model) {
        model.addAttribute("Deplomcondidat", new Deplomcondidat());
        return "deplomcondidat/form";
    }
	@PostMapping("/save23")
    public String saveDeplomcondidat(@ModelAttribute("deplomcondidat") Deplomcondidat deplomcondidat, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "deplomcondidat/form";
        }
        deplomcondidatrepository.save(deplomcondidat);
        return "redirect:/deplomcondidat";
    }
}
