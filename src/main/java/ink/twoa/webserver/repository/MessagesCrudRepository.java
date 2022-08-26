package ink.twoa.webserver.repository;

import ink.twoa.webserver.model.entity.MessageEntity;
import org.springframework.data.repository.CrudRepository;

public interface MessagesCrudRepository extends CrudRepository<MessageEntity, Long> {
}
