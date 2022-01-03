package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {


        /*OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);*/

        // BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        // PrintStream ps = new PrintStream(new File("lorem2.txt"));

        PrintStream ps = new PrintStream("lorem2.txt");

        ps.println("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod ");
        ps.println();
        ps.println();
        ps.println();
        ps.println("Lorem ipsum dolor sit amet");

        ps.close();

        System.out.println();
    }
}
