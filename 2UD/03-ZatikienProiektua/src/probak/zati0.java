/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probak;

/**
 *
 * @author agirrezabala.peru
 */
public class zati0 {
    public static void main(String[] args) {
        System.out.println("16/8="+16/8);
        try{
             System.out.println("16/0="+16/0);
        }catch (ArithmeticException ex){
            System.out.println("ezdakit 0 zenbakiarekin zatitzen");
        }
        //int/int=int, beraz, bietako bat double bihurtu beharko genuke
        System.out.println("7/8= "+(double)7/8);
    }
    
}
