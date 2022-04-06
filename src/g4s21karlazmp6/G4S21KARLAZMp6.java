/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21karlazmp6;

import java.util.ArrayList;

/**
 *
 * @author KJS
 */
public class G4S21KARLAZMp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     ArrayList<String> Lista = new ArrayList<String>();
     Lista.add("FERNANDO");
     Lista.add("MONICA");
     Lista.add("ARANCELI");
     Lista.add("FEDERICO");
     Lista.add("ARMANDO");
     
     for(int i=0; i<Lista.size();i++){
     System.out.println("valor en pocision["+i+"] = "+Lista.get(i));
     }
     int a=0;
     for(String cadena : Lista){
     System.out.println("valor de la lista en pocision [" + a + "] = "+ cadena);
     a++;
     }
     a=0;
     Lista.forEach(cadena->{
     System.out.println("valor de la lista " + cadena);
     });
     
     Lista.stream().forEach(cadena ->{
     System.out.println("valor de la lista por medio de stream " + cadena);
     });
    }
    
}
