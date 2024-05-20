package io.farleyguimaraes;

public class Contador {

    public void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        
        if(!ContadorUtils.isValidParametros(primeiroParametro, segundoParametro))
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        else{
            int cont = segundoParametro - primeiroParametro;
            for(int i = 1; i <= cont; i++ ){
                System.out.println("Imprimindo o número " + i);
            }
        }
        
    }

    
}
