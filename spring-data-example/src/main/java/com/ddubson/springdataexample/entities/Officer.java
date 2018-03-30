package com.ddubson.springdataexample.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Officer {
	private Integer id;
	private Rank rank;
	private String firstName;
	private String lastName;

	public Officer(Rank rank, String firstName, String lastName) {
		this.rank = rank;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
