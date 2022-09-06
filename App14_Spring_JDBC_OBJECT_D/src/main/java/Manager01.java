import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.serviceImp.StudentDAOImp;

public class Manager01 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImp studentJDBCTemplate = (StudentDAOImp) ctx.getBean("studentJDBCTemplate");
		System.out.println("------Records Creation--------");
		studentJDBCTemplate.create(9, "Raja", 29);
		studentJDBCTemplate.create(10, "Abhimanyu", 28);
		studentJDBCTemplate.create(11, "Pintu", 30);
		System.out.println("Above recods are inserted successfully in the database!");
	}
}
