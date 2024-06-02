package common;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import Utilities.testUtils;

public class RetryListerner implements IAnnotationTransformer {

    
	
	   	    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod)
	   	    {
	        // Set the retry analyzer for each test method
	        annotation.setRetryAnalyzer(Retry.class);
	    }

	
}
