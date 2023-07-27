package 과제.과제10;

public class Member {
   String id;      
   String password;
   String name;
   String number;
   int age;
   
   // 2. 생성자
      // 1.  매게변수 5개 정의한 생성자
   
   public Member(String id,String password,String name, String number, int age) {   
      this.id = id; 
      this.password = password;
      this.name = name;
      this.number = number;
      this.age = age;   
   }   
}