import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.serviceImp.StudentDAOImpUsingPreparedStmt;

public class Manager06 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpUsingPreparedStmt daoImp = (StudentDAOImpUsingPreparedStmt) context.getBean("StudentDAOImpUsingPreparedStmt");

		System.out.println("------Records Creation--------");
		daoImp.create(2, "Nira", 28);
		System.out.println("Above recods are inserted successfully in the database!");
	}
}
