package com.training.testcases;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class robotClass extends MethodsForTestTekArch{
	
	
	@Test
	public static void verification() throws Exception {
		
	String str = "https://qa-tekarch.firebaseapp.com";
	LaunchWeb(str);
	//LoginPage();
	Robot robot = new Robot();
	robot.mouseMove(490,530);
	Thread.sleep(1000);
	robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
	robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
	//robot.keyPress(KeyEvent.VK_DOWN);
	//robot.mouseWheel(50);
	}
	
}
