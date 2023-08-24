package java2.day25_제네릭2.Ex2;

public class Parson {

}

			/*
			 						-----extends -------> Worker
					 사람클래스
					 				-----extends -------> Student
					 															-----extends -------> HighStudent
					 															-----extends -------> MiddleStudent
			*/




// * 하나의 .java 파일 안에 여러개 클래스 선언 가능
// 직장인 클래스
class Worker extends Parson{}

// 학생 클래스
class Student extends Parson{}


// 고등학생 클래스
class HighStudent extends Student{}

// 중학생 클래스
class MiddleStudent extends Student{}
