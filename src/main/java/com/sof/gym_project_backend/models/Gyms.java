package com.sof.gym_project_backend.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "gyms")
public class Gyms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @OneToOne
//    @JoinColumn(name = "user_id")
//    private Users user;
//
//    @OneToOne(mappedBy = "gym", cascade = CascadeType.ALL)
//    private GymRoom room;

}
