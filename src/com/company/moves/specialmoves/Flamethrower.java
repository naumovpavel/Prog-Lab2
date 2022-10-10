package com.company.moves.specialmoves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Flamethrower extends SpecialMove {
    public Flamethrower() {
        super(Type.FIRE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.1);
        pokemon.addEffect(e);
        if(e.success()) {
            Effect.burn(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "Использует Flamethrower";
    }
}
