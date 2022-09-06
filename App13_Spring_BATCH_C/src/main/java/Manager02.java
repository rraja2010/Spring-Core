import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImp;

public class Manager02 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImp studentJDBCTemplate = (StudentDAOImp) ctx.getBean("studentJDBCTemplate");

		List<Student> initialStudents = studentJDBCTemplate.listStudents();
		System.out.println("Initial Students");

		for (Student std : initialStudents) {
			System.out.println(std);
		}

		Student student = new Student();
		student.setId(1);
		student.setAge(5);

		Student student1 = new Student();
		student1.setId(2);
		student1.setAge(10);

		Student student2 = new Student();
		student2.setId(3);
		student2.setAge(15);

		Student student3 = new Student();
		student3.setId(4);
		student3.setAge(20);

		List<Student> stdList = new ArrayList<Student>();
		stdList.add(student);
		stdList.add(student1);
		stdList.add(student2);
		stdList.add(student3);

		studentJDBCTemplate.batchUpdateUsingNamedParameter(stdList);

		List<Student> updatedStudents = studentJDBCTemplate.listStudents();
		System.out.println("Updated Students");

		for (Student std : updatedStudents) {
			System.out.println(std);
		}
	}
}
