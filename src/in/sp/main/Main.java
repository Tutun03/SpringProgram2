package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.student;
import in.sp.resource.SpringConfigFile;

public class Main {
public static void main(String[] args) {
	
	ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
    student std=(student)context.getBean("stdentobj");
    std.toString();
    
}

}
