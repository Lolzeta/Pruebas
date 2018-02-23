package com.adaits;

import java.util.ArrayList;

public class Jefe {

    private ArrayList<Minion> minions = new ArrayList<>();
    private String nombre;

    public Jefe(String nombre,ArrayList<Minion> minions) {
        this.minions = minions;
        this.nombre = nombre;
    }

    public ArrayList<Minion> muchosOjosPocasLuces() {
        ArrayList<Minion> minionsMuchosOjosSinGafas = new ArrayList<>();
        for (Minion m: minions){
            if (m.getOjos() > 1 && !m.isGafas()){
                minionsMuchosOjosSinGafas.add(m);
            }
        }
        return minionsMuchosOjosSinGafas;
    }
}
