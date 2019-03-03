package com.hs.creational.singleton;

import java.util.ArrayList;
import java.util.List;

enum School {
	HIGHSCHOOL;
	List<String> teachers = new ArrayList<>();

	School() {
		teachers.add("Hareram");
		teachers.add("Raghu");
		teachers.add("Blue");
	}

	public String getTeachers() {
		if (teachers.size() > 0) {
			return teachers.remove(0);
		} else {
			return "No Teacher";
		}
	}
}

public class SingletonByEnum {
	String name, teacher;

	public SingletonByEnum(String tutorialName) {
		this.name = tutorialName;
		School school = School.HIGHSCHOOL;
		teacher = school.getTeachers();
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			SingletonByEnum first = new SingletonByEnum("Singleton " + i);
			System.out.println(first.name + " has  teacher " + first.teacher);
		}
	}
}