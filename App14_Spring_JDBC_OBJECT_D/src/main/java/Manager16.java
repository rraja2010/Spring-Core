import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImpSqlQuery;

public class Manager16 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpSqlQuery jdbcCall = (StudentDAOImpSqlQuery) context
				.getBean("StudentDAOImpSqlQuery");
		List<Student> stdList = jdbcCall.listStudents();
		for (Student std : stdList) {
			System.out.println(std);
		}
	}
}