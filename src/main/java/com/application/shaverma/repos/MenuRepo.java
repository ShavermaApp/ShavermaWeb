package com.application.shaverma.repos;

import com.application.shaverma.domain.Menu;
import org.apache.logging.log4j.message.Message;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepo extends CrudRepository<Menu, Long> {
}
