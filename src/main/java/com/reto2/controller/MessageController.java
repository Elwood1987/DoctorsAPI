package com.reto2.controller;

import com.reto2.model.MessageModel;
import com.reto2.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/doctor")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class MessageController {

    @Autowired
    private MessageService messageService;

    public List<MessageModel> getAll(){
        return (List<MessageModel>) messageService.getAll();
    }

    public Optional<MessageModel> getMessage(@PathVariable Integer id){
        return messageService.getMessage(id);
    }

    public MessageModel save (@RequestBody MessageModel messageModel){
        return messageService.save(messageModel);
    }

    public void delete( @RequestBody MessageModel messageModel){
        messageService.delete(messageModel);
    }

}
