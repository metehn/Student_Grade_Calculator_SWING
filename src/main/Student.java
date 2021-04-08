package main;

public class Student {
private String Name;
private double Mid1;
private double Mid2;
private double Final;
double Result = Mid1 *0.2 + Mid2 * 0.3 + Final *0.5;


public Student(String name, double mid1, double mid2, double final1,double result) {
	Name = name;
	Mid1 = mid1;
	Mid2 = mid2;
	Final = final1;
	Result = result;
}


public String getName() {
	return Name;
}



public double getResult() {
	return Result;
}



}
