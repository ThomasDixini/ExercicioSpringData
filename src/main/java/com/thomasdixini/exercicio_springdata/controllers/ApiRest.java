package com.thomasdixini.exercicio_springdata.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thomasdixini.exercicio_springdata.client_datas.Client;
import com.thomasdixini.exercicio_springdata.client_datas.respository.ClientRepository;

@RestController
@RequestMapping(value = "/controllers")
public class ApiRest {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(path="/get")
    public @ResponseBody String getHelloWorld(@RequestParam(required = false) String name) {
        return "Hello World" + name;
    }

    @PostMapping(path="/post")
    public @ResponseBody String createClient(@RequestParam(name = "name") String name,@RequestParam(name = "segment") String segment) {
        if(clientRepository.findByName(name) != null) {
            return "Cliente ja existe";
        }
        
        Client client = new Client();
        client.setName(name);
        client.setSegment(segment);
        clientRepository.save(client);

        return "Criado";
    }

    @GetMapping(path="/getsegments")
    public @ResponseBody List<Client> listClientPerSegment(@RequestParam(name="segment") String segment) {
        return clientRepository.findBySegmentOrderByName(segment);
    }
}
