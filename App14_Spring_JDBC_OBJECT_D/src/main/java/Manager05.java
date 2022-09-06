import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImp;

public class Manager05 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImp daoImp = (StudentDAOImp) context.getBean("studentJDBCTemplate");

		System.out.println("----Deleting Record with ID = 2 -----");
		daoImp.delete(2);
	}
}
