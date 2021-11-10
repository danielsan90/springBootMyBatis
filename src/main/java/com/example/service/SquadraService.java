package com.example.service;

import com.example.dao.mapper.SquadraMapper;
import com.example.model.Squadra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SquadraService implements ISquadraService{

    @Autowired //<- puoi usarte anche resource
    private SquadraMapper squadraMapper;


    @Override
    public void insertSquadra(Squadra squadra) {
        squadraMapper.insertSquadra(squadra);
    }

    @Override
    public Squadra querySqaudra(int id) {
        return squadraMapper.querySquadra(id);
    }

    @Override
    public List<Squadra> getAllSquadre() {
        return squadraMapper.getAllSquadre();
    }

    @Override
    public void updateSquadra(Squadra squadra) {
        squadraMapper.updateSquadraById(squadra);
    }


}
