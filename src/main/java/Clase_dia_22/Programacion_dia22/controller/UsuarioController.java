package Clase_dia_22.Programacion_dia22.controller;

import org.springframework.web.bind.annotation.RestController;

import Clase_dia_22.Programacion_dia22.models.Usuario;
import Clase_dia_22.Programacion_dia22.repositoryes.UsurioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UsuarioController {
    @Autowired 
    private UsurioRepository ur;

    @GetMapping("/usuaros")
    public String ListarUsuarios() {
        return ur.findAll().toString();
    }
    
    @GetMapping("/usuaros2")
    public List <Usuario> ListarUsuarios2 () {
        return ur.findAll ();
    }
    
    
    

    @GetMapping("/")
    public String Inicio() {
        return "Hola mundo," + "desde sprin boot";
    }


    

}
