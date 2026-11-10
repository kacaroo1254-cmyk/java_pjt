package com.office.session;

import java.util.HashMap;

public class Session {
	
	/*
	 * 멤버 필드
	 */
	
	private static Session session;
	
	final private HashMap<String, Object> attributes;
	
	/*
	 * 생성자
	 */
	
	private Session() {
		
		attributes = new HashMap<String, Object>();
		
	}
	
	/*
	 * 싱글톤을 위한 메서드
	 */
	
	public static Session getInstance() {
		if (session == null) {
			session = new Session();
		}
		return session;
	}
	
	/*
	 * Getters
	 */
	
	public Object getAttribute(String name) {
		return attributes.get(name);
	}
	
	public void setAttribute(String name, Object object) {
		attributes.put(name, object);
	}
	
	public void removeAttribute(String name) {
		attributes.remove(name);
	}
	

}
