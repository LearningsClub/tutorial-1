package com.tutorial.api.repositories;

import com.tutorial.api.modules.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<City,Long> {
}
