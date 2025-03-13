package package2;

import package1.AccessSpecifierMethodOutsidePackageTeacher;

public class AccessSpecifierMethodOutsidePackageStudent extends AccessSpecifierMethodOutsidePackageTeacher{
	public static void main(String[] args) {
		AccessSpecifierMethodOutsidePackageStudent a= new AccessSpecifierMethodOutsidePackageStudent();
		a.methodPackage1();
		a.methodPackage2();
		
	}

}
