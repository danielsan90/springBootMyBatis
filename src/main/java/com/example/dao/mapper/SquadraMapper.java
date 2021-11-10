package com.example.dao.mapper;

import com.example.model.Squadra;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SquadraMapper {

    void insertSquadra(Squadra squadra);
    Squadra querySquadra(int id);
    List<Squadra> getAllSquadre();
    void updateSquadraById(Squadra squadra);

}
