package com.vila.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vila.pet.Pet;
import com.vila.repository.PetRepository;

@Service
public class PetService {

	private final PetRepository petRepository;
	
	@Autowired
	public PetService(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}
	
	public List<Pet> pegarPets() {
		return petRepository.findAll();
	}
	
	public void adicionarNovoPet(Pet pet) {
		petRepository.save(pet);
	}
	
	public void excluirPet(Integer id) {
		petRepository.deleteById(id);
	}
	
	public void editarPet(Pet pet) {
		petRepository.save(pet);
	}
}
