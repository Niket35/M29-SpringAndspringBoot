package org.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.tnsif.placementmanagement.entities.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Integer>{

}