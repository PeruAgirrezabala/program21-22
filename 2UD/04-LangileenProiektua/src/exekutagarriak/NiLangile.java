/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Langilea;

/**
 *
 * @author agirrezabala.peru
 */
public class NiLangile {
    public static void main(String[] args) {
           Langilea langilea1= new Langilea(1, "Peru", "Agirrezabala",600); 
           System.out.println(langilea1.toString());
           System.out.println(langilea1.getUrtekoSoldata());
           langilea1.soldataIgo(50);
           System.out.println(langilea1.toString());
           
           

    }  
}
