package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Conexion;
import com.aluracursos.screenmatch.modelos.Moneda;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nom = scan.nextLine();
        System.out.println("Bienvenido " + nom + " a la herramienta de conversor de monedas");
        System.out.println("Seleccione el tipo de moneda que desee ingresar");
        System.out.println("1- Dolares");
        System.out.println("2- Soles");
        System.out.println("3- Pesos Chilenos");
        System.out.println("4- Pesos Argentinos");
        System.out.println("5- Real Brasileño");
        System.out.println("6- Pesos Colombiano");
        System.out.println("7- Salir");
        int op1 = scan.nextInt();
        System.out.println("Ahora elija a que moneda desea cambiar:");
        System.out.println("1- Dolares");
        System.out.println("2- Soles");
        System.out.println("3- Pesos Chilenos");
        System.out.println("4- Pesos Argentinos");
        System.out.println("5- Real Brasileño");
        System.out.println("6- Pesos Colombiano");
        System.out.println("7- Salir");
        int op2 = scan.nextInt();;

        while (op1 != op2 && op1 >= 1 && op1 <= 7 && op2 >= 1 && op2 <= 7)
        {
            switch (op1)
            {
                case 1:

                    Conexion consulta = new Conexion();
                    Moneda resulta = consulta.consultarCambio("")
            }
        }

    }
}
