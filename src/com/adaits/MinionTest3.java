package com.adaits;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MinionTest3 {

    @Test
    void probarFuncion(){
        ArrayList<Minion> minions = new ArrayList<>();
        Minion m1 = new Minion("Dave", 2,false);
        minions.add(m1);
        Jefe j = new Jefe("Pepe", minions);
        ArrayList<Minion> minionsOjos = j.muchosOjosPocasLuces();
        assertSame(minions.size(),minionsOjos.size());
        for (int i = 0;i < minions.size();i++){
            Minion minionRE = minions.get(i);
            Minion minionF = minionsOjos.get(i);
            assertSame(minionRE, minionF);
        }
    }
}
