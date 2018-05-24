package net.deltax.dao;

import net.deltax.dto.Actors;

/**
 * Created by AyushiSharma on 5/25/2018.
 */
public interface ActorsDAO {

    boolean add(Actors actors);
    boolean update(Actors actors);
    boolean delete(Actors actors);

}
