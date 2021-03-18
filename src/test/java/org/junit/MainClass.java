package org.junit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Sample.class,Sample1.class})

public class MainClass {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(SuiteClasses.class);
		int failureCount = result.getFailureCount();
		System.out.println("Failure Count " +failureCount);
		int ignoreCount = result.getIgnoreCount();
		System.out.println("Ignore Count " +ignoreCount);
		int runCount = result.getRunCount();
		System.out.println("Run Count "+runCount);
		long runTime = result.getRunTime();
		System.out.println("Run Time "+runTime);
		List<Failure> failures = result.getFailures();
		for (Failure f : failures) {
			System.out.println(f.toString());
			
			
		}
	}

}
