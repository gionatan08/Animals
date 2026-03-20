/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj_animali;

/**
 *
 * @author coppolag
 */

    public abstract class Animale {
    private String nome;
    private int eta;

    // Costruttore
    public Animale(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    // Metodi astratti
    public abstract String verso();
    public abstract String descrizione();

    // Metodo concreto
    @Override
    public String toString() {
        return descrizione();
    }
}

