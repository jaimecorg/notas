package com.jaimecorg.notas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaimecorg.notas.models.Nota;

public interface NotaRepository extends JpaRepository<Nota, Integer>{
    
}
