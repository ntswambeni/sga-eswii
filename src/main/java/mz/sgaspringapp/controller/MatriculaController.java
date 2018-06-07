/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mz.sgaspringapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Carlos Lopes
 */
public class MatriculaController {
  @RequestMapping( value = "/Matricula")
	public String cadastroClasse() {
		return "cadastro/Matricula";
	}  
}
