package com.example.whatsapp.controller;

import com.example.whatsapp.dto.MessageRequest;
import com.example.whatsapp.dto.MessageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    @PostMapping("/webhook")
    public MessageResponse webhook(@RequestBody MessageRequest request) {
        String from = request.getFrom();
        String message = request.getMessage();

        // Log incoming message
        logger.info("Incoming message from {}: {}", from, message);

        // Reply logic
        String reply;
        if ("Hi".equalsIgnoreCase(message)) {
            reply = "Hello";
        } else if ("Bye".equalsIgnoreCase(message)) {
            reply = "Goodbye";
        } else {
            reply = "I don't understand that message.";
        }

        return new MessageResponse(reply);
    }
}
