package com.company.pokemons;

import com.company.moves.physicalmoves.Tackle;
import com.company.moves.specialmoves.DazzlingGleam;
import com.company.moves.statusmove.Swagger;
import com.company.moves.statusmove.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Sylveon extends Eevee {
    public Sylveon(String name, int lvl) {
        super(name, lvl);
        this.setType(Type.FAIRY);
        this.setStats(95, 65, 65, 110, 130, 60);
        this.addMove(new DazzlingGleam());
    }

    public Sylveon(String name) {
        this(name, 99);
    }
}
