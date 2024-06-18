package com.exemple.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.entities.Candidature;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidatureRepository extends JpaRepository<Candidature, Long> {
	Page<Candidature> findByFirstNameContains(String kw, Pageable pageable);
	public Page<Candidature> findByPropertyNameContains(String kw, Pageable pageable);


	List<Candidature> findCandidatureByemail1Equals(String mail);



}
