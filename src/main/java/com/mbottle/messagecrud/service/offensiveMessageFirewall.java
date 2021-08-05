package com.mbottle.messagecrud.service;

import com.mbottle.messagecrud.Model.BottleMessage;
import org.springframework.stereotype.Service;

@Service
public class offensiveMessageFirewall {


    public boolean checkMessageContents(BottleMessage bottleMessage) {
        return false;
    }
}
