package org.example.saurabh.book.dummy;

import org.example.saurabh.dummy.EmailService;

public class DummyEmailService implements EmailService {
    @Override
    public void sendEmail(String message) {
        System.out.println("send mail for "+message);
     //   throw new AssertionError("MEthod not implemented");
    }
}
