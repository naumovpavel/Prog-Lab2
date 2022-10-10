package com.company.moves.physicalmoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove {
    public Tackle() {
        super(Type.NORMAL, 50, 100);
    }

    @Override
    protected String describe() {
        return "Испульзует Tackle";
    }
}
