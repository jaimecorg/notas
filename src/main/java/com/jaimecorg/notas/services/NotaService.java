package com.jaimecorg.notas.services;

import java.util.Date;
import java.util.List;

import com.jaimecorg.notas.models.Nota;

public interface NotaService {
    public List<Nota> findAll();
    public Nota findById(int id);
    public Nota save(Nota nota);
    public void update(int id, Nota nota);
    public void deleteById(int id);
    public void deleteAll();
    public List<Nota> findByTituloYFecha(String titulo, Date fecha);
}
