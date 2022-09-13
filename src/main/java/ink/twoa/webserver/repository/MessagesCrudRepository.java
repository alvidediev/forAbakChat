package ink.twoa.webserver.repository;

import ink.twoa.webserver.model.entity.MessageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesCrudRepository extends CrudRepository<MessageEntity, Long> {
}
