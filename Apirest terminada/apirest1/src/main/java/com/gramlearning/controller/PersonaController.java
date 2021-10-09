package com.gramlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gramlearning.model.Persona;
import com.gramlearning.repository.PersonaRepository;

@RestController
@RequestMapping("/api")
public class PersonaController {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	//Listar todas las personas
	@GetMapping("/personas")
	public List<Persona> allPersonas(){
		return personaRepository.findAll();
		
	}
	
	//Encontrar por nombre
	@GetMapping("/persona/{nombre}")
	public List<Persona> findByNombre(@PathVariable("nombre") String nombre){
		return personaRepository.findByNombre(nombre);
		
	}
	
	//Crear persona
	@PostMapping("/persona")
	public Persona crearPersona(@RequestBody Persona persona){
		return personaRepository.save(persona);
		
	}
	
	//Actualizar persona por ID
	@PutMapping("/persona/{id}")
	public Persona actualizarPersona(@PathVariable Long id, @RequestBody Persona persona){
		return personaRepository.save(persona);
		
	}
	
	//Borrar persona
	@DeleteMapping("/persona/{id}")
	public void borrarPersona(@PathVariable("id") Long id){
		personaRepository.deleteById(id);
		
	}
}
