import java.util.List;

class student_gpa{
	public static void main(String[] args){
		/*
		student gabs = new student();
		gabs.setName("Benjo Gaburno");
		gabs.setDept("CEA");

		subject oop_class = new subject();
		oop_class.setSubjectName("Object Oriented Programming");
		oop_class.setGrade(75.00f);
		gabs.addSubject(oop_class);

		subject trig_class = new subject();
		trig_class.setSubjectName("Trigonometry");
		trig_class.setGrade(61.17f);
		gabs.addSubject(trig_class);

		System.out.println("Student is " + gabs.getName());
		System.out.println("Dept: " + gabs.getDept());
		
		System.out.println("Subjects of Student");
		System.out.println("-------------------");
		List<subject> subjects_ni_abs = gabs.getSubjects();
		
		for(subject s : subjects_ni_abs){
			System.out.println(" -- Subject: " + s.getSubjectName());
			System.out.println("    Grade is " + s.getGrade());
		}
		*/
		student macapagal = new student();
		macapagal.setName("Royd Macapagal");
		macapagal.setDept("CEA");

		subject oop_class = new subject();
		oop_class.setSubjectName("Object Oriented Programming");
		oop_class.setGrade(89.00f);
		macapagal.addSubject(oop_class);

		subject intgc_class = new subject();
		intgc_class.setSubjectName("ENGLISH");
		intgc_class.setGrade(88.42f);
		macapagal.addSubject(intgc_class);

		System.out.println("Student is " + Macapagal.getName());
		System.out.println("Dept: " + Macapagal.getDept());
		
		System.out.println("Subjects of Student");
		System.out.println("-------------------");
		List<subject> subjects_ni_macapagal = macapagal.getSubjects();
		
		for(subject s : subjects_ni_macapagal){
			System.out.println(" -- Subject: " + s.getSubjectName());
			System.out.println("    Grade is " + s.getGrade());
		}
	
	}
}
