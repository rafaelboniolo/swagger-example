package com.boniolo.controller;

import com.boniolo.model.Pessoa;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Controller
 */
@Api(tags = "Controlador de pessoas", description = "Acesso ao Teste")
@RestController
public class Controller {

    @ApiOperation("Buscar pessoas")
    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    public Pessoa name(@RequestBody Pessoa pessoa) {
        return new Pessoa();
    }
}