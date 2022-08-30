 package com.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.beans.Emp;

public class EmpDao {
	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Emp> getEmployees(){
		return jdbcTemplate.query("Select * from login", new RowMapper<Emp>() {

			@Override
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				
			return e;
			}
			
		});
	}
	public int save(Emp p){    
	    String sql="insert into login(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";    
	    return jdbcTemplate.update(sql);    
	} 
	
	public int update(Emp p){    
	    String sql="update login set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";    
	    return jdbcTemplate.update(sql);    
	}  
	
	public int delete(int id){    
	    String sql="delete from login where id="+id+"";    
	    return jdbcTemplate.update(sql);    
	}  
	
	public Emp getEmpById(int id){    
	    String sql="select * from login where id=?";    
	    return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));    
	}  
	
	public Emp RetrieveEmpById(int id) {
		return jdbcTemplate.query("select * from login where id="+id, 
				new ResultSetExtractor<Emp>() {

	public Emp extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		if(rs.next())
		{
			Emp obj= new Emp();
			obj.setId(rs.getInt(1));
			obj.setName(rs.getString(2));
			obj.setSalary(rs.getFloat(3));
			obj.setDesignation(rs.getString(4));
			return obj;
		}
		return null;
	}});
	}

}
