package com.ifet.exemplo.controllers;

import com.ifet.exemplo.repositories.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController
{
    private EventoRepository eventoRepository;

    @Autowired
    public EventoController(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @RequestMapping("/eventos")
    public String getEventos(Model model){

        model.addAttribute("eventos", eventoRepository.findAll());
        return "eventos";
    }
}
