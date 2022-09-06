import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImp;

public class Manager03 {
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
		student.setAge(10);

		Student student1 = new Student();
		student1.setId(2);
		student1.setAge(20);

		Student student2 = new Student();
		student2.setId(3);
		student2.setAge(30);

		Student student3 = new Student();
		student3.setId(4);
		student3.setAge(40);

		List<Student> students = new ArrayList<Student>();
		students.add(student);
		students.add(student1);
		students.add(student2);
		students.add(student3);

		studentJDBCTemplate.batchUpdateMultipleBatch(students);

		List<Student> updatedStudents = studentJDBCTemplate.listStudents();
		System.out.println("Updated Students");

		for (Student std : updatedStudents) {
			System.out.println(std);
		}
	}
}
