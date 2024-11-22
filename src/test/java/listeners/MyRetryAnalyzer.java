package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//https://www.youtube.com/watch?v=yCDoQROrk-g
public class MyRetryAnalyzer implements IRetryAnalyzer {
	int count = 0;
	int retryLimit = 2;

	@Override
	public boolean retry(ITestResult result) {
		if (count < retryLimit) {
			count++;
			return true;
		}
		return false;
	}
}
