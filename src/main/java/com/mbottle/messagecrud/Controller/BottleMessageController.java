package com.mbottle.messagecrud.Controller;

import com.mbottle.messagecrud.Model.BottleMessage;
import com.mbottle.messagecrud.service.BottleMessageCRUDService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
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
    @GetMapping("/getMessage")
    public BottleMessage GETMessageFORMDatabase() {
        System.out.println("pinged2"
        );
        BottleMessage bottleMessage = null;
        return bottleMessage;
    }
    @DeleteMapping("/deleteMessage")
    public void DELETEMessageINDatabase() {
        System.out.println("pinged3"
        );
    }
    @PatchMapping("/updateMessage")
    public void CHANGEMessageINDatabase() {
        System.out.println("pinged4"
        );
    }



}
