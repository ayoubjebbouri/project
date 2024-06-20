package com.exemple.web;

import org.springframework.stereotype.Controller;

@Controller
public class ___SociatyController {
	/*
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
	    }*/
}
