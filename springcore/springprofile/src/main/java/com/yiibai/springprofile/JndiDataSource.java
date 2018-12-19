package com.yiibai.springprofile;

public class JndiDataSource implements DataSource {
	@Override
	public String getDataSource() {
		return "JndiDataSource";
	}
}
