package com.example.spacehangar.hangar_tracker.model

import jakarta.persistence.*

@Entity
@Table(name = "hangar_spaces")
data class HangarSpace(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(nullable = false, unique = true)
    val spaceNumber: Int,

    @Column(nullable = false)
    var status: String // "available" or "occupied"
)