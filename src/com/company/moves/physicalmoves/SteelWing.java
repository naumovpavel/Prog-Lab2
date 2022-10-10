package com.company.moves.physicalmoves;

import ru.ifmo.se.pokemon.*;

public class SteelWing extends PhysicalMove {
    public SteelWing() {
        super(Type.STEEL, 70, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1).stat(Stat.DEFENSE, 1).turns(-1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "Использует Steel Wing";
    }
}
