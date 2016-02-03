package com.ldcc.spring;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	 @Autowired
	 private DataSource dataSource;  

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		List<String> results = jdbcTemplate.queryForList("select name from users;",String.class);
		model.addAttribute("name", results.get(0));
		return "home";
	}
	
}
