package com.example.controller;


import com.example.model.Squadra;
import com.example.service.ISquadraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/squadra")
public class SquadraController {

    @Autowired //<- puoi usare anche @Resource al posto di autowired
    private ISquadraService squadraService;

    @GetMapping("/healthCheck")
    public String healthCheck(){
        return "ok";
    }


    /*
    {
    "nome":"broccoli",
    "colore":"verdi"
    }
     */
    @PostMapping("/saveSquadra")
    public void saveSquadra(
            @RequestBody Squadra squadra){
        squadraService.insertSquadra(squadra);
    }

    @GetMapping(value = "/getSquadra/{idSquadra}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Squadra> getSquadra(
            @PathVariable("idSquadra") int idSquadra) {
        return new ResponseEntity<Squadra>(squadraService.querySqaudra(idSquadra), HttpStatus.OK);
    }


    @GetMapping(value = "/getAllSquadre" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Squadra> getAllSquadre() {
        return squadraService.getAllSquadre();
    }

    @PostMapping(value = "/updateSquadra", produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateSquadra(@RequestBody Squadra squadra){
        squadraService.updateSquadra(squadra);
    }






}
