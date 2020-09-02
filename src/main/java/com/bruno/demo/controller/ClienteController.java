package com.bruno.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @GetMapping("/cliente")
    public String getClientes(){
        return "Vai retorna todos os clientes do BD!";
    }
    
    @GetMapping("/cliente/{codigo}")
    public String getCliente(@PathVariable int codigo){
        return "Vai retorna usuário - "+codigo;
    }
}