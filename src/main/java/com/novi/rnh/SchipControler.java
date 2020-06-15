package com.novi.rnh;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SchipControler {

    SchipRepository schips;

    public SchipControler(SchipRepository schips) {
        this.schips = schips;
    }

    //ophalen alle schips
    @GetMapping(value="/api/schips/")
    public Iterable<Schip> getSchips() {
        return schips.findAll();
    }

    //ophalen 1 schips
    @GetMapping(value = "/api/schips/{id}")
    public Schip getSchip(@PathVariable("id") Long id){
        Optional<Schip> _schip = schips.findById(id);
        return _schip.orElse(null);
    }

    //toevoegen schips
    @PostMapping(value = "/api/schips/")
    public Schip addSchips(@RequestParam("id") Long id){
        Schip schip = new Schip((long) Math.toIntExact(id));
        return schips.save(schip);
    }
}
