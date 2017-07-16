package co.texas;

import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Dealer {
   public static void main(String[] args) {
	   FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
	   User carModel=(User) context.getBean("user");
	   carModel.getCarModel();
	   context.close();
}
}
