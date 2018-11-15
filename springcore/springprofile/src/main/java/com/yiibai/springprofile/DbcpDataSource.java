package com.yiibai.springprofile;

public class DbcpDataSource implements DataSource {
	@Override
	public String getDataSource() {
		return "DbcpDataSource";
	}
}
