package com.ddubson.springdataexample.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="officers")
public class Officer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Enumerated(EnumType.STRING)
	private Rank rank;
	private String firstName;
	private String lastName;

	public Officer(Rank rank, String firstName, String lastName) {
		this.rank = rank;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
