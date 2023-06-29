package org.tnsif.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CardExecutor {

	public static void main(String[] args) 
	{
		
		//hard coding
		/*
		SBICard s=new SBICard();
		HDFCCard h=new HDFCCard();
		s.deposit();
		s.withdraw();
		h.deposit();
		h.withdraw();
		*/
		
		ApplicationContext b=new ClassPathXmlApplicationContext("beans.xml");
		/*
		SBICard s=(SBICard) b.getBean("sbi");
		s.deposit();
		s.withdraw();
		
		HDFCCard h=(HDFCCard) b.getBean("hdfc");
		h.deposit();
		h.withdraw();*/
		
		DebitCard s1=(DebitCard) b.getBean("hdfc");
		s1.deposit();
		s1.withdraw();
			

	}

}
