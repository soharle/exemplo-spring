package com.ifet.exemplo.repositories;

import com.ifet.exemplo.model.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, Long> {

}
