import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImpNamedParameter;

public class Manager13 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpNamedParameter namedParameter = (StudentDAOImpNamedParameter) context.getBean("StudentDAOImpNamedParameter");
		String des = "Raja is from bangalore and his native is in Tamilnadu!!";
		namedParameter.updateDescription(1, des);
		System.out.println(des +" | has updated for id::"+ 1);
	}
}

