package cz.inventi.academy.spring;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Ignore
public class BasicTest {

    @Autowired
    CountServiceImpl countService;

    @Autowired
    MessageServiceImpl messageService;

    @Test
    public void getMessage() {
        assertNotNull(messageService);
        assertEquals("Hello world!", messageService.getMessage());
    }

    @Test
    public void printMessage() {
        assertNotNull(countService);
        countService.printMessage();
    }
}