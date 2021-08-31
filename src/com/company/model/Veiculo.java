package com.company.model;

public class Veiculo {

    private String modelo;
    private String marca;
    private Double custo;

    public Veiculo(String modelo, String marca, Double custo) {
        this.modelo = modelo;
        this.marca = marca;
        this.custo = custo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }
}