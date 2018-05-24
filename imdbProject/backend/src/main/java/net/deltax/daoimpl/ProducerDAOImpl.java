package net.deltax.daoimpl;

import net.deltax.dao.ProducersDAO;
import net.deltax.dto.Producer;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by AyushiSharma on 5/25/2018.
 */
public class ProducerDAOImpl implements ProducersDAO {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public boolean add(Producer producer) {
        try {
            sessionFactory
                    .getCurrentSession()
                    .persist(producer);
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean update(Producer producer) {
        try {
            sessionFactory
                    .getCurrentSession()
                    .update(producer);
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Producer producer) {
        try {
            sessionFactory
                    .getCurrentSession()
                    .delete(producer);
            return true;
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
