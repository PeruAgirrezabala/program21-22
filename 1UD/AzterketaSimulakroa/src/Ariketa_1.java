
import java.util.Scanner;

/*Programa hau exekutatzerakoan, erabiltzaileari zenbaki oso positibo bat
eskatuko zaio. Eskaria errepikatu egingo da zenbakia 0 edo txikiagoa bada.
Zenbakia positiboa bada, handia edo txikia den eta bikoitia edo bakoitia den
aztertuta, mezu batekin erantzungo du

/**
 *
 * @author agirrezabala.peru
 */
public class Ariketa_1 {

    public static void main(String[] args) {
        int zenbakia;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        zenbakia = in.nextInt();
        if (zenbakia >= 0) {
            if (zenbakia >= 100) {
                if (zenbakia % 2 == 0) {
                    System.out.println("Sartutako balio haundia bikoitia da");
                } else {
                    System.out.println("Sartutako balio haundia bakoitia da");

                }
            }else{
                if (zenbakia % 2 == 0) {
                    System.out.println("Sartutako balio txikia bikoitia da");
                } else {
                    System.out.println("Sartutako balio txikia bakoitia da");

                }
                
            }

        } else {
            System.out.println("invalid value");
        }

    }
}
