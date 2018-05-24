/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.sgaspringapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Carlos Lopes
 */
@Controller
public class Texto_ServicosController {
    
    
    @RequestMapping("/textos")
   public String cadastroTexto(){
   
   return "cadastro/textos";
   
   } 
}
