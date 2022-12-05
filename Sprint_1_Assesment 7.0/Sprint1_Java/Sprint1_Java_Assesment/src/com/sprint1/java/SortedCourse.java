package com.sprint1.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortedCourse {
	
	public static void main(String[] args) {
		
		ArrayList<CompetitiveExamCourses> sortedCourse = new ArrayList<CompetitiveExamCourses>();
		sortedCourse.add(new CompetitiveExamCourses("C01", "CAT", "Vipul Goyal", 24, 60000));
		sortedCourse.add(new CompetitiveExamCourses("X01", "XAT", "Rahul Sharma", 20, 50000));
		sortedCourse.add(new CompetitiveExamCourses("J01", "JEE", "Rajesh Sarkar", 18, 30000));
		sortedCourse.add(new CompetitiveExamCourses("N01", "NMAT", "Rajendra Biswas", 16, 20000));
		sortedCourse.add(new CompetitiveExamCourses("N02", "NEET", "Tom Hanks", 30, 90000));
		sortedCourse.add(new CompetitiveExamCourses("G01", "GATE", "Santanu Biswas", 16, 25000));
		sortedCourse.add(new CompetitiveExamCourses("U01", "UPSC", "Rahul Bhadra", 36, 55000));
		sortedCourse.add(new CompetitiveExamCourses("S01", "SSC", "Bikash Saha", 14, 20000));
		sortedCourse.add(new CompetitiveExamCourses("C02", "CSE", "Laxman Roy", 34, 40000));
		sortedCourse.add(new CompetitiveExamCourses("G02", "GMAT", "Alex Hales", 28, 80000));
		sortedCourse.add(new CompetitiveExamCourses("I01", "IBPS", "Sukhla sharma", 15, 15000));
		sortedCourse.add(new CompetitiveExamCourses("C03", "CDS", "Arjun Singh", 15, 10000));
		sortedCourse.add(new CompetitiveExamCourses("S02", "SEED", "Raju Sharma", 12, 24000));
		sortedCourse.add(new CompetitiveExamCourses("L02", "LSAT", "Emily Rathore", 22, 35000));
		sortedCourse.add(new CompetitiveExamCourses("N03", "NDA", "Bijendra Singh", 18, 12000));
		sortedCourse.add(new CompetitiveExamCourses("I02", "IES", "Suman Dutta", 22, 23000));
		
		//Sorting on the basis of Ascending total fees
		Collections.sort(sortedCourse , new Comparator<CompetitiveExamCourses>() {
			@Override
			public int compare(CompetitiveExamCourses o1, CompetitiveExamCourses o2) {		
				return (int) (o1.getTotalFees() - o2.getTotalFees());
			}		
		});
		
		Collections.sort(sortedCourse,(o1, o2) -> (int) (o1.getTotalFees() - o2.getTotalFees()));
		
		System.out.println("Competitive Exam courses on the basis of Ascending total fees");
		System.out.println(sortedCourse);
		System.out.println("\n");
		
		//Sorting on the basis of Descending total fees
		Collections.sort(sortedCourse , new Comparator<CompetitiveExamCourses>() {
			@Override
			public int compare(CompetitiveExamCourses o1, CompetitiveExamCourses o2) {
				
				return (int) (o2.getTotalFees() - o1.getTotalFees());
			}	
		});
		Collections.sort(sortedCourse,(o1, o2) -> (int) (o2.getTotalFees() - o1.getTotalFees()));
		
		System.out.println("Competitive Exam courses on the basis of descending total fees");
		System.out.println(sortedCourse);
		System.out.println("\n");
		
		//Sorting on the basis of Ascending duration
		Collections.sort(sortedCourse , new Comparator<CompetitiveExamCourses>() {
			@Override
			public int compare(CompetitiveExamCourses o1, CompetitiveExamCourses o2) {
				
				return (int) (o1.getCourseDuration() - o2.getCourseDuration());
			}	
		});
		Collections.sort(sortedCourse,(o1, o2) -> (int) (o1.getCourseDuration() - o2.getCourseDuration()));
		
		System.out.println("Competitive Exam courses on the basis of Ascending duration");
		System.out.println(sortedCourse);
		
		
	}
		

}
