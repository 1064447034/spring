package com.yiibai.springprofile;

public class EmbeddedDataSource implements DataSource {
	@Override
	public String getDataSource() {
		return "EmbeddedDataSource";
	}
}
