package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Garagem<E> {
    private Integer id;
    public List<E> lista = new ArrayList<>();

    public void adiciona(Integer id, E elemento) {
        lista.add(elemento);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }
}