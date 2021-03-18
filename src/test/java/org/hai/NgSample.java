package org.hai;

import org.testng.annotations.Test;

public class NgSample {
	
		
		@Test
		private void tc0() {
			System.out.println("Hi");

		}
		
		@Test(enabled=false)
		private void tc1() {
			System.out.println("Hai");

		}
		
		@Test(priority=-1)
		private void tc2() {
			System.out.println("Haii");

		}
		
		@Test(invocationCount=3)
		private void tc3() {
			System.out.println("Hello");

		}

	}



