package main;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static Student [] students = new Student[5];

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		//메뉴
		while(true) {
			System.out.println("1.학생정보입력");
			System.out.println("2.학생정보삭제");
			System.out.println("3.성적표 출력");
			System.out.println("4.학생파일 출력");
			System.out.println("5.학생 검색");
			System.out.println("6.프로그램 종료");
			System.out.print("메뉴번호를 입력하세요 >> ");
			
			c = sc.nextInt();

			
			switch (c) {
				case 1:	//입력
					Info.AddStudent(students);
					break;
				case 2:	//삭제
					Info1.DeleteStudent(students);				
					break;
				case 3:	//성적표 출력
					Info2.OutputStudent(students);
					break;
				case 4:	//파일로 출력
					Info3.FileWriterStudent(students);
					break;
				case 5://검색
					Info4.Find(students);
					break;
				case 6: //종료
					System.out.println("프로그램 종료");
					System.exit(0);
					
				default :
					System.out.println("올바르지 않은 선택입니다.");
					break;
			}
		}		
	}		
}



