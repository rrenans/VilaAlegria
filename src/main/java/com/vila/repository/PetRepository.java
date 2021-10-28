package com.vila.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vila.pet.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
	Optional<Pet>findPetByNome(String nome);
}
