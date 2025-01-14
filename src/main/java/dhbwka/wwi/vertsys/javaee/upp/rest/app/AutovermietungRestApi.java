
package dhbwka.wwi.vertsys.javaee.upp.rest.app;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author TimRiebesam
 */

@ApplicationPath("api")
public class AutovermietungRestApi extends Application{
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();

        // Hier für jede Webservice-Klasse eine Zeile hinzufügen
        resources.add(RueckgabeResource.class);

        resources.add(UserResource.class);

        resources.add(AutoResource.class);
        resources.add(BuchungResource.class);
        return resources;
    }
    
}
