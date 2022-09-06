import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImp;

public class Manager03 {
	public static void main(String[] args) {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImp studentDAOImp = (StudentDAOImp)context.getBean("studentJDBCTemplate");
		System.out.println("Below are the total available records from the database!!");
		
		List<Student> studentList =studentDAOImp.listStudents();
		for (Student student : studentList) {
			System.out.println(student);
		}
		
		System.out.println("Total number of available records are::"+studentList.size());
	}
}
