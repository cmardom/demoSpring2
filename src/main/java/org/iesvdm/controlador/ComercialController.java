package org.iesvdm.controlador;

import org.iesvdm.modelo.Comercial;
import org.iesvdm.service.ComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Controller
public class ComercialController {

    @Autowired
    private ComercialService comercialService;

    //@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired 
    public ComercialController (ComercialService comercialService) {this.comercialService = comercialService;}

    @GetMapping("/comerciales")
    public String listar (Model model){
        List<Comercial> listacomerciales = comercialService.listAll();
        model.addAttribute("listaComerciales", listacomerciales);
        return "comerciales";
    }


}
