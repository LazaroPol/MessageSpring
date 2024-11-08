package com.pablomonteserin.login.controller;

import com.pablomonteserin.login.persistence.entities.Message;
import com.pablomonteserin.login.persistence.repository.MessageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin // Para hacer peticiones desde otro servidor
@RestController // Para hacer peticiones REST
@RequestMapping("/messages")
public class MessageController {

    MessageRepository messageRepository;

    @GetMapping
    public List<Message> getMessageList(){
        List<Message> messageList = messageRepository.findAll();
        return messageList;

    }

    @PostMapping("/")
    public void createMessage(@RequestBody Message message){
    messageRepository.save(message);

    }
}
