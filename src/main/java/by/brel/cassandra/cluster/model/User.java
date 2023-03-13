package by.brel.cassandra.cluster.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table("user")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @PrimaryKey
    private String email;
    private String name;
}
