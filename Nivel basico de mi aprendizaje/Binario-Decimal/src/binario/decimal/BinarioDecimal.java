package binario.decimal;

import java.util.Scanner;

public class BinarioDecimal {

    public static int decimal(int numero){
        String num=String.valueOf(numero);
        int contador=0,residuo=numero,suma=0,cont;
       //Detecta si el primer numero fue 
       //un 0 ya que este no se contara en la divicion para saber cuantos digitos son 
        if('0' ==  num.charAt(0)){
            contador=1;
        }
        
        //A base de una divicion va contando cuantos digitos tiene el numero
        do {
            contador++;
            if(residuo%10>1){
                residuo=0;
                contador=-1;
            }
            residuo=residuo/10;
            
        } while (residuo>=1);
            
        cont = contador-1;
        
        //Realiza la suma de exponetes de 2 para averiguar el numero en decimal
        for(int i=0;i<contador;i++){    
            if(num.charAt(cont) == '1'){
                suma+=Math.pow(2, i);
            }
            cont--;
        }
        return suma;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        
        int Decimal=0;
        
        System.out.println("Ingresa un numero binario de maximo de 8 digitos: ");
        Decimal=sca.nextInt();
        
        if(decimal(Decimal) !=0){
            System.out.println("El valor decimal es: "+ decimal(Decimal));
        }
        else{
        System.out.println("El numero ingresado no esta en formato binario");
        }
        
        
    }
    
    
}
