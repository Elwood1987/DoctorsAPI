package com.reto2.repository.crudrepository;

import com.reto2.model.MessageModel;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<MessageModel, Integer> {
}
