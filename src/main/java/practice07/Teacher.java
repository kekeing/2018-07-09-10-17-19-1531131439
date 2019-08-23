package practice07;



public class Teacher extends Person{
	private Klass klass;
	
	public Klass getKlass() {
		return klass;
	}



	public void setKlass(Klass klass) {
		this.klass = klass;
	}





	public Teacher(String name, int age, Klass klass) {
		super(name, age);
		this.klass = klass;
	}
	



	public Teacher(String name, int age) {
		super(name, age);
	}



	@Override
		public String introduce() {
		if(getKlass() != null)
		{int classNumber = getKlass().getNumber() ;
			return "My name is " + getName() + ". I am " + getAge()+" years old. I am a Teacher. I teach Class "+classNumber+".";
		}	
		else return "My name is " + getName() + ". I am " + getAge()+" years old. I am a Teacher. I teach No Class.";
		}
	public String introduceWith(Student student) {
		if (student.getKlass() == getKlass()) {
			return "My name is " + getName() + ". I am " + getAge()+" years old. I am a Teacher. I teach "+student.getName()+".";

		}
		else return "My name is " + getName() + ". I am " + getAge()+" years old. I am a Teacher. I don't teach "+student.getName()+".";

		
	}
	

}
