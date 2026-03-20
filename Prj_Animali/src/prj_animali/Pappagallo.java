/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prj_animali;

/**
 *
 * @author coppolag
 */
public class Pappagallo extends Animale {
    private boolean parla;
    
    public Pappagallo(String nome, int eta, boolean parla) {
        super(nome, eta);
        this.parla = parla;
}

    public boolean isParla() {
        return parla;
    }

    @Override
    public String verso() {
        return "Squawk";
    }

    @Override
    public String descrizione() {
        return "Pappagallo: " + getNome() +
               ", Età: " + getEta() +
               ", Parla: " + (parla ? "Sì" : "No") +
               ", Verso: " + verso();
    }

    // Metodo specifico
    public void ripetiFrase(String frase) {
        if (parla) {
            System.out.println(getNome() + " dice: " + frase + " 🦜");
        } else {
            System.out.println(getNome() + " non sa parlare.");
        }
    }
}
