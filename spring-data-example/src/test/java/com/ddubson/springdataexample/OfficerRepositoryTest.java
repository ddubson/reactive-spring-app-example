package com.ddubson.springdataexample;

import com.ddubson.springdataexample.entities.Officer;
import com.ddubson.springdataexample.entities.Rank;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@DataJpaTest
@RunWith(SpringRunner.class)
@Transactional
public class OfficerRepositoryTest {
	@Autowired
	private OfficerRepository officerRepository;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Test
	public void testSave() {
		Officer officer = new Officer(Rank.LIEUTANENT, "Nyoto", "Uhuru");
		officer = officerRepository.save(officer);
		assertNotNull(officer.getId());
		assertThat(officer.getFirstName(), equalTo("Nyoto"));
		assertThat(officer.getLastName(), equalTo("Uhuru"));
	}

	@Test
	public void findOneTest() {
		jdbcTemplate.query("select id from officers", (rs, num) -> rs.getInt("id"))
		.forEach((Integer id) -> {
			Officer officer = officerRepository.getOne(id);
			assertNotNull(officer);
			assertEquals(id, officer.getId());
		});
	}
}