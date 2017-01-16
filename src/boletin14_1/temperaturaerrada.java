
package boletin14_1;

public class temperaturaerrada extends Exception{
    public temperaturaerrada(){
        super("Error, grados igual o superior a 80ºC");
    }
    public temperaturaerrada(String s){
        super(s);
    }
     
    }
    
    
