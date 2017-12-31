package com.kshrd.model;

public class Role {
	private Integer id;
	private String role;
	private boolean status;
	
	public Role(){};
	
	public Role(Integer id, String role, boolean status) {
		super();
		this.id = id;
		this.role = role;
		this.status = status;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + ", status=" + status + "]";
	}
	
}
