package com.basics.ref;

public class RefDemo {

	public static void main(String[] args) {
		System.out.println("Method Reference Demo");
		
		//provide implementation of iWork
//		IWork iWork = () -> {
//			System.out.println("this is do project from IWork");
//		};
//		iWork.doProject();
		
		//using method of project class in this class
		IWork iWork = Project::projectProgress;
		iWork.doProject();

	}

}
