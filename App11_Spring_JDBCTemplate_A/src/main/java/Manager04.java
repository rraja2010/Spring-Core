import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImplStoredProcedure;

public class Manager04 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImplStoredProcedure daoImplStoredProcedure = 
				(StudentDAOImplStoredProcedure) ctx.getBean("studentDAOImplStoredProcedure");
		   Student student = daoImplStoredProcedure.getStudent(1);
	     System.out.println(student);
	}
}
