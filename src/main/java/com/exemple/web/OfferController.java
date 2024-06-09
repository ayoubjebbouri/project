package com.exemple.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exemple.dao.OfferRepository;
import com.exemple.entities.Offer;
import jakarta.validation.Valid;

@Controller
public class OfferController {
	@Autowired
	private OfferRepository offerRepository;
	
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
    }
}
