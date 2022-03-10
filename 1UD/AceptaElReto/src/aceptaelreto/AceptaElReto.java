import java.util.Arrays;
import java.util.Scanner;

public class KaprekarOne {
    public static void main(String[] args){
        Integer kapre=6174;
        System.out.println("Por favor ingrese 4 números diferentes uno por uno:");
        int[] intArr=new int[4];
        for(int i = 0; i < 4; i++){
            Scanner inputW = new Scanner(System.in);
            intArr[i]=inputW.nextInt();
        }
        System.out.println("*******************************");
        for (int i=1;i<9;i++){
            int kap=kaprekar(intArr);
            if(Integer.valueOf(kap).equals(kapre)){
                System.out.println("Sección"+i+"¡Aparece la constante 6174 del paso Kaprekar!");
                break;
            }
            intArr=intToArray(kap);
        }


    }
    // Calcula el valor
    static int kaprekar(int[] arrayInt) {
        // Calcula los cuatro dígitos más pequeños
        // Matriz ascendente
        Arrays.sort(arrayInt);
        String strIntMini="";
        for (int num : arrayInt) {
            strIntMini=strIntMini+Integer.toString(num);
        }
        int intMini=Integer.parseInt(strIntMini);
        System.out.println("Los 4 dígitos más pequeños son:"+intMini);
        // Calcula los cuatro dígitos más grandes
        // Matriz descendente
        int sizeArray=arrayInt.length;
        int[] newArrayInt=new int[sizeArray];
        newArrayInt=arrayIntDesc(arrayInt);
        String strIntMax="";
        for (int num : newArrayInt) {
            strIntMax=strIntMax+Integer.toString(num);
        }
        int intMax=Integer.parseInt(strIntMax);
        System.out.println("Los 4 dígitos más grandes son:"+intMax);
        int kap=intMax-intMini;
        System.out.println("Resta dos números en:"+intMax+"-"+intMini+"="+kap);
        System.out.println("*******************************");
        return kap;
    }
    // Matriz descendente
    static int[] arrayIntDesc(int[] arrayInt){
        int sizeArray=arrayInt.length;
        int[] newArrayInt=new int[sizeArray];
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            newArrayInt[sizeArray-1-i]=arrayInt[i];
        }
        return newArrayInt;
    }
    // Número a matriz
    static int[]intToArray(int num){
        String sNum=Integer.toString(num);
        int lNum=sNum.length();
        int[] arrayInt=new int[lNum];
        for (int i=0;i<lNum;i++){
            arrayInt[i]=Integer.parseInt(sNum.substring(i,i+1));
        }
        return arrayInt;
    }

}



