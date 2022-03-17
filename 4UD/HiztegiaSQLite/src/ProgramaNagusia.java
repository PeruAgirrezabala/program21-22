
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author agirrezabala.peru
 */
public class ProgramaNagusia {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int op1 = 0;

        do {

            System.out.println("1 - DELETE");
            System.out.println("2 - INSERT");
            System.out.println("3 - SELECT");
            System.out.println("4 - UPDATE");
            System.out.println("5 - FIN");

            op1 = Integer.parseInt(teclado.next());

            switch (op1) {
                case 1:
                    System.out.println("Sartu ezabatu nahi dzun erregistroaren zenbakia");
                    int x = Integer.parseInt(teclado.next());
                    DeleteApp app = new DeleteApp();
                    // delete the row with id 3
                    app.delete(x);
                    break;

                case 2:
                    int a = Integer.parseInt(teclado.next());
                    String euskaraz,
                     gazteleraz;
                    euskaraz = teclado.next();
                    gazteleraz = teclado.next();
                    InsertApp app1 = new InsertApp();
                    // insert three new rows
                    app1.insert(3, "aitona", "abuelo");

                    break;
                case 3:
                    SelectApp app2 = new SelectApp();
                    app2.selectAll();

                    break;
                case 4:
                    UpdateApp app3 = new UpdateApp();
                    // update the warehouse with id 3
                    app3.update(3, "Ordenagailua", "Ordenador");

                    break;

            }

        } while (op1 != 5);
    }
}
