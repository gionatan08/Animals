/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prj_animali;

/**
 *
 * @author coppolag
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cane cane = new Cane("Fido", 3, "Grande");
        Gatto gatto = new Gatto("Micio", 2, "Siamese");
        Pappagallo pappagallo = new Pappagallo("Pippo", 4, true);
        Pesce pesce = new Pesce("Nemo", 1, "Salata");

        Animale a1 = cane;
        Animale a2 = gatto;
        Animale a3 = pappagallo;
        Animale a4 = pesce;

        System.out.println(a1.verso());
        System.out.println(a2.verso());
        System.out.println(a3.verso());
        System.out.println(a4.verso());

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        cane.scodinzola();
        gatto.faiLeFusa();
        pappagallo.ripetiFrase("Ciao!");
        pesce.nuota();
    }
}
