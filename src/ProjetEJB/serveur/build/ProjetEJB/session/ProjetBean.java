package ProjetEJB.serveur.build.ProjetEJB.session;

import javax.ejb.*;
import javax.persistence.*;
import java.util.*;

import ProjetEJB.serveur.build.ProjetEJB.entity.*;

@Stateless (mappedName="exoDemo")
public class ProjetBean implements ProjetBeanItf {
    @PersistenceContext(unitName="exoDemoPU")
    private EntityManager em;

    public List<String> getLesNoms()
    {
        return em.createQuery("SELECT ce.lastName FROM ContactEntity ce").getResultList();
    }
}
