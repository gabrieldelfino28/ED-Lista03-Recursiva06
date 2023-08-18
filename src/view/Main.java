package view;

import controller.SomaDivFatorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SomaDivFatorial s = new SomaDivFatorial();

        System.out.println("Informe um inteiro.\nUm limite para a série: ");
        int num = in.nextInt();

        double soma= s.FuncSomaFracaoFatorial(num);

        System.out.println(soma);
    }
}
