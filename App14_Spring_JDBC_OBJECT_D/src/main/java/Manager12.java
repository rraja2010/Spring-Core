import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.bean.Student;
import com.lara.serviceImp.StudentDAOImpRowMapper;

public class Manager12 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImpRowMapper rowMapper = (StudentDAOImpRowMapper) context.getBean("StudentDAOImpRowMapper");
		List<Student> studentList=rowMapper.listStudents();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
}
