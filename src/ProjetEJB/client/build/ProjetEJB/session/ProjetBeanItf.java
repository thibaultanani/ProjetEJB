package ProjetEJB.client.build.ProjetEJB.session;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface ProjetBeanItf {
    static {
        throw new Error("Unresolved compilation problems: \n\tThe import javax.ejb cannot be resolved\n\tRemote cannot be resolved to a type\n");
    }

    List<String> getLesNoms();
}
