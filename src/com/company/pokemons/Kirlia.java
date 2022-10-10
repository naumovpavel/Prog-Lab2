package com.company.pokemons;

import com.company.moves.specialmoves.DrainingKiss;
import com.company.moves.statusmove.DoubleTeam;
import com.company.moves.statusmove.Swagger;
import ru.ifmo.se.pokemon.Type;

public class Kirlia extends Ralts{
    public Kirlia(String name, int lvl) {
        super(name, lvl);
        this.setStats(38, 35, 35, 65, 55, 50);
        this.addMove(new DrainingKiss());
    }

    public Kirlia(String name) {
        this(name, 87);
    }
}
