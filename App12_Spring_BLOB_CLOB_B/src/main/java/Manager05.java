import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.serviceImp.StudentDAOImp;

public class Manager05 {
	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImp studentDAOImp = (StudentDAOImp) ctx.getBean("studentJDBCTemplate");
		int id = 1;
		studentDAOImp.updateDescription(id, "Raja is very cool person!");
		System.out.println("Update has done successfully for id::" + id);
	}
}
