package com.thoughtworks.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thoughtworks.boot.model.Shipwreck;

//Added JPA and Spring Data JPA for our persistence tiers
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{

}
