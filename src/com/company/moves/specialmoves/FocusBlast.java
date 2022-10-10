package com.company.moves.specialmoves;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1).turns(-1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "Использует Focus Blast";
    }
}
