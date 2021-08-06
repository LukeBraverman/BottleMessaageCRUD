package com.mbottle.messagecrud.controller;

import com.mbottle.messagecrud.Controller.BottleMessageController;
import com.mbottle.messagecrud.service.BottleMessageCRUDService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class BottleMessageControllerTest {

    private MockMvc mvc;
    @InjectMocks
    BottleMessageController bottleMessageController;
    @Mock
    BottleMessageCRUDService bottleMessageCRUDService;

    @BeforeEach
    void setUp() {
        mvc = MockMvcBuilders.standaloneSetup(bottleMessageController)
                .build();
    }

    @Test
    void POSTMessageToDatabase() {

    }

    @Test
    void GETMessageFORMDatabase() {
    }

    @Test
    void DELETEMessageINDatabase() {
    }

    @Test
    void CHANGEMessageINDatabase() {
    }
}