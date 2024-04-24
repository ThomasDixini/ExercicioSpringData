package com.thomasdixini.exercicio_springdata.client_datas.respository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thomasdixini.exercicio_springdata.client_datas.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>{
    List<Client> findBySegmentOrderByName(String segment);
}
