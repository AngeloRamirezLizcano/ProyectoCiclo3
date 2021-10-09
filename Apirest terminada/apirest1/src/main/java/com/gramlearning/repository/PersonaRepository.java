package com.gramlearning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gramlearning.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	List<Persona> findByNombre(@Param("nombre") String nombre);
}
