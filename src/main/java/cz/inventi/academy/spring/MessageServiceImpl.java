package cz.inventi.academy.spring;

import org.springframework.stereotype.Service;

/**
 * @see {@link MessageService}
 */
@Service
public class MessageServiceImpl implements MessageService {

    /**
     * @see cz.inventi.academy.spring.MessageService#getMessage()
     */
    public String getMessage() {
        return "Hello world!";
    }
}