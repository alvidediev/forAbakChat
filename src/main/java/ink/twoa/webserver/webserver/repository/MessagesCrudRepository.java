package ink.twoa.webserver.webserver.repository;

import ink.twoa.webserver.webserver.model.entity.MessageEntity;
import org.springframework.data.repository.CrudRepository;

public interface MessagesCrudRepository extends CrudRepository<MessageEntity, Long> {
}
