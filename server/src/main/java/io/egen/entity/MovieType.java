package io.egen.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class MovieType {
	@Id
    @Column(columnDefinition = "VARCHAR(36)")
	private String id;
	private String type;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
