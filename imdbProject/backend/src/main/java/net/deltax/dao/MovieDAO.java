package net.deltax.dao;

import net.deltax.dto.Movie;

/**
 * Created by AyushiSharma on 5/25/2018.
 */
public interface MovieDAO {

    boolean add(Movie movie);
    boolean update(Movie movie);
    boolean delete(Movie movie);
}
