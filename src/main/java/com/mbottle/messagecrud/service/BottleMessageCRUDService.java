package com.mbottle.messagecrud.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mbottle.messagecrud.Model.BottleMessage;
import com.mbottle.messagecrud.repositry.BottleMessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@AllArgsConstructor
@Service
public class BottleMessageCRUDService {

            BottleMessageRepository bottleMessageRepository;


    public void addMessageToDatabase(BottleMessage bottleMessage) {

    }
    public String getMessageInDatabase_returnAsJson() throws JsonProcessingException {
        BottleMessage bottleMessage = new BottleMessage();
        bottleMessage.setUID("1");
        bottleMessage.setMessage("HellotestJsoncONVERT");
        bottleMessage.setUsername("Test");

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(bottleMessage);

        return json;
    }


    public void deleteMessageInDatabase(BottleMessage bottleMessage) {

    }

    public void updateMessageInDatabase(BottleMessage bottleMessage) {

    }


}
