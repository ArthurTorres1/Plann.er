package br.com.rocketseat.planner.trip;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TripRespository extends JpaRepository<Trip, UUID> {
}
