package com.boot.bike.repositories;

import com.boot.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long>
{
}
