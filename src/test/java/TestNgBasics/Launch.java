package TestNgBasics;

import org.testng.annotations.Test;

public class Launch {
	public static void main(String[] args) {
		
		System.out.println("I am main");
	}
	@Test
	public void main() {
		System.out.println("I am TestNG");
	}
}