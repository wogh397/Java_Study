package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {
		//Person p02 = new Person();
		
		Person p01 = new Person("정우성", 45);
		//System.out.println(p01.toString());
		p01.showInfo();
		
		
		Student s01 = new Student();
		s01.setSchoolName("제주");
		s01.setName("이효리");
		s01.setAge(14);
		s01.showInfo();
		System.out.println("---------------------");
		
		Student s02 = new Student("이효리", 14, "제주초등학교");
		s01.showInfo();  //부모오류
		
		
		
	
		
	}

}
