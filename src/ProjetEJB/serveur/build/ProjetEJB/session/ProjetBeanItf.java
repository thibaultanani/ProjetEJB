package ProjetEJB.serveur.build.ProjetEJB.session;

import java.util.List;

        import java.util.List;
        import javax.ejb.Remote;

@Remote
public interface ProjetBeanItf {
    List<String> getLesNoms();
}
