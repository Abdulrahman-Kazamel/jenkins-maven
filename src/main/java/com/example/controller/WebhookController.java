package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {

    @PostMapping("/github-webhook")
    public ResponseEntity<String> handleWebhook(@RequestBody String payload) {
        System.out.println("Webhook received!");
        System.out.println(payload);

        return ResponseEntity.ok("Received");
    }
}
