/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pkg1.Model;
import pkg1.View;

public class Controller implements ActionListener {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        gehituActionListener(this);
    }

    private void gehituActionListener(ActionListener listener) {
        //GUIaren konponente guztiei gehitu listenerra
        view.jButtonTxertatu.addActionListener(listener);
        view.jButtonInprimatu.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        //listenerrak entzun dezakeen eragiketa bakoitzeko. Konponenteek 'actionCommad' propietatea daukate
        switch (actionCommand) {
            case "TXERTATU":
                System.out.println("TXERTATU botoia sakatu duzu");
                Terminoa t = new Terminoa(0,(view.jTextFieldEuskaraz.getText()).toLowerCase(),(view.jTextFieldGazteleraz.getText()).toLowerCase());
                int emaitza= model.terminoaGehitu(t);
                switch(emaitza){
                   case 0:
                        view.jLabelMezua.setText("Terminoa jada datu basean");
                   break;
                   case 1:
                        view.jLabelMezua.setText("Terminoa txertatuta izan da");
                   break;
                   default:
                        view.jLabelMezua.setText("Datu basearekin arremanetan jartzeko arazoa");
                        break;
                    
                
        }
                break;
            case "INPRIMATU":
                System.out.println("INPRIMATU botoia sakatu duzu");
                model.terminoakInprimatu();
                break;
        }
    }
}
