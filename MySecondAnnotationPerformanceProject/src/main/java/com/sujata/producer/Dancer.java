package com.sujata.producer;

import org.springframework.stereotype.Component;

@Component("Amit")
public class Dancer implements Performer {

	
	
	
	@Override
	public void perform() {
		System.out.println("Dancer is performing in Free Style!");

	}

}
