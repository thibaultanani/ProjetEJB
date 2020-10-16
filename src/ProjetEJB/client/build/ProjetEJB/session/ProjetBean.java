package ProjetEJB.client.build.ProjetEJB.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ProjetBean implements ProjetBeanItf {
    @PersistenceContext
    private EntityManager em;

    public ProjetBean() {
        throw new Error("Unresolved compilation problems: \n\tThe import javax.ejb cannot be resolved\n\tThe import javax.persistence cannot be resolved\n\tStateless cannot be resolved to a type\n\tPersistenceContext cannot be resolved to a type\n\tEntityManager cannot be resolved to a type\n\tEntityManager cannot be resolved to a type\n");
    }

    public List<String> getLesNoms() {
        throw new Error("Unresolved compilation problem: \n\tEntityManager cannot be resolved to a type\n");
    }
}