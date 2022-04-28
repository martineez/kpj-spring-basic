package cz.inventi.academy.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class BasicTest {

    // TODO: Define messageService parameter and inject it via spring annotation @Autowired

    // TODO: Define countService parameter and inject it via spring annotation @Autowired

    @Test
    public void getMessage() throws Exception {
        assertNotNull(messageService);
        assertEquals("Hello world!", messageService.getMessage());
    }

    @Test
    public void printMessage() throws Exception {
        assertNotNull(countService);
        countService.printMessage();
    }
}