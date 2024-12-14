package org.gabriel.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller           //Além de um Bean gerenciado pelo Spring é um controlador do MVC
public class HomeController {

    @ResponseBody           // Retorna a resposta no corpo
    @RequestMapping("/home")    //Endpoint
    public String greet(){
        return "Hello World Spring!";
    }


    @ResponseBody
    @RequestMapping("/about")
    public String about(){
        return "About";
    }
}
