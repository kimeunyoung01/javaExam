package exam01;

import java.util.GregorianCalendar;

import exam02.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println(calendar);
		Person person = new Person("홍길동", 20, "신수동");
		System.out.println(   person  );
		System.out.println(   person.getName()  );

		//한줄복사 : ctrl + alt + 방향키아래
	}
}
