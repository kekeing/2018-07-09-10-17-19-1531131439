package practice07;

import practice02.Person;

public class Student extends Person{
	private Klass klass;


public Klass getKlass() {
		return klass;
	}


	public void setKlass(Klass klass) {
		this.klass = klass;
	}
	


public Student(String name, int age, Klass klass) {
		super(name, age);
		this.klass = klass;
	}


@Override
	public String introduce() {
	int classNumber = getKlass().getNumber() ;
		return "My name is " + getName() + ". I am " + getAge()+" years old. I am a Student. I am at Class "+classNumber+".";
		
	}

	
}