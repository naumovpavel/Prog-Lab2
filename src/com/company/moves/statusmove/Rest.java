package com.company.moves.statusmove;

import com.company.pokemons.Moltres;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        pokemon.setMod(Stat.HP, -Moltres.ORIGINAL_HP);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "Использует Rest";
    }
}
