package com.mbottle.messagecrud.repositry;

import com.mbottle.messagecrud.Model.BottleMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface BottleMessageRepository extends JpaRepository<BottleMessage,String> {


}
