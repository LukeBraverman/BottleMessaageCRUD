package com.mbottle.messagecrud.Controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mbottle.messagecrud.Model.BottleMessage;
import com.mbottle.messagecrud.service.BottleMessageCRUDService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/BMAPI")
@AllArgsConstructor
public class BottleMessageController {

    private BottleMessageCRUDService bottleMessageCRUDService;

    @PostMapping("/postMessage")
    public ResponseEntity<String> POSTMessageToDatabase(@RequestBody BottleMessage bottleMessage) {
        bottleMessageCRUDService.addMessageToDatabase(bottleMessage);
        return ResponseEntity.status(HttpStatus.CREATED).body("Posted message to database");
    }


    @GetMapping(value = "/getMessage", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String GETMessageFORMDatabase() throws JsonProcessingException {
        String bottleMessageAsJSON = bottleMessageCRUDService.getMessageInDatabase_returnAsJson();
        return bottleMessageAsJSON;
    }

    @DeleteMapping("/deleteMessage")
    public ResponseEntity<String> DELETEMessageINDatabase(@RequestBody BottleMessage bottleMessage) {
      bottleMessageCRUDService.deleteMessageInDatabase(bottleMessage);
      return ResponseEntity.status(HttpStatus.OK).body("Message deleted with UID: " + bottleMessage.getUID());
    }

    @PatchMapping("/updateMessage")
    public ResponseEntity<String> CHANGEMessageINDatabase(@RequestBody BottleMessage bottleMessage) {
     bottleMessageCRUDService.updateMessageInDatabase(bottleMessage);
     return ResponseEntity.status(HttpStatus.OK).body("Message updated with UID: " + bottleMessage.getUID());
    }



}
