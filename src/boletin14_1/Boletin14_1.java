
package boletin14_1;

public class Boletin14_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        temperaturas obx = new temperaturas();
        try{
        obx.ConversorTemperaturaF(80);
        }
        catch(temperaturaerrada e){
            System.out.println(e.toString());
        }
        try{
        obx.ConversorTemperaturaR(80);
        }
        catch(temperaturaerrada e){
            System.out.println(e.toString());
        }
       
        
    }
    
}
