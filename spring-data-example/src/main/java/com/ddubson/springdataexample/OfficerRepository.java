package com.ddubson.springdataexample;

import com.ddubson.springdataexample.entities.Officer;
import com.ddubson.springdataexample.entities.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficerRepository extends JpaRepository<Officer, Integer> {
	List<Officer> findByRank(@Param("rank") Rank rank);

	List<Officer> findByLastName(@Param("lastName") String lastName);
}
