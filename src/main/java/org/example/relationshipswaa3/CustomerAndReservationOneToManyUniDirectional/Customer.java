package org.example.relationshipswaa3.CustomerAndReservationOneToManyUniDirectional;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany //by default is a joinTable in uniDirectional
    @JoinTable(
            name ="Customer_Reservations",
            joinColumns = @JoinColumn(name="customer_id"),
            inverseJoinColumns = @JoinColumn(name="Reservations_id")
    )
    private List<Reservation> reservations;
}
