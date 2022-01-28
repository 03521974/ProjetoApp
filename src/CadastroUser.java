package com.company;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static String CPF;
    private static String Nome;
    private static String Cidade;
    private static String Rua;
    private static int Cep;

    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);

        do{
            System.out.println("Digite seu CPF: ");
            CPF = leitura.nextLine();
        }while (CPF.length() < 11 || CPF.length()>=12);

        do {
            System.out.println("Digite seu nome: ");
            Nome = leitura.nextLine();
        }while(Nome.length() < 6|| Nome.length() > 30);

        do {
            System.out.println("Digite o nome da sua cidade: ");
            Cidade = leitura.nextLine();
        }while(Cidade.length() < 6|| Cidade.length() > 50);
        do {
            System.out.println("Digite o nome da Rua: ");
            Rua = leitura.nextLine();
        }while (Rua.length() < 5|| Rua.length() > 50);


        System.out.println("Digite seu Cep: ");
        Cep = leitura.nextInt();


        System.out.println ("\nCPF: " + CPF );
        System.out.println ("Nome: " + Nome );
        System.out.println ("Cidade: " + Cidade);
        System.out.println ("Rua: " + Rua );
        System.out.println ("Cep: " + Cep );

    }
}