package main;

import java.util.Scanner;

public class Info4 {
		public static void Find(Student[] students) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("검색할 이름을 적어주세요.");
			boolean flag = false;
			String name =s.next();
			for(Student a : students) {
				if(a!=null && a.getName().contains(name)) {
					System.out.println("이름\t나이\t국어\t영어\t수학\t");
					System.out.println("------------------------------------");
					System.out.println(a.getName()+"\t"+ a.getAge()+"\t"
					+a.getKor()+"\t"+a.getEng()+"\t"+a.getMath());
					flag =true;
				}
			}
			if(!flag) {
				System.out.println("해당 학생은 존재하지 않습니다.");
			}
			
		}

}
