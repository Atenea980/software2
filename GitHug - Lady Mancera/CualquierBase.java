
package cualquier.base;
import javax.swing.*;

/**
 *
 * @author ladum
 */
public class CualquierBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num=0,sit=0;
        String op="",mod="",invertido="";
        do{
           
       op=JOptionPane.showInputDialog(null,"Menu\n1.Numero\n2.Sistema numerico\n3.imprimir\n4.Salir");
        //JOptionPane.showMessageDialog(null, "1.Nombre,\n2.Apellido,\n3.imprimir,\n4.Salir");
        switch(op){
            case "1":
                num=name(num);
                break;
            
                case "2":
                 sit=lastname(sit);
                break;
                
                case "3":
                imprimir(num,sit,mod,invertido);
                break;
                
                case "4":
                System.exit(0);
                break;
                
        }
        }while(op!="4");
    }
     public static int name(int num){
        
       num=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero: "));
       return num;
        
        
        
    }
   public static int lastname(int sit){
    sit=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite una base: "));
    
    return sit;
   }
   
   public static void imprimir(int num, int sit, String mod, String invertido){
       mod="";
       int n=num;
       int modul;
       //String mensaje="";
        /*for(int i=2;i<=16;i++){
    mensaje += ("" + num + " en base "+i+" es "+Integer.toString(num,i)+"\n");
    
                      }
        JOptionPane.showMessageDialog(null, mensaje);*/
       do{
          
          // mod +=num%sit;
           if((num%sit) >= 10){
               
             switch(num%sit){
                 
                 case 10: mod+="A"; break;
                 case 11: mod+="B"; break;
                 case 12: mod+="C"; break;
                 case 13: mod+="D"; break;
                 case 14: mod+="E"; break;
                 case 15: mod+="F"; break;
                 
             }
           
           }else
           {           
               mod+=(num%sit);
           }
            num/=sit;
       System.out.println("\n"+mod);
       
       if (num<sit){
           
           mod+=num;
           System.out.println(mod);
       }
       }while(num>sit);
       
       for(int i = mod.length()-1;i>=0;i--)
           invertido+=mod.charAt(i);
        
        
         
       
        mod = invertido;
        
      
       
        //sum = num2+ num3+ num4+ num5;
         
        //JOptionPane.showInputDialog(null,"La suma de los digitos es: "+sum);
         
        JOptionPane.showMessageDialog(null,"Numero : "+n+" \nBase: "+sit+"\nConvertidor es : "+mod);
   }
}
