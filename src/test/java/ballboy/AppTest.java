/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ballboy;

import ballboy.model.entities.DynamicEntity;
import ballboy.model.entities.behaviour.FloatingCloudBehaviourStrategy;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void writerNotNullTest() {
        FloatingCloudBehaviourStrategy e  = new FloatingCloudBehaviourStrategy();
        assertNotSame(e.clone(), e);
    }
}
