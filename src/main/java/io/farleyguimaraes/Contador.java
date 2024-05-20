package io.farleyguimaraes;

public class Contador {

    public void contar(int firstParameter, int secondParameter) throws ParametrosInvalidosException{
        
        if(!ContadorUtils.isFirstParameterLessThanSecond(firstParameter, secondParameter))
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        else{
            int cont = secondParameter - firstParameter;
            for(int i = 1; i <= cont; i++ ){
                System.out.println("Imprimindo o número " + i);
            }
        }
        
    }

    
}
