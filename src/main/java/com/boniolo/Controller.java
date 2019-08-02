package com.boniolo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Controller
 */
@Api(tags = "Teste", description = "Acesso ao Teste")
@RestController
public class Controller {

    @ApiOperation("Faz blablabla")
    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    public String name() {
        return "ok";
    }
}