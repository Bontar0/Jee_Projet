package apirest;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrewMemberDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Resource
    UserTransaction userTransaction;

    public List<CrewMember> getSodas(){
        return entityManager.createQuery("select s from Soda s", CrewMember.class).getResultList();
    }

    public boolean addCrewMember(CrewMember crewMember){
        try{
            userTransaction.begin();
            entityManager.persist(crewMember);
            userTransaction.commit();
            return true;
        }catch (Exception e){
            Logger.getGlobal().log(Level.SEVERE, "JPA error" + e.getMessage());
            return false;
        }
    }
}
