package com.reto2.service;

import com.reto2.model.MessageModel;
import com.reto2.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<MessageModel> getAll(){
        return (List<MessageModel>) messageRepository.getAll();
    }

    public Optional<MessageModel> getMessage(Integer id){
        return messageRepository.getMessage(id);
    }

    public MessageModel save (MessageModel messageModel){
        return messageRepository.save(messageModel);
    }

    public void delete(MessageModel messageModel){
        messageRepository.delete(messageModel);
    }

}
