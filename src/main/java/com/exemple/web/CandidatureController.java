package com.exemple.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.exemple.dao.CandidatureRepository;
import com.exemple.entities.Candidature;



@RequestMapping("/candidature")
@Controller
public class CandidatureController {
	 @Autowired
	 private CandidatureRepository candidatureRepository;



	    @GetMapping("/{id}")
	    public String getCandidatureById(@PathVariable("id") Long idC, Model model) {
	        Candidature candidature = candidatureRepository.findById(idC).orElse(null);
	        model.addAttribute("candidature", candidature);
	        return "candidature/details";
	    }

	    @PostMapping("/saveCandidature1")
	    public String saveCandidature(@RequestBody Candidature candidature) throws Exception  {
			System.out.println(candidature);
	    	candidatureRepository.save(candidature);
	        return "redirect:/logincondida";
	    }
}
