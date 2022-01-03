package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivo

        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        System.out.println(linha);

        br.close();
    }
}
