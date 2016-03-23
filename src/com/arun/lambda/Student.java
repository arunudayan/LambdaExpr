package com.arun.lambda;

public class Student {
	private String name;
	private double score;
	private int gradYear;
	
	
	public Student(String name, double score, int gradYear){
		this.name = name;
		this.score = score;
		this.gradYear = gradYear;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}
	
	
}
