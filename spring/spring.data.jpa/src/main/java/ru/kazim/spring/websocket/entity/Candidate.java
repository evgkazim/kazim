package ru.kazim.spring.websocket.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="candidate")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;
}


