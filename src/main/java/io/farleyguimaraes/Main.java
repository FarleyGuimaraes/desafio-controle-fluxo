package io.farleyguimaraes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        boolean entradasValidas = false;
        
        while (!entradasValidas) {
            
            try {
                System.out.println("Primeiro parâmetro: ");
                int primeiroParametro = scanner.nextInt();
                
                System.out.println("Segundo parâmetro: ");
                int segundoParametro = scanner.nextInt();
                
                Contador contador = new Contador();
    
                contador.contar(primeiroParametro, segundoParametro);

                entradasValidas = true;
                
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: "+ e.getMessage());
            } catch (InputMismatchException  e){
                System.out.println("Erro: Insira apenas números inteiros.");
                scanner.next(); 
            } 
        }
        scanner.close();
        
    }
}