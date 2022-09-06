import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImpUsingPreparedStmt;

public class Manager07 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpUsingPreparedStmt daoImp = (StudentDAOImpUsingPreparedStmt) context.getBean("StudentDAOImpUsingPreparedStmt");

		Student student = daoImp.getStudent(2);
		System.out.println("Below are the details of Requied Student!");
		System.out.println(student);
	}
}
