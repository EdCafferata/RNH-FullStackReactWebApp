package com.novi.rnh;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AisdataControler {

    AisdataRepository aisdatas;

    public AisdataControler(AisdataRepository aisdatas) {
        this.aisdatas = aisdatas;
    }

    //ophalen alle aisdata
    @GetMapping(value="/api/aisdatas/")
    public Iterable<Aisdata> getAisDatas() {
        return aisdatas.findAll();
    }

    //ophalen 1 aisdata
    @GetMapping(value = "/api/aisdatas/{id}")
    public Aisdata getAisData(@PathVariable("id") Long id){
        Optional<Aisdata> _aisdata = aisdatas.findById(id);
        return _aisdata.orElse(null);
    }

    //toevoegen aisdata
    @PostMapping(value = "/api/aisdatas/")
    public Aisdata addAisDatas(@RequestParam("id") Long id){
        Aisdata aisdata = new Aisdata(id);
        return aisdatas.save(aisdata);
    }
}
