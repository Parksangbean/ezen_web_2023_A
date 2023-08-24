package java2.day25_제네릭2.Ex2;public class Ex2_와일드카드제네릭타입 {
	 public static void main(String[] args) {
		
		// 1. 사람 객체
		 Parson parson = new Parson();
		 
		 // 2. 지원자객체 [ 지원자 생성자 에 사람 객체를 생성자 대입
		 Applicant<Parson> applicant = new Applicant<Parson>(parson);
		 
		 // 3. 모든지원 지원 가능한 코스 등록 함수
		 Course.registerCourse1(applicant);
		 
		 
		// ----- 코스 1 : (모든 지원서(사람 , 직장인, 학생,고등학생 , 중학생) )누구나 등록 가능한 코스 
		 Course.registerCourse1(new Applicant<Parson>(new Parson() ) );
		 Course.registerCourse1(new Applicant<Worker>(new Worker() ) );
		 Course.registerCourse1(new Applicant<Student>(new Student() ) );
		 Course.registerCourse1(new Applicant<HighStudent>(new HighStudent() ) );
		 Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent() ) );
		 
		 
		 
		// ----- 코스 2 : (모든 지원서(사람 , 직장인, 학생,고등학생 , 중학생) )누구나 등록 가능한 코스 
			 // Course.registerCourse2(new Applicant<>(new Parson() ) );
			//  Course.registerCourse2(new Applicant<>(new Worker() ) );
			 Course.registerCourse2( new Applicant<Student>(new Student()));
			 Course.registerCourse2( new Applicant<HighStudent>(new HighStudent() ) );
			 Course.registerCourse2( new Applicant<MiddleStudent>(new MiddleStudent() ) );	
				 
		// ----- 코스 3 : (모든 지원서(사람 , 직장인, 학생,고등학생 , 중학생) )누구나 등록 가능한 코스 
			Course.registerCourse3(new Applicant<Parson>(new Parson() ) );
			Course.registerCourse3(new Applicant<Worker>(new Worker() ) );
			// Course.registerCourse3(new Applicant<>(new Student() ) );
			// Course.registerCourse3(new Applicant<HighStudent>(new HighStudent() ) );
			//  Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent() ) );	
	}
}
