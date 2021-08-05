package com.mbottle.messagecrud.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class BottleMessage {
    @Id
    private String UID;
    private String message;
    private String username;
}
