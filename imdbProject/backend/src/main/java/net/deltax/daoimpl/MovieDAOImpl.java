package net.deltax.daoimpl;

import net.deltax.dao.MovieDAO;
import net.deltax.dto.Movie;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by AyushiSharma on 5/25/2018.
 */
@Transactional
public class MovieDAOImpl implements MovieDAO {

    @Autowired
    SessionFactory sessionFactory;
    @Override
    public boolean add(Movie movie) {
        try {
            sessionFactory
                    .getCurrentSession()
                    .persist(movie);
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Movie movie) {
        try {
            sessionFactory
                    .getCurrentSession()
                    .update(movie);
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Movie movie) {
        try {
            sessionFactory
                    .getCurrentSession()
                    .delete(movie);
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
