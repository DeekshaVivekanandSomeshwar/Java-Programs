package basicProgram;

 

public class ThisKeyword {
	 String name;
	 int salary;
	 void student_detail(String name, int salary)
	 {
		 this.name = name;
		 this.salary = salary;
		 System.out.println(name+" salary is "+salary);
		 
	 }
	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		tk.student_detail("Raj", 50000);


	}

}
