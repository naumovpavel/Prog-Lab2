package com.company.pokemons;

import com.company.moves.specialmoves.FocusBlast;

public class Gallade extends Kirlia {
    public Gallade(String name, int lvl) {
        super(name, lvl);
        this.setStats(68, 125, 65, 65,115, 80);
        this.addMove(new FocusBlast());
    }

    public Gallade(String name) {
        this(name, 87);
    }
}
