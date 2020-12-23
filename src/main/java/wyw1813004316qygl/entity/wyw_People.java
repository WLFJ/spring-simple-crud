package wyw1813004316qygl.entity;

public class wyw_People {
	
	private Integer wyw_id;
	private String wyw_name;
	private Integer wyw_age;
	private String wyw_job;
	public Integer getWyw_id() {
		return wyw_id;
	}
	public void setWyw_id(Integer wyw_id) {
		this.wyw_id = wyw_id;
	}
	public String getWyw_name() {
		return wyw_name;
	}
	public void setWyw_name(String wyw_name) {
		this.wyw_name = wyw_name;
	}
	public Integer getWyw_age() {
		return wyw_age;
	}
	public void setWyw_age(Integer wyw_age) {
		this.wyw_age = wyw_age;
	}
	public String getWyw_job() {
		return wyw_job;
	}
	public void setWyw_job(String wyw_job) {
		this.wyw_job = wyw_job;
	}
	public wyw_People(Integer wyw_id, String wyw_name, Integer wyw_age, String wyw_job) {
		super();
		this.wyw_id = wyw_id;
		this.wyw_name = wyw_name;
		this.wyw_age = wyw_age;
		this.wyw_job = wyw_job;
	}
	public wyw_People(String wyw_name, Integer wyw_age, String wyw_job) {
		super();
		this.wyw_name = wyw_name;
		this.wyw_age = wyw_age;
		this.wyw_job = wyw_job;
	}
	public wyw_People() {
		super();
	}
	
	

}
