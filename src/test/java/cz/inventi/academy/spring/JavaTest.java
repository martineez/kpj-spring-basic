package cz.inventi.academy.spring;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = ConfigTest.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class JavaTest extends BasicTest {
}