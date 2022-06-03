
import pkg1.Model;
import pkg1.Terminoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agirrezabala.peru
 */
public class TestTerminoakArrayra {
    public static void main(String[] args) {
        Model model = new Model();
        Terminoa[] terminoak=model.terminoakArrayra();
        for (int i = 0; i < model.terminoakArrayra().length; i++)
            System.out.println("Elemento en " + i + " : " +terminoak[i].Terminoa.id +" "+ terminoak[i].euskaraz+" "+terminoak[i].gazteleraz);
            
        }
    }
    
