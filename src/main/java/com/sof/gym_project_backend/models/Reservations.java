package com.sof.gym_project_backend.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "reservations")
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startTime;  // Αλλαγή από dateTime
    private LocalDateTime endTime;    // Προσθήκη νέου πεδίου

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Members member;

    @ManyToOne
    @JoinColumn(name = "gym_id")
    private Gyms gym;

    // Προαιρετικά: Προσθήκη σχέσης με την αίθουσα
    @ManyToOne
    @JoinColumn(name = "gym_room_id")
    private GymRooms gymRoom;
}
