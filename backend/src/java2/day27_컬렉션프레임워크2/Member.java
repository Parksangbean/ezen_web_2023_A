package java2.day27_컬렉션프레임워크2;

public class Member {

	   // 필드
	   public String name; // 이름
	   public int age; // 나이
	   
	   // 생성자
	   public Member(String name, int age) {
	      super();
	      this.name = name;
	      this.age = age;
	   }
	   
	   // Object (모든 클래스는 Object로부터 자동으로 상속받음)의 메소드를 재정의
	   public int hashCode() {
	      return name.hashCode()+age;
	   }
	   
	   public boolean equals(Object obj) {
	      if(obj instanceof Member target) {
	         return target.name.equals(name) && (target.age == age);
	      } else {
	         return false;
	      }
	      
	   }

	@Override
		public String toString() {
			return "Member [name=" + name + ", age=" + age + "]";
		}
	}