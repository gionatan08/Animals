/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj_animali;

/**
 *
 * @author coppolag
 */
import java.util.ArrayList;

public class GestioneNegozio {
    private ArrayList<Animale> animali;

    public GestioneNegozio() {
        animali = new ArrayList<>();
    }

    public void aggiungiAnimale(Animale a) {
        animali.add(a);
    }

    public void rimuoviAnimale(String nome) {
    for (int i = 0; i < animali.size(); i++) {
        if (animali.get(i).getNome().equals(nome)) {
            animali.remove(i);
            break; 
        }
    }
}

    public Animale cercaPerNome(String nome) {
        for (Animale a : animali) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    public void stampaAnimali() {
        for (Animale a : animali) {
            System.out.println(a);
        }
    }

    public int contaAnimali() {
        return animali.size();
    }
}
