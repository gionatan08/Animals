/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj_animali;

/**
 *
 * @author coppolag
 */
public class Gatto extends Animale {
    private String razza;

    public Gatto(String nome, int eta, String razza) {
        super(nome, eta);
        this.razza = razza;
    }

    public String getRazza() {
        return razza;
    }

    @Override
    public String verso() {
        return "Miao";
    }

    @Override
    public String descrizione() {
        return "Gatto: " + getNome() +
               ", Età: " + getEta() +
               ", Razza: " + razza +
               ", Verso: " + verso();
    }

    // Metodo specifico
    public void faiLeFusa() {
        System.out.println(getNome() + " fa le fusa ");
    }
}
