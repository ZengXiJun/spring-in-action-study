package com.jesse.chapter10;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcSpitterRepository implements SpitterRepository {
	
	private static final String INSERT_SPITTER = "insert into jessedb.spitter(username, password, fullname, email, updateByEmail) "
			+ "values (?, ?, ?, ?, ?)";
	private static final String SELECT_SPITTER = "select id, username, password, fullname, email, updateByEmail from jessedb.spitter";
	
	private static final String UPDATE_SPITTER_BY_ID = "update jessedb.spitter set username = ?, password = ?, fullname = ?, email = ?, updateByEmail = ? where id = ?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcSpitterRepository() {}
	
	public JdbcSpitterRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@SuppressWarnings("deprecation")
	public long count() {
		return jdbcTemplate.queryForLong("select count(1) from jessedb.spitter");
	}
	
	public Spitter save(Spitter spitter) {
		
		Long id = spitter.getId();
		if (id == null) {
			long spitterId = insertSpitterAndReturnId(spitter);
			return new Spitter(spitterId, spitter.getUsername(), spitter.getPassword(), spitter.getFullname(), spitter.getEmail(), spitter.isUpdateByEmail());
		} else {
			jdbcTemplate.update(UPDATE_SPITTER_BY_ID, 
					spitter.getUsername(), 
					spitter.getPassword(), 
					spitter.getFullname(), 
					spitter.getEmail(), 
					spitter.isUpdateByEmail(),
					id);
		}
		return spitter;
		
	}
	
	@SuppressWarnings("unused")
	private void insertSpitter(Spitter spitter) {
		jdbcTemplate.update(INSERT_SPITTER, 
				spitter.getUsername(), 
				spitter.getPassword(), 
				spitter.getFullname(), 
				spitter.getEmail(), 
				spitter.isUpdateByEmail());
	}
	

	private long insertSpitterAndReturnId(Spitter spitter) {
		
		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("jessedb.spitter");
		jdbcInsert.setGeneratedKeyName("id");
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("username", spitter.getUsername());
		args.put("password", spitter.getPassword());
		args.put("fullname", spitter.getFullname());
		args.put("email", spitter.getEmail());
		args.put("updateByEmail", spitter.isUpdateByEmail());
		long insertId = jdbcInsert.executeAndReturnKey(args).longValue();
		return insertId;
	}


	public Spitter findOne(long id) {
		return jdbcTemplate.queryForObject(SELECT_SPITTER + " where id = ?", new SpitterRowMapper(), id);
	}


	public Spitter findByUsername(String username) {
		return jdbcTemplate.queryForObject(SELECT_SPITTER + " where username = ?", new SpitterRowMapper(), username);
	}


	public List<Spitter> findAll() {
		return jdbcTemplate.query(SELECT_SPITTER, new SpitterRowMapper());
	}
	
	private static final class SpitterRowMapper implements RowMapper<Spitter> {
		public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Spitter (
					rs.getLong("id"),
					rs.getString("username"),
					rs.getString("password"),
					rs.getString("fullname"),
					rs.getString("email"),
					rs.getBoolean("updateByEmail"));
		}
	}
	
	

}
