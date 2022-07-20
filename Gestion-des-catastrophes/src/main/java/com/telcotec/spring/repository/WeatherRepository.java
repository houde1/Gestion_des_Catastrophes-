package com.telcotec.spring.repository;

import com.telcotec.spring.entities.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends JpaRepository<Weather,Integer> {

}
