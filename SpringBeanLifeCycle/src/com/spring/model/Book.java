package com.spring.model;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements  InitializingBean, DisposableBean, BeanFactoryAware, BeanNameAware, BeanClassLoaderAware{

	private String bookName;
	private Book() {
		System.out.println("---inside constructor---");
	}
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
	       System.out.println("---BeanClassLoaderAware.setBeanClassLoader---");
	}	
	@Override
	public void setBeanName(String name) {
   	       System.out.println("---BeanNameAware.setBeanName---");
	}	
	public void myInitMethod() {
	    	 System.out.println("---init-method---");
	}	

	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("---BeanFactoryAware.setBeanFactory---");
	}	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("---InitializingBean.afterPropertiesSet---");
	}	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
		System.out.println("setBookName: Book name has set.");		
	}
	public void myDestroy() {
		System.out.println("---destroy-method---");
	}

	
	@Override
	public void destroy() throws Exception {
		System.out.println("---DisposableBean.destroy---");
	}
	@Override
	protected void finalize() {
		System.out.println("---inside finalize---");
	}
}
