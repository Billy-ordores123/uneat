import java.text.DecimalFormat;
import java.util.Scanner;
public class matrices {
    public static void main(String[] args) {
      
        int i=0;
        int y= 5;
        int position=00;
        int uno=0;
        int position2= (int) (Math.random()*21);
        //impresion de las columnas del 00-21;
        Scanner scanner = new Scanner(System.in);
        String entrada  ="";
        do{
            entrada  = scanner.nextLine();
            System.out.println(entrada);
            for( i=0; i<21;i++){
                int z=20-i;
                DecimalFormat df = new DecimalFormat("00"); //esto es el formato para que ponga 01, 02, 03, cambiando el 1, 2, 3
                

                System.out.print(df.format(z) +">");//aqui se imprime el formato
                for(int j=0; j<4; j++){//esto es para imprimir los ascensores
                    
                    if(z==position){
                        System.out.print("  p=0000   "); //imagen del ascensor
                    }else{
                        System.out.print(" | .''. |  ");
                    }
                   //este es el math random
                }
               //esta es una opcion para que el math random, solo se repita una vez, que es una opcion que indica el piso donde ira el ascensor
                if(z==position2){
                    int x=y;
                    System.out.println("<"+ x +">");
                }else{
                    System.out.println("<0>");
                }
               
            }
            uno=uno-uno;
        }
         while(!entrada.equals("s")); //tecla s para salir del bucle
            System.out.println("SE PRESIONÓ LA TECLA ENTER");
        


    }
    
}
/** problemas, mantener el math random fijo,
hacer que los ascensores se muevan;
ver el tiempo 
**/
