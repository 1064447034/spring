package com.yiibai.springconditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyConditional implements Condition {
	@Override
	public boolean matches(ConditionContext arg0, AnnotatedTypeMetadata arg1) {
		return false;
	}
}
