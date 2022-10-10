package com.company.pokemons;

import com.company.moves.physicalmoves.Tackle;
import com.company.moves.statusmove.Swagger;
import com.company.moves.statusmove.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon {
    public Eevee(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.NORMAL);
        this.setStats(55, 55, 50, 45, 65, 55);
        this.setMove(new Swagger(), new Tackle(), new WorkUp());
    }

    public Eevee(String name) {
        this(name, 87);
    }

}
