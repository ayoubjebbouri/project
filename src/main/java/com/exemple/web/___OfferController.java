package com.exemple.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.exemple.dao.OfferRepository;

@Controller
public class ___OfferController {
	@Autowired
	private OfferRepository offerRepository;
	/*
	@GetMapping("/Societe/Addoffer")
	public String addOffer(@Valid Offer offer, BindingResult bindingResult){
        if (bindingResult.hasErrors()) return "AddOffer";
        offerRepository.save(offer);
        return "AddOffer";
    }
	@GetMapping("/Societe/EditOffer")
	public String addOffer(@RequestParam(name = "IDOffer") Long id, Model model){
		Offer offer = offerRepository.findById(id).get() ;
        offerRepository.save(offer);
        return "EditOffer";
    }*/
}
