import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImpSqlUpdate;

public class Manager17 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpSqlUpdate daoImpSqlUpdate = (StudentDAOImpSqlUpdate) context.getBean("StudentDAOImpSqlUpdate");
		System.out.println("----Updating Record with ID = 1 -----");
		daoImpSqlUpdate.update(1, 10);

		System.out.println("----Listing Record with ID = 1 -----");
		Student student = daoImpSqlUpdate.getStudent(1);

		System.out.print("ID : " + student.getId());
		System.out.print(", Name : " + student.getName());
		System.out.println(", Age : " + student.getAge());
	}
}