import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImpSimpleJdbcInsert;

public class Manager14 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpSimpleJdbcInsert jdbcInsert = (StudentDAOImpSimpleJdbcInsert) context
				.getBean("StudentDAOImpSimpleJdbcInsert");

		System.out.println("------Records Creation--------");
		jdbcInsert.create(14, "Gunnu", 5);

		System.out.println("------Listing Multiple Records--------");
		List<Student> students = jdbcInsert.listStudents();

		for (Student std : students) {
			System.out.println(std);
		}
	}
}
