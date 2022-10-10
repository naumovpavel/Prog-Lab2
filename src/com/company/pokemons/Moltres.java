package com.company.pokemons;

import com.company.moves.physicalmoves.SteelWing;
import com.company.moves.specialmoves.Flamethrower;
import com.company.moves.statusmove.DoubleTeam;
import com.company.moves.statusmove.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Moltres extends Pokemon {
    public static final int ORIGINAL_HP = 90;

    public Moltres(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.FIRE);
        this.setStats(90, 100, 90, 125, 85, 90);
        this.setMove(new Flamethrower(), new Rest(), new SteelWing(), new DoubleTeam());
    }

    public Moltres(String name) {
        this(name, 51);
    }
}
