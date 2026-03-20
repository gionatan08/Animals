/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj_animali;

/**
 *
 * @author coppolag
 */
public class Pesce extends Animale {
    private String acqua; // dolce o salata

    public Pesce(String nome, int eta, String acqua) {
        super(nome, eta);
        this.acqua = acqua;
    }

    public String getAcqua() {
        return acqua;
    }

    @Override
    public String verso() {
        return "..."; // i pesci non fanno un vero verso
    }

    @Override
    public String descrizione() {
        return "Pesce: " + getNome() +
               ", Età: " + getEta() +
               ", Acqua: " + acqua +
               ", Verso: " + verso();
    }

    // Metodo specifico
    public void nuota() {
        System.out.println(getNome() + " sta nuotando");
    }
}
