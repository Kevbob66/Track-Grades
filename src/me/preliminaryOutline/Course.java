package me.preliminaryOutline;

import java.util.HashMap;

/**
 * Class which represents an individual school course
 * @author kevin
 *
 */
public class Course {
	
	/**Name of the course*/
	private String name;
	
	/**Student's grade in this course*/
	private double grade;
	
	/**HashMap representing the % each category matters for this course*/
	private HashMap<String, Double> gradeDistribution;
	
	/**
	 * Constructor for a course
	 * @param name
	 */
	public Course(String name, HashMap<String, Double> gradeDistribution) {
		this.name = name;
		this.gradeDistribution = gradeDistribution;
		this.grade = 0;
	}
	
	public boolean addAssignment(String category, double possiblePoints, double earnedPoints) {
		
	}
	
	private double calculateScore() {
		double result = 0;
		return result;
	}
	
	/**
	 * A private class which represents a single piece of Graded Work which the student wants to record
	 * e.g. A test, quiz, paper, homework, etc.
	 * @author kevin
	 *
	 */
	private class GradedWork {
		
		private String category;
		private double possiblePoints;
		private double earnedPoints;
		
		public GradedWork(String category, double possiblePoints, double earnedPoints) {
			this.category = category;
			this.possiblePoints = possiblePoints;
			this.earnedPoints = earnedPoints;
		}
		
	}
	
}
