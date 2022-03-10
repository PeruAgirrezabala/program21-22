/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Hitza {

    private String hitza;
    private String kategoria;
    int erabilitakoAldiak;
    private char[] asmatutakoak;

    public Hitza() {
        hitzBatAukeratu("");
        asmatutakoHasieratu();

    }

    public void setHitza(String hitza) {
        this.hitza = hitza;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public void setErabilitakoAldiak(int erabilitakoAldiak) {
        this.erabilitakoAldiak = erabilitakoAldiak;
    }

    public void setAsmatutakoak(char[] asmatutakoak) {
        this.asmatutakoak = asmatutakoak;
    }

    public String getHitza() {
        return hitza;
    }

    public String getKategoria() {
        return kategoria;
    }

    public int getErabilitakoAldiak() {
        return erabilitakoAldiak;
    }

    public char[] getAsmatutakoak() {
        return asmatutakoak;
    }

    public void hitzBatAukeratu(String kategoria) {
        ArrayList<String> hitz = new ArrayList<String>();
        hitz.add("PINTXOPOTE");
        hitz.add("MELON");
        hitz.add("INMOVIL");
        hitz.add("TUCAN");
        hitz.add("ESTERNOCLEIDOMASTOIDEOA");
        hitz.add("BOLALUMA");
        hitz.add("MINGOTSA");
        hitz.add("AZAFRAIA");
        hitz.add("BOLSA");
        hitz.add("BOTAS");
        hitz.add("ASTRONAUTA");
        hitz.add("JESUCRISTO");

        int ausazkozenbaki = (int) (Math.random() * hitz.size());
        hitza = hitz.get(ausazkozenbaki);
        System.out.println(hitza);

    }

    public void asmatutakoHasieratu() {
        asmatutakoak = new char[hitza.length()];
        char letrak;
        for (int i = 0; i < hitza.length(); i++) {
            asmatutakoak[i] = '-';
        }

    }

    public boolean egiaztatu(char hizkia) {
        boolean aurkitu = false;
        for (int i = 0; i < hitza.length(); i++) {
            if (hizkia == hitza.charAt(i)) {
                aurkitu = true;
                asmatutakoak[i]=hizkia;
            }

        }
        return aurkitu;
    }
}
