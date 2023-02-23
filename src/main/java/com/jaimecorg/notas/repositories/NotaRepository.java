package com.jaimecorg.notas.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaimecorg.notas.models.Nota;

public interface NotaRepository extends JpaRepository<Nota, Integer>{
    List<Nota> findByTituloContainingAndFechaGreaterThan(String titulo, Date fecha);

}
