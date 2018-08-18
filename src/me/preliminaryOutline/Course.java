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
	
	
	
}
