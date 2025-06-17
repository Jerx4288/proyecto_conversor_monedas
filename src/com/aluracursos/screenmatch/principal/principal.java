package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Conexion;
import com.aluracursos.screenmatch.modelos.Moneda;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op1, op2;

        String[] monedas = {"USD", "PEN", "CLP", "ARS", "BRL", "COP"};

        System.out.print("Ingrese su nombre: ");
        String nom = scan.nextLine();
        System.out.println("Bienvenido " + nom + " a la herramienta de conversor de monedas");
        System.out.println("******************************************************************");
        do {
            System.out.println("Seleccione el tipo de moneda de origen:");
            for (int i = 0; i < monedas.length; i++) {
                System.out.println((i + 1) + "- " + obtenerNombreMoneda(monedas[i]));
            }
            System.out.println("7- Salir");
            System.out.print("Opción: ");
            op1 = scan.nextInt();

            if (op1 == 7) break;

            System.out.println("Seleccione el tipo de moneda a cambiar:");
            for (int i = 0; i < monedas.length; i++) {
                System.out.println((i + 1) + "- " + obtenerNombreMoneda(monedas[i]));
            }
            System.out.println("7- Salir");
            System.out.print("Opción: ");
            op2 = scan.nextInt();

            if (op2 == 7) break;

            if (op1 == op2) {
                System.out.println("Elegiste el mismo tipo de moneda. Selecciona monedas distintas.");
            }

            System.out.print("Ingrese el monto: ");
            double monto = scan.nextDouble();

            String base = monedas[op1 - 1];
            String destino = monedas[op2 - 1];

            Conexion conexion = new Conexion();
            Moneda resultado = conexion.consultarCambio(base, destino, monto);

            if (resultado != null) {
                System.out.println("Resultado: " + resultado);
            }
            System.out.println("*****************************************************************");


        } while (op1 >= 1 && op1 <= 6 && op2 >= 1 && op2 <= 6);

        System.out.println("Gracias por usar el conversor de monedas =)");
    }

    public static String obtenerNombreMoneda(String codigo) {
        return switch (codigo) {
            case "USD" -> "Dólares";
            case "PEN" -> "Soles";
            case "CLP" -> "Pesos Chilenos";
            case "ARS" -> "Pesos Argentinos";
            case "BRL" -> "Reales Brasileños";
            case "COP" -> "Pesos Colombianos";
            default -> "Moneda desconocida";
        };
    }
}
