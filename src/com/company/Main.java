package com.company;

import com.company.model.Garagem;
import com.company.model.Veiculo;

public class Main {

    public static void main(String[] args) {

        Garagem<Veiculo> veiculos = new Garagem<>();
        veiculos.adiciona(1, new Veiculo(" Fiesta", " ford", 1000d));
        veiculos.adiciona(2, new Veiculo(" Focus", " ford", 1200d));
        veiculos.adiciona(3, new Veiculo(" Explorer", " ford", 2500d));
        veiculos.adiciona(4, new Veiculo(" Uno", " Fiat", 50d));
        veiculos.adiciona(5, new Veiculo(" Cronos", " Fiat", 1000d));
        veiculos.adiciona(6, new Veiculo(" Torino", " Fiat", 1200d));
        veiculos.adiciona(7, new Veiculo(" Aveo", " Chevrolet", 1250d));
        veiculos.adiciona(8, new Veiculo(" Spin", " Chevrolet", 2500d));
        veiculos.adiciona(9, new Veiculo(" Corola", " Toyota", 1200d));
        veiculos.adiciona(10, new Veiculo(" Fortuner", " Toyota", 3000d));
        veiculos.adiciona(11, new Veiculo(" Logan", " Renault", 950d));

        System.out.println("-----------Lista Ordenada por Custo (Menor para Maior------------)");
        veiculos.getLista().stream()
                .sorted((v1, v2) -> v1.getCusto().compareTo(v2.getCusto()))
                .forEach((v) -> System.out.println("Marca:" + v.getMarca() + " Custo: " + v.getCusto()));

        System.out.println("\n-----------Lista Ordenada por Marca e Custo ------------)");
        veiculos.getLista().stream()
                .sorted((v1, v2) -> (v1.getMarca() + v1.getCusto().toString()).compareTo((v2.getMarca() + "0" + v2.getCusto().toString())))
                .forEach((v) -> System.out.println("Marca:" + v.getMarca() + " Custo: " + v.getCusto()));

        System.out.println("\n-----------Lista Menor que 1000 ------------)");
        veiculos.getLista().stream()
                .filter(v1 -> v1.getCusto() < 1000)
                .forEach((v) -> System.out.println("Marca:" + v.getMarca() + " Custo: " + v.getCusto()));

        System.out.println("\n-----------Lista Maior que 1000 ------------)");
        veiculos.getLista().stream()
                .filter(v1 -> v1.getCusto() > 1000)
                .forEach((v) -> System.out.println("Marca:" + v.getMarca() + " Custo: " + v.getCusto()));

        System.out.println("\n-----------Média do custo ------------)");
        Double media = (veiculos.getLista().stream()
                .map(s -> s.getCusto())
                .reduce(0d, (a, b) -> a + b)) / veiculos.getLista().size();
        ;

        System.out.printf("%.2f", media);

    }
}