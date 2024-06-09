package com.exemple.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.entities.Offer;
public interface OfferRepository extends JpaRepository<Offer, Long> {
	Page<Offer> findByTitleContains(String kw, Pageable pageable);
    Page<Offer> findByIDSocieteContains(Long kw, Pageable pageable);

}
