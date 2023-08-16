package ru.kazim.spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Lazy;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "public", name = "users")
@NamedEntityGraph(
        name = "users-entity-graph",
        attributeNodes = {
                @NamedAttributeNode("group")
        }
)
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    @ManyToOne(fetch = FetchType.EAGER)
    private GroupEntity group;
    private int cost;

    public UsersEntity(String name, String surname, GroupEntity group, int cost) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.cost = cost;
    }
}
