import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImp;

public class Manager04 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImp daoImp = (StudentDAOImp) context.getBean("studentJDBCTemplate");

		System.out.println("----Updating Record with ID = 2 -----");
		daoImp.update(2, 20);

		System.out.println("----Listing Record with ID = 2 -----");
		Student student = daoImp.getStudent(2);
		System.out.println(student);
	}
}
