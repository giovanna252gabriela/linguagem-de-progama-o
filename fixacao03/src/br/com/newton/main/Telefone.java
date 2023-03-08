package br.com.newton.main;
import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nome;
        int tel;
        System.out.println( " digite um nome " );
        tel = Integer.parseInt(entrada.nextLine());
       
        System.out.println( " digite o numero de telefone " );
        nome = entrada.nextLine();

        if ( tel > 9 )
            System.out.println( " telefone invalido");
        else
            System.out.println( "valido ");

    }
}
