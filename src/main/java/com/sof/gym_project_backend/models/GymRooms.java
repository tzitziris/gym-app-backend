package com.sof.gym_project_backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "gym_rooms")
public class GymRooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int capacity;

    @ManyToOne
    @JoinColumn(name = "gym_id")
    private Gyms gym;

}
