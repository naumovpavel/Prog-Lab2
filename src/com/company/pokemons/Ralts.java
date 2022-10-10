package com.company.pokemons;

import com.company.moves.statusmove.DoubleTeam;
import com.company.moves.statusmove.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon {
    public Ralts(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.FAIRY, Type.PSYCHIC);
        this.setStats(28, 25, 25, 45, 35, 40);
        this.setMove(new Swagger(), new DoubleTeam());
    }

    public Ralts(String name) {
        this(name, 87);
    }
}
