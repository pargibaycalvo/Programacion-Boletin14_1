
package boletin14_1;



public class temperaturas {
    private final float valor=80.0f;
    
    public temperaturas(){
    }
    
   
    public float ConversorTemperaturaF(float centi) throws temperaturaerrada{
        if(centi<valor){
            throw new temperaturaerrada ();
        }
        else{
            float Fh= 9.0f/5.0f*centi+32.4f;
            System.out.println("De ºC a ºF :"+Fh);
            return Fh;
        }   
    }
         
    public float ConversorTemperaturaR(float centi) throws temperaturaerrada{
        if(centi<valor){
            throw new temperaturaerrada();
        }
        else{
        float Re= 4.0f/5.0f*centi;
        System.out.println("De ºC a Reamur :"+Re);
        return Re;
        }
    }
        
    
    
    
    
}
