import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImpStoredProcedure;

public class Manager18 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpStoredProcedure storedProcedure = (StudentDAOImpStoredProcedure) context
				.getBean("StudentDAOImpStoredProcedure");
		System.out.println("----Updating Record with ID = 1 -----");
		Student student = storedProcedure.getStudent(1);
		System.out.print("ID : " + student.getId());
		System.out.print(", Name : " + student.getName());
		System.out.println(", Age : " + student.getAge());
	}
}