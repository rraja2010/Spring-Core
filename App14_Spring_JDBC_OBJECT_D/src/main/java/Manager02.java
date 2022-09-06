import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImp;

public class Manager02 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImp studentJDBCTemplate = (StudentDAOImp) ctx.getBean("studentJDBCTemplate");

		System.out.println("------Getting a recods for specified Student--------");
		Student student = studentJDBCTemplate.getStudent(1);
		System.out.println("Student Details :" + student);

	}
}
