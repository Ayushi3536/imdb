package net.deltax.daoimpl;

import net.deltax.dao.ActorsDAO;
import net.deltax.dto.Actors;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by AyushiSharma on 5/25/2018.
 */
public class ActorsDAOImpl implements ActorsDAO {
    @Autowired
    public SessionFactory sessionFactory;
    @Override
    public boolean add(Actors actors) {
        try {
            sessionFactory
                    .getCurrentSession()
                    .persist(actors);
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Actors actors) {
        try {
            sessionFactory
                    .getCurrentSession()
                    .update(actors);
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Actors actors) {
        try {
            sessionFactory
                    .getCurrentSession()
                    .delete(actors);
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
