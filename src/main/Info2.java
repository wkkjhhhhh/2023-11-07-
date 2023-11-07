package main;

public class Info2 {
	public static void OutputStudent(Student[] students) {
		System.out.println("성적표 출력");	
		//머리글
		System.out.println("이름\t나이\t극어\t영어\t수학\t평균");
    	System.out.println("---------------------------------------------");
		 
	     for (int i = 0; i < students.length; i++) {
	            if (students[i] != null) {
	                System.out.println(students[i].getName()+"\t"+students[i].getAge()+
	                	"\t"+students[i].getKor()+"\t"+students[i].getKor()+"\t"
	                		+students[i].getEng()+"\t"+students[i].getMath()+"\t"+Avg(students[i]));
	                System.out.println();
	            	}
	            else  {
	                	System.out.println("입력된 정보가 없습니다.");
	                
	            }
	        }
	    }

	    private static double Avg(Student student) {
	        int kor = student.getKor();
	        int eng = student.getEng();
	        int math = student.getMath();
	        return (kor + eng + math) / 3.0;
		
	}
}
