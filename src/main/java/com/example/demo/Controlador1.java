package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController()
public class Controlador1 {

    @GetMapping("/user/{nombre}")
    public String getUsuario(@PathVariable String nombre){
        return "Hola "+nombre;
    }

    @PostMapping("/useradd")
    public Usuario setUsuario(@RequestBody Usuario u){
        u.setEdad(u.getEdad()+1);
        return u;
    }
}
