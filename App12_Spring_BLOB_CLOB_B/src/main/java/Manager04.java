import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lara.serviceImp.StudentDAOImp;

public class Manager04 {
	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDAOImp studentDAOImp = (StudentDAOImp)ctx.getBean("studentJDBCTemplate");
		byte[] image = studentDAOImp.getImage("D:\\Wallpaper\\windows.jpg");
		studentDAOImp.updateImage(1, image);
		System.out.println("Done");
	}
}
