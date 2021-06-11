package com.example.demo.Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Model.StudyMaterialModel;
import com.example.demo.Service.StudyMaterialService;

@Repository

public class StudyMaterialRepoImpl implements StuduMaterialRepo {
	@Autowired
	JdbcTemplate template;

	List<StudyMaterialModel> list;

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public boolean isRegister55(final StudyMaterialModel StudyMaterialModel) {
		// TODO Auto-generated method stub
			
				int value1 = template.update("insert into reg values('0',?,?,?,?)", new PreparedStatementSetter() {
					
					
					public void setValues(PreparedStatement ps) throws SQLException,DataIntegrityViolationException  {
						// TODO Auto-generated method stub
						ps.setString(1, StudyMaterialModel.getName());
						ps.setString(2, StudyMaterialModel.getPass());
						ps.setString(3, StudyMaterialModel.getRadio() );
						ps.setString(4, StudyMaterialModel.getEmail());
						

					}
				});
			
				

		return false;

	}
	
	public List<StudyMaterialModel> getAllRecords99(final StudyMaterialModel StudyMaterialModel) {
		
		
		String a = StudyMaterialModel.getEmail();
		String b = StudyMaterialModel.getPass();
		list = template.query("select * from reg where email = '"+a+"' and pass = '"+b+"' ", new RowMapper<StudyMaterialModel>() {
			@Override
			public StudyMaterialModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			
				StudyMaterialModel r = new StudyMaterialModel();
				
				r.setRadio(rs.getString(4));
				System.out.println(rs.getString(4));
				
				return r;
			}

		});
		return list;
	}
	
	
	

}
