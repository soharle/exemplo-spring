package com.ifet.exemplo.controllers;

import com.ifet.exemplo.repositories.PercursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PercursoController {

    private PercursoRepository percursoRepository;

    @Autowired
    public PercursoController(PercursoRepository percursoRepository) {
        this.percursoRepository = percursoRepository;
    }

    @RequestMapping("/percursos")
    public String getPercurso(Model model){

        model.addAttribute("percursos", percursoRepository.findAll());
        return "percursos";
    }
}
