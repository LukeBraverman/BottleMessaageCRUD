package com.mbottle.messagecrud.service;

import com.mbottle.messagecrud.Model.BottleMessage;
import com.mbottle.messagecrud.repositry.BottleMessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BottleMessageCRUDService {
    BottleMessage bottleMessage;
    BottleMessageRepository bottleMessageRepository;


    public void addMessageToDatabase(BottleMessage bottleMessage) {

    }
    public BottleMessage getMessageInDatabase() {
        return bottleMessage;
    }
    public void deleteMessageInDatabase(BottleMessage bottleMessage) {

    }

    public void updateMessageInDatabase(BottleMessage bottleMessage) {

    }


}
