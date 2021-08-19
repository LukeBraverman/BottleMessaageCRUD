package com.mbottle.messagecrud.repositry;

import com.mbottle.messagecrud.Model.BottleMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class BottleMessageRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BottleMessageRepository bottleMessageRepository;

    @Test
    public void whenFindByUID_thenReturnMessage() {
        // given (placing data into database)
        BottleMessage bottleMessage = new BottleMessage();
        bottleMessage.setUID("1");
        bottleMessage.setMessage("Hello");
        bottleMessage.setUsername("Test");
        entityManager.persist(bottleMessage);
        entityManager.flush();

        // when (Testing custom method. For my code this is the random row selector
       // BottleMessage found = bottleMessageRepository.findByName(alex.getName());

        // then (make assertions)
        /*
        assertThat(found.getName())
                .isEqualTo(alex.getName()); */
    }
}