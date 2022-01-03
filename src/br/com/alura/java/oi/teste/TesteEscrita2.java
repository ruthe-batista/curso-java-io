package br.com.alura.java.oi.teste;

import java.io.*;

public class TesteEscrita2 {

    public static void main(String[] args) throws IOException {



        /*OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);*/

        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod ");
        bw.newLine();
        bw.newLine();
        bw.write("Lorem ipsum dolor sit amet");

        bw.close();
    }
}
