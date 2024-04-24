package com.thomasdixini.exercicio_springdata.client_datas.respository;

import org.springframework.data.repository.CrudRepository;

import com.thomasdixini.exercicio_springdata.client_datas.Client;

public interface ClientRepository extends CrudRepository<Client, Integer>{
    Client findBySegmentOrderByName(String segment);
}
