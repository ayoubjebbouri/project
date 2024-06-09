package com.exemple.web;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.exemple.dao.OfferRepository;
import com.exemple.dao.SocieteRepository;
import com.exemple.entities.Offer;
import com.exemple.entities.Societe;

import org.springframework.ui.Model;

@Controller
public class SociatyController {
	  private final SocieteRepository societeRepository;
	    private final OfferRepository offerRepository;

	    public SociatyController(SocieteRepository societeRepository, OfferRepository offerRepository) {
	        this.societeRepository = societeRepository;
	        this.offerRepository = offerRepository;
	    }

	    @GetMapping("/companies/{id}/offers")
	    public String showCompanyOffers(@PathVariable("id") Long companyId, Model model) {
	        Societe societe = societeRepository.findById(companyId).orElse(null);
	        Page<Offer> offers = offerRepository.findByIDSocieteContains(companyId , PageRequest.of(0,5));
	        model.addAttribute("Societe", societe);
	        model.addAttribute("Offer", offers);
	        return "company-offers";
	    }
}
