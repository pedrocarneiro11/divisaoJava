package br.com.dio.exceptions;

import javax.swing.*;

public class divisao {
    public static void main(String[] args) {

        boolean continueLooping = true;
        do {
            String a = JOptionPane.showInputDialog("Numerador: "); // exibe uma janela externa
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                float resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
                JOptionPane.showMessageDialog(null,"Resultado: " + resultado);
                JOptionPane.showMessageDialog(null,"O programa será encerrado..." );
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada invalida! Informe um numero inteiro!!");
                JOptionPane.showMessageDialog(null, "Para encerrar o programa, informe numeros inteiros nos campos a seguir");
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Divisao invalida, denominador deve ser diferente de  zero!!");
            }
            finally {
                System.out.println("Chegou no finally");
            }
        } while(continueLooping);
    }
    public static float dividir(float a, float b) {return a / b ;}
}
