package org.iesvdm.service;

import org.iesvdm.dao.ComercialDAO;
import org.iesvdm.modelo.Comercial;

import java.util.List;

public class ComercialService {

    private ComercialDAO comercialDAO;

    public ComercialService (ComercialDAO comercialDAO) {this.comercialDAO = comercialDAO;}

    public List<Comercial> listAll(){
        return comercialDAO.getAll();
    }
}
