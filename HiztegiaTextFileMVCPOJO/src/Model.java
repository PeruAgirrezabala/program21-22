
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agirrezabala.peru
 */
public class Model {
    public static void main(String[] args) throws IOException {
        terminoakJaso();
    }
   
    
    public static String terminoakJaso() throws IOException{
        String edukia= "";
        BufferedReader inputStream = null;
       

        try {
            inputStream = new BufferedReader(new FileReader("input.csv"));
  

            String l;
            while ((l = inputStream.readLine()) != null) {
                edukia=edukia.concat(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            System.out.println(edukia);
          
        }
        return edukia;
    }

        
        
        
        
    
    public void terminoakGorde(String edukia){
        
    }
    
}

