package springetest.config;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan({"Spring Test"})
public class WebConfig extends WebMvcConfigurerAdapter  {

	@Autowired
	DataSource datasource;
	
	@Bean
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() 
	{
		return new NamedParameterJdbcTemplate(datasource);
	}
	
	@Bean
	public DataSource getDatasource() 
	{
	DriverManagerDataSource ds=	new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3360/studentdb");
	ds.setUsername("root");
	ds.setPassword("Admin123");
	
	return ds;
	}
	
	@Bean(name="MultipartResolver")
	public CommonsMultipartResolver getResolver() {
	CommonsMultipartResolver commonsMultipartResolver= new CommonsMultipartResolver();
	commonsMultipartResolver.setMaxUploadSizePerFile(20*1024*1024);
	
	return commonsMultipartResolver;
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver()
	{
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
		
	}
	
	@Bean
	public ReloadableResourceBundleMessageSource messageSource()
	{
		ReloadableResourceBundleMessageSource rb= new ReloadableResourceBundleMessageSource();
		rb.setBasenames(new String[] {"validation"});
		
		return rb;
	}
	
	
	
	} 

