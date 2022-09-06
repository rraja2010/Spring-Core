import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImpUsingPreparedStmt;

public class Manager08 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpUsingPreparedStmt daoImp = (StudentDAOImpUsingPreparedStmt) context
				.getBean("StudentDAOImpUsingPreparedStmt");

		List<Student> studentList = daoImp.listStudents();
		System.out.println("Below are the list of student");
		for (Student std : studentList) {
			System.out.println(std);
		}
	}
}
