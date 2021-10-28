package com.vila.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.vila.pet.Pet;
import com.vila.service.PetService;

@RestController
@RequestMapping(path = "/pet")
public class PetController {

	private PetService petService;
	
	@Autowired
	public PetController(PetService petService) {
		super();
		this.petService = petService;
	}
	
	@GetMapping
	public List<Pet> pegarPets() {
		return petService.pegarPets();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void registrarPet(@RequestBody Pet pet) {
		petService.adicionarNovoPet(pet);
	}
	
	@DeleteMapping
	public void excluirPet(@PathVariable("id") Integer id) {
		petService.excluirPet(id);
	}
	
	@PutMapping
	public void editarPet(@RequestBody Pet pet) {
		petService.editarPet(pet);
	}
	
}
