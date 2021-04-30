package Lecture_19;

import Lecture_19.client.Student;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Heap<Student> heap = new Heap<>();
		// heap.add(new Student(400, 6, "A"));
		// heap.add(new Student(100, 9, "B"));
		// heap.add(new Student(700, 3, "C"));
		// heap.add(new Student(200, 8, "D"));
		// heap.add(new Student(900, 1, "E"));
		// heap.add(new Student(300, 7, "F"));
		// heap.add(new Student(800, 2, "G"));
		// heap.add(new Student(500, 5, "H"));
		// heap.add(new Student(600, 4, "I"));
		//
		// heap.display();
		//
		// heap.remove();
		// System.out.println("****************");
		// heap.display();
		Student[] students = new Student[9];
		students[0] = new Student(400, 6, "A");
		students[1] = new Student(300, 7, "B");
		students[2] = new Student(500, 5, "C");
		students[3] = new Student(200, 8, "D");
		students[4] = new Student(100, 9, "E");
		students[5] = new Student(800, 2, "F");
		students[6] = new Student(600, 4, "G");
		students[7] = new Student(700, 3, "H");
		students[8] = new Student(900, 1, "I");

		Heap<Student> heap = new Heap<>(students, false);
		heap.display();
		System.out.println("******************************");
		heap.remove();
		heap.display();
	}

	public static class Student implements Comparable<Student> {
		int marks;
		int rank;
		String name;

		Student(int marks, int rank, String name) {
			this.marks = marks;
			this.name = name;
			this.rank = rank;
		}

		public String toString() {
			return "{" + this.name + " ,M=" + this.marks + " ,R=" + this.rank + "}";
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.marks - o.marks;
		}

	}

}
