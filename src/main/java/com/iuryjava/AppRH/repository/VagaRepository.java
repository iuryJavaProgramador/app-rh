package com.iuryjava.AppRH.repository;

import com.iuryjava.AppRH.model.Vaga;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VagaRepository extends CrudRepository<Vaga, String> {

    Vaga findByCodigo(long codigo);

    List<Vaga> findByNome(String nome);
}
