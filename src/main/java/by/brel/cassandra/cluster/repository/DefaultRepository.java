package by.brel.cassandra.cluster.repository;

import by.brel.cassandra.cluster.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface DefaultRepository extends CassandraRepository<User, String> {
}
