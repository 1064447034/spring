package com.yiibai.xml;

import org.hibernate.validator.constraints.NotEmpty;

import com.alibaba.fastjson.JSON;

public class Request {
	@NotEmpty(message = "家庭成员不能为空")
	private String projectId;
	private String projectDesc;
	
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}

	public static void main(String[] args) {
		Request r = new Request();
		r.setProjectId("111");
		r.setProjectDesc("222");
		System.out.println(JSON.toJSONString(r));
	}
}
