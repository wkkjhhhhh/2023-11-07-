package main;

import java.util.Scanner;

public class Info1 {
	
	public static void DeleteStudent(Student[] students) {
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제할 학생을 선택하세요 : ");
		        
		       int count = 0;
		       for (int i = 0; i < students.length; i++) {
		           if (students[i] != null) {
		               System.out.println("[" + (count + 1) + "]" + students[i].getName());
		               count++;
		           }
		       }
		       if (count == 0) {
		           System.out.println("삭제할 학생이 없습니다.");
		       } else {
		           System.out.println("[" + (count + 1) + "] 돌아가기");
		           System.out.println("[" + (count + 2) + "] 전체 학생 정보 삭제");
		           int input = sc.nextInt();
		            
		           if (input >= 1 && input <= count) {
		               int studentIndex = -1;
		               for (int i = 0; i < students.length; i++) {
		                   if (students[i] != null) {
		                       if (input == 1) {
		                           studentIndex = i;
		                           break;
		                       }
		                       input--;
		                   }
		               }
		               if (studentIndex != -1) {
		                   String deletedStudentName = students[studentIndex].getName();
		                   students[studentIndex] = null;
		                   System.out.println(deletedStudentName + "학생이 삭제되었습니다.");
		               }
		           }
		               else if (input == count + 2) {
		               	for (int i = 0; i < students.length; i++) {
		                       students[i] = null;
		               	}
		                System.out.println("모든 학생 정보가 삭제되었습니다.");
		                return;
		       }
		     }
		   
	}
}
		           
		        
		    