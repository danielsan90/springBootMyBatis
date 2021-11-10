package com.example.service;

import com.example.model.Squadra;

import java.util.List;

public interface ISquadraService {
    public void insertSquadra(Squadra squadra);
    public Squadra querySqaudra(int id);
    public List<Squadra> getAllSquadre();
    public void updateSquadra(Squadra squadra);
}
