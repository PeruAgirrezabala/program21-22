
import enumak.Demarkazioa;
import java.util.ArrayList;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;



/** Programa honetan Euskal Selekzioko datuekin egingo dugu lan.
 *  Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *  
 * 
 */
public class EuskalSelekzioa {
    
    public static int azkenId = 0; 
     public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();
    
    /** Programa honek metodo desberdinei deituko die banan banan. 
     *  Beharbada ez diozu koherentzia handirik topatuko programa osoari. 
     *  Ariketaren helburua da beste pakete bateko klase hierarkia erabiltzen trebatzea. 
     *   
     */
    public static void main(String[] args) {
        
        futbolariBat(azkenId);
        
        bestePartaideBatzukSortu(azkenId);
        selekzioOsoaSortu(azkenId);
        int ezabatzekoIda = 4;
        if (partaideaEzabatu(ezabatzekoIda)){
            System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
        }
    }
    
    
    /** Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta formatu honetan inprimatzen du:    
     *  "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11, demarcacion=DEL}"
     *  Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu.
     *  Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu. 
     *  Horretarako, kontadore bat (Adibidez, azkenIda izeneko klase atributu bat) erabili dezakezu 
     *  partaide bat sortzen den bakoitzean handituko dena. 
     *  Amaitzeko, Villalibre entrenatzen hasiko da.
    */
    public static void futbolariBat(int id){
        Futbolista f1= new Futbolista(azkenId++, "Asier","Villalibre",23,11, Demarkazioa.DEL);
        
                
        
    }
    
    /** Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak: 
     * - Javier Clemente
     * - Iñaki Sertxiberrieta
     * - Ander Etxeburu
     * Zein klaseko objektua izan behar du bakoitzak?
     * 
     * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta bidaiatuko dute
     */
    public static void bestePartaideBatzukSortu(int id){
        Entrenador e1= new Entrenador(azkenId++, "Javier","Clemente",71,"RFEF");
        Masajista m1= new Masajista(azkenId++, "Iñaki","Sertxiberrieta",21,"Fisioterapia",3);
        Masajista m2= new Masajista(azkenId++, "Ander","Etxeburu",22,"Medikoa",5);
        
        
    }
    
    
    /** Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion klaseko 
     * ArrayList estatiko baten.
     *  
     * @param id
     */
    public static void selekzioOsoaSortu(int id){
        
        selekzioa.add(new Futbolista(azkenId++,"Aitor","Fernandez",30,1,Demarkazioa.POR));
        selekzioa.add(new Futbolista(azkenId++,"Unai","Bustinza",30,2,Demarkazioa.DEF));
        selekzioa.add(new Futbolista(azkenId++,"Mikel","Balenziaga",33,3,Demarkazioa.DEF));
        selekzioa.add(new Futbolista(azkenId++,"Asier","Illarramendi",31,4,Demarkazioa.MED));
        selekzioa.add(new Futbolista(azkenId++,"Iñigo","Martinez",30,5,Demarkazioa.DEF));
        selekzioa.add(new Futbolista(azkenId++,"Mikel","San Jose",32,6,Demarkazioa.MED));
        selekzioa.add(new Futbolista(azkenId++,"Gaizka","Larrazabal",24,7,Demarkazioa.DEF));
        selekzioa.add(new Futbolista(azkenId++,"Manu","Garcia",35,8,Demarkazioa.MED));
        selekzioa.add(new Futbolista(azkenId++,"Aritz","Aduriz",40,9,Demarkazioa.DEL));
        selekzioa.add(new Futbolista(azkenId++,"Javier","Eraso",31,10,Demarkazioa.MED));
        selekzioa.add(new Futbolista(azkenId++,"Asier","Villalibre",24,11,Demarkazioa.DEL));
        selekzioa.add(new Futbolista(azkenId++,"Ahien","Muñoz",24,12,Demarkazioa.DEF));
        selekzioa.add(new Futbolista(azkenId++,"Iago","Herrerin",34,13,Demarkazioa.POR));
        selekzioa.add(new Futbolista(azkenId++,"Aritz","Elustondo",27,14,Demarkazioa.DEF));
        selekzioa.add(new Futbolista(azkenId++,"Jesus","Areso",22,15,Demarkazioa.DEF));
        selekzioa.add(new Futbolista(azkenId++,"Iñigo","Vicente",24,16,Demarkazioa.DEL));
        selekzioa.add(new Futbolista(azkenId++,"Daniel","Vivian",22,17,Demarkazioa.DEF));
        selekzioa.add(new Entrenador(azkenId++, "Francisco","Padalino",49,"RFEF"));
        selekzioa.add(new Entrenador(azkenId++, "Joseba","Nuñez",55,"RFEF"));
        selekzioa.add(new Entrenador(azkenId++, "Markel","Lautahandia",64,"RFEF"));
        selekzioa.add(new Masajista(azkenId++, "Iñaki","Sertxiberrieta",21,"Fisioterapia",3));
        selekzioa.add(new Masajista(azkenId++, "Ander","Etxeburu",22,"Medikoa",5));
        
        
        
        
    
    }
    
    /** ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
     * 
     * @param id Ezabatu nahi den partaidearen ida
     * @return 
     */
    public static boolean partaideaEzabatu(int id){
        
        selekzioa.remove(ezabatzekoIda);
        
        return false;
    }
}
