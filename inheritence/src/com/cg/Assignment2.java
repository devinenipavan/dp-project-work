
	package com.cg;
	import java.time.LocalDate;
	import java.time.Period;
	public class Assignment2 {
		private String firstName;
		private char gender;
		private String lastName;
		private int age;
		private float weight;
		public Assignment2(String firstName, char gender, String lastName, int age, float weight) {
			super();
			this.firstName = firstName;
			this.gender = gender;
			this.lastName = lastName;
			this.age = age;
			this.weight = weight;
		}

		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public float getWeight() {
			return weight;
		}
		public void setWeight(float weight) {
			this.weight = weight;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public void showAssignment2() {
			System.out.println("First Name = "+firstName);
			System.out.println("Gender = "+gender);
			System.out.println("Last Name = "+lastName);
			System.out.println("Age = "+age);
			System.out.println("Weight = "+weight);
		}
	}

}
