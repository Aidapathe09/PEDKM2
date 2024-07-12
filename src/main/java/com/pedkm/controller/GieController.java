package com.pedkm.controller;


import com.pedkm.entities.Gie;
import com.pedkm.service.GieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/gie")
public class GieController {

    private final GieService gieService;

    @Autowired
    public GieController(GieService gieService) {
        this.gieService = gieService;
    }


    @GetMapping
    public String getAllPlateforme(Model model) {
        model.addAttribute("gies", gieService.getAllPlateforme());
        return "gie";
    }

    @GetMapping("/{id}")
    public Optional<Gie> getPlateformeById(@PathVariable Long id) {
        return gieService.getPlateformeById(id);
    }

    @GetMapping("/new")
    public String createStudentForm(Model model) {
        Gie gie = new Gie();
        model.addAttribute("gie", gie);
        return "create_gie";


    }
    @PostMapping
    public String saveStudent(@ModelAttribute("gie") Gie gie) {
        gieService.savePlateforme(gie);
        return"redirect:/gie";
    }
    @PostMapping("/add")
    public Gie savePlateforme(@RequestBody Gie plateforme , Model model) {
        return gieService.savePlateforme(plateforme);
    }

    @DeleteMapping("/{id}")
    public void deletePlateforme(@PathVariable Long id) {
        gieService.deletePlateforme(id);
    }
}


