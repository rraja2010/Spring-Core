import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImpResultSetExtractor;

public class Manager11 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpResultSetExtractor daoImpResultSetExtractor = (StudentDAOImpResultSetExtractor) context.getBean("StudentDAOImpResultSetExtractor");
		List<Student> studentList=daoImpResultSetExtractor.listStudents();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
