package com.ifet.exemplo.bootstrap;

import com.ifet.exemplo.model.Evento;
import com.ifet.exemplo.model.Percurso;
import com.ifet.exemplo.repositories.EventoRepository;
import com.ifet.exemplo.repositories.PercursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private EventoRepository eventoRepository;
    private PercursoRepository percursoRepository;

    @Autowired
    public DevBootstrap(EventoRepository eventoRepository, PercursoRepository percursoRepository) {
        this.eventoRepository = eventoRepository;
        this.percursoRepository = percursoRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        initData();
    }

    private void initData() {

        //Eventos
        Evento sol = new Evento("Corrida do Sol", 30f);
        Percurso longa = new Percurso("Perna Longa", 8f, sol);
        Percurso curta = new Percurso("Perna Curta", 3.5f, sol);

        sol.getPercursos().add(longa);
        sol.getPercursos().add(curta);

        eventoRepository.save(sol);
        percursoRepository.save(longa);
        percursoRepository.save(curta);


        Evento lua = new Evento("Corrida da Lua", 25f);
        Percurso filho = new Percurso("Filhos de Ariel", 6.4f, lua);
        Percurso sons = new Percurso("Ariel's sons", 5.2f, lua);

        lua.getPercursos().add(filho);
        lua.getPercursos().add(sons);

        eventoRepository.save(lua);
        percursoRepository.save(filho);
        percursoRepository.save(sons);
    }
}
