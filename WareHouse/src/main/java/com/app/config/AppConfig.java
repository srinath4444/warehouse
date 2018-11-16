package com.app.config;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.app.model.OrderMethod;
import com.app.model.ShipmentType;
import com.app.model.Uom;
import com.app.model.WhUserType;




/**
 * @author RAGHU
 * @version 1.0
 * @category : This is Spring Java Configuration
 *             <b>one time setup</b> 
 */



//ctrl+shift+O (imports)
@Configuration // Java Config File
@EnableWebMvc  // make this as web application
@EnableTransactionManagement // enable commit/rollback
@ComponentScan(basePackages="com.app") //all files are created under this folder only
@PropertySource("classpath:app.properties") //load properties file from src/main/resource folder
public class AppConfig {

	//load properties into AppConfig
	@Autowired
	private Environment env;
	
	//1. DataSource Bean
	@Bean  //=> @Bean creating Object
	public BasicDataSource dsObj() {
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName(env.getProperty("dc"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("un"));
		ds.setPassword(env.getProperty("pwd"));
		
		ds.setInitialSize(5);
		ds.setMaxIdle(5);
		ds.setMinIdle(3);
		ds.setMaxTotal(5);
		return ds;
	}
	
	//2. SessionFactory Bean
	@Bean  //=> creating Object
	public LocalSessionFactoryBean sfObj() {
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setDataSource(dsObj());
		sf.setAnnotatedClasses(Uom.class,ShipmentType.class,OrderMethod.class,WhUserType.class);
		sf.setHibernateProperties(props());
		return sf;
	}
	/*Hibernate Properties*/
	private Properties props() {
		Properties p=new Properties();
		p.put("hibernate.dialect", env.getProperty("dialect"));
		p.put("hibernate.show_sql", env.getProperty("showsql"));
		p.put("hibernate.format_sql", env.getProperty("fmtsql"));
		p.put("hibernate.hbm2ddl.auto", env.getProperty("ddlauto"));
		return p;
	}
	
	//3. HibernateTemplate Bean
	@Bean
	public HibernateTemplate htObj() {
		HibernateTemplate ht=new HibernateTemplate();
		ht.setSessionFactory(sfObj().getObject());
		return ht;
	}
	
	//4. HibernateTxManager Bean
	@Bean
	public HibernateTransactionManager htxm() {
		HibernateTransactionManager htm=new HibernateTransactionManager();
		htm.setSessionFactory(sfObj().getObject());
		return htm;
	}
	
	
	//5. ViewResolver Bean
	@Bean
	public InternalResourceViewResolver ivr() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix(env.getProperty("mvc.prefix"));
		vr.setSuffix(env.getProperty("mvc.suffix"));
		return vr;
	}
	//6.Multipart Resolver
	public CommonsMultipartResolver multipartResolver() {
		return new  CommonsMultipartResolver();
	}
	
	
}




