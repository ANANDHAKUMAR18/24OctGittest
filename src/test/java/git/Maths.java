package git;

import git.Maths;

public class Maths {
	
	public void add(int a,int b){
		int result =a+b;
		System.out.println("Sum of two numbers =" + result);
		}

	public void M2(){
		
		System.out.println("Sum of two numbers");
		}
	
	
	public static void main(String[] args){
        Maths obj=new Maths();
	obj.add(3,0);
        obj.M2();
	}
}
