import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImpSimpleJdbcCall;

public class Manager15 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpSimpleJdbcCall jdbcCall = (StudentDAOImpSimpleJdbcCall) context
				.getBean("StudentDAOImpSimpleJdbcCall");
		Student student = jdbcCall.getStudent(1);
		System.out.print("ID : " + student.getId());
		System.out.print(", Name : " + student.getName());
		System.out.println(", Age : " + student.getAge());
	}
}