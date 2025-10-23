package com.bourong.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bourong.entities.Booked;

public interface BookedRepo extends JpaRepository<Booked, Integer>{

}
