package br.com.shiaku;

import model.Solicitacoes;
import Service.Rota;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a data no formato 'YYMMDD': ");
        String data = scanner.nextLine();

        Rota rota = new Rota();
        try {
            Solicitacoes solicitacoes = rota.getSolicitacoes(data);


            System.out.println("Título: " + solicitacoes.getTitle());
            System.out.println("Data: " + solicitacoes.getDate());
            System.out.println("Explicação: " + solicitacoes.getExplanation());
            System.out.println("URL da Imagem em Alta Resolução: " + solicitacoes.getHdurl());


            System.out.println("Abrindo a imagem em um navegador...");
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(solicitacoes.getHdurl()));
        } catch (IOException e) {
            System.err.println("Erro ao obter as informações da APOD: " + e.getMessage());
        }
    }
}