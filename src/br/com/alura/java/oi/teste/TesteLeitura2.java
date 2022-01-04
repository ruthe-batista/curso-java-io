package br.com.alura.java.oi.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            Integer agencia = linhaScanner.nextInt();
            Integer numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            Double saldo = linhaScanner.nextDouble();


            String valorFormatado = String.format("%s - %s-%s, %s: %s",
                    tipoConta, agencia, numero, titular, saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();

//           String[] valores =  linha.split(",");
//           System.out.println(valores[3]);
        }

        scanner.close();
    }
}
