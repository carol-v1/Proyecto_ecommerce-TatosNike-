package com.uam.eCommerceUltimate.repository;

import com.uam.eCommerceUltimate.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository <Person, Integer> {
}
