/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj_animali;

/**
 *
 * @author coppolag
 */
public class Cane extends Animale {
    private String taglia; // piccola, media, grande

    public Cane(String nome, int eta, String taglia) {
        super(nome, eta);
        this.taglia = taglia;
    }

    public String getTaglia() {
        return taglia;
    }

    @Override
    public String verso() {
        return "Bau";
    }

    @Override
    public String descrizione() {
        return "Cane: " + getNome() +
               ", Età: " + getEta() +
               ", Taglia: " + taglia +
               ", Verso: " + verso();
    }

    // Metodo specifico
    public void scodinzola() {
        System.out.println(getNome() + " scodinzola felicemente 🐕");
    }
}
