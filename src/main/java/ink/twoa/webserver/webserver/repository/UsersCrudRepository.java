package ink.twoa.webserver.webserver.repository;

import ink.twoa.webserver.webserver.model.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersCrudRepository extends CrudRepository<UsersEntity, Long> {

}
