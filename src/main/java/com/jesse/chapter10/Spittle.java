package com.jesse.chapter10;

import java.util.Date;

public class Spittle {
	
	@Override
	public String toString() {
		return "Spittle [id=" + id + ", Spitter=" + spitter + ", message=" + message + ", postedTime=" + postedTime
				+ "]";
	}
	
	private Long id;
	private final Spitter spitter;
	private final String message;
	private Date postedTime;
	
	public Spittle(Long id, Spitter spitter, String message, Date postedTime) {
		this.id = id;
		this.spitter = spitter;
		this.message = message;
		this.postedTime = postedTime;
	}
	
	public Spittle(Spitter spitter, String message, Date postedTime) {
		this.spitter = spitter;
		this.message = message;
		this.postedTime = postedTime;
	}
	
	public Long getId() {
		return id;
	}
	public Spitter getSpitter() {
		return spitter;
	}
	public String getMessage() {
		return message;
	}
	public Date getPostedTime() {
		return postedTime;
	}

}
