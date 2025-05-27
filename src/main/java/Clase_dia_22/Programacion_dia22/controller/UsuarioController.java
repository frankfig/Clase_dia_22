package Clase_dia_22.Programacion_dia22.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class UsuarioController {
    @GetMapping("/")
    public String Inicio() {
        return "Hola mundo," + "desde sprin boot";
    }
    

}
