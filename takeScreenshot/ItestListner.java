package takeScreenshot;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListner extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		takescreenshot(result.getMethod().getMethodName()+".png");
		System.out.println("Screenshot captured");
	}

}
