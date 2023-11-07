package main;

import java.util.Scanner;

public class Info {
	
	public static void AddStudent(Student [] students) {
		Scanner sc = new Scanner(System.in);
		char c ='y';
		
		while (c == 'y' || c == 'Y') {
		
		int i=0;
		for(i=0; i < students.length; i++){
			if(students[i] == null){
				String name = null;
				int age,kor,eng,mat;
				
				System.out.println("학생정보를 입력 합니다.");
				
				boolean na = false;
				while(!na) {
					System.out.println("이름을 입력하세요.");
					name = sc.next();
					if(name.length() >=2) {
						na=true;
					}
					else {
						System.out.println("잘못 입력되었습니다. (2글자 이상)");
					}
				}
				System.out.println("나이을 입력하세요.");
				age = sc.nextInt();
				
				System.out.println("국어 성적을 입력하세요.");
				kor = sc.nextInt();
				
				System.out.println("영어 성적을 입력하세요.");
				eng = sc.nextInt();
				
				System.out.println("수학 성적을 입력하세요.");
				mat = sc.nextInt();
				
				
				Student stu = new Student();
				stu.setName(name, age, kor, eng, mat);
				students[i] = stu;
				
				break;
			}
		}
		
		
			if(i >= students.length)
			{
				System.out.println("학생 가득.");
				break;
			}
			else
			{
				System.out.println("학생 정보 입력 완료.");
			}
			while(true) { 
				System.out.print("계속 추가를 원하시면 (y/n): ");
				c = sc.next().charAt(0);
				if (c == 'y' || c == 'Y') {
					break;
				}
				else if (c == 'n'||c=='N') {
					break;
				}
				else {
					System.out.println("잘못 입력하셨습니다, 다시 입력해주십시요");
				}
			}
		}
	}
}
