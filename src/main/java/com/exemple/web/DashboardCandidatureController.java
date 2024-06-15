package com.exemple.web;

import com.exemple.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DashboardCandidatureController {
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
}
