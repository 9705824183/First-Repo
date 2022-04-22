package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class Skill {
	@Column
	String skillname;
	int skilllevel;
	
	
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public int getSkilllevel() {
		return skilllevel;
	}
	public void setSkilllevel(int skilllevel) {
		this.skilllevel = skilllevel;
	}
	
	
	@Override
	public String toString() {
		return "Skill [skillname=" + skillname + ", skilllevel=" + skilllevel + "]";
	}
	public Skill(String skillname, int skilllevel) {
		super();
		this.skillname = skillname;
		this.skilllevel = skilllevel;
	}
	
	
	public Skill() {
		super();
	}
	
	

}
