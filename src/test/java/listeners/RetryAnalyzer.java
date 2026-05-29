package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int count = 0;
	
	int retry = 3;

	@Override
	public boolean retry(ITestResult result) {
		
		if (count<=retry) {
			
			count++;
			
			return true;
			
		}
		
		return false;
	}

}
