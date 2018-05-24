package net.deltax.dao;

import net.deltax.dto.Producer;

/**
 * Created by AyushiSharma on 5/25/2018.
 */
public interface ProducersDAO {

    boolean add(Producer producer);
    boolean update(Producer producer);
    boolean delete(Producer producer);

}
