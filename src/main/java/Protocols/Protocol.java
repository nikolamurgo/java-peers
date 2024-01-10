package Protocols;

import example.Message;

public interface Protocol {
    public void digest(Message message);
    public void respond(Message message);
}
