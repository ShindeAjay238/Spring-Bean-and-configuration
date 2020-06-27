package org.ajay.study;

import org.springframework.stereotype.Component;

@Component("happy")
public class HappyFortuneService implements FortuneService {

	

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "get furtune service";
	}

}
