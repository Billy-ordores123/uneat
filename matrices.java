import java.text.DecimalFormat;
public class matrices {
    public static void main(String[] args) {
        int i=0;
        int y =0;
        int position=00;
        int uno=0;
        int position2= (int) (Math.random()*21);
        for( i=0; i<21;i++){
            int z=20-i;
            DecimalFormat df = new DecimalFormat("00");
            
            System.out.print(df.format(z) +">");
            for(int j=0; j<4; j++){
                
                if(z==position){
                    System.out.print("  p=0000   "); 
                }else{
                    System.out.print(" | .''. |  ");
                }
                y= (int) (Math.random()*21);
            }
           
            if(z==position2){
                if(uno ==0){
                    y= (int) (Math.random()*21);
                    uno=uno+1;
                }else {
                    y=0;
                }
                System.out.println("<"+ y +">");
            }else{
                System.out.println("<0>");
            }
           
        }
        uno=uno-uno;


    }
    
}