package com.office;

import com.office.config.Config;
import com.office.dummy.Dummy;

public class MainClass {
	
	public static void main(String[] args) {
		
		// assemble
		Container container = Container.getInstance();
		
		// dummy
		if (Config.IS_DEV) {
			new Dummy().setDummy();
		}
		
		// 실행
		container.getHomeController().execute();
		
	}

}
