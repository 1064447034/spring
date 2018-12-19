package com.ly.recyledi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentA {

    private StudentB studentB ;

    @Autowired
    public void setStudentB(StudentB studentB) {
        this.studentB = studentB;
    }

    public StudentB getStudentB() {
		return studentB;
	}

	public StudentA() {
    }

    public StudentA(StudentB studentB) {
        this.studentB = studentB;
    }
}