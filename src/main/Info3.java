package main;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Info3 {
	public static void FileWriterStudent(Student[] students)throws IOException  {
		LocalDate now = LocalDate.now();
		String date = now.format(DateTimeFormatter.ofPattern("yyyyMMDD"));
		FileWriter output = new FileWriter("C:/Users/YJ/eclipse-workspace/main/src/main_"+date+" .text");
		System.out.println("성적표 출력");	
		//머리글
		String data ="이름\t나이\t국어\t영어\t수학\t평균"+"'\n'";
		System.out.print(data);
		output.write(data);
		
		data ="-----------------------------------"+'\n';
		System.out.print(data);
		output.write(data);
		
	     for (int i = 0; i < students.length; i++) {
	            if (students[i] != null) {
	                data=students[i].getName()+"\t"+students[i].getAge()+
	                	"\t"+students[i].getKor()+"\t"+students[i].getKor()+"\t"
	                		+students[i].getEng()+"\t"+students[i].getMath()+"\t"+Avg(students[i]);
	                System.out.println(data);
	    			output.write(data + '\n');
	            	}
	            else  {
	                	System.out.println("입력된 정보가 없습니다.");
	                	data="입력된 정보가 없습니다."+'\n';
	            		System.out.print(data);
	            		output.write(data);
	            }
	        }
	     output.close();
	    }

	    private static double Avg(Student student) {
	        int kor = student.getKor();
	        int eng = student.getEng();
	        int math = student.getMath();
	        return (kor + eng + math) / 3.0;
        
	}
}
