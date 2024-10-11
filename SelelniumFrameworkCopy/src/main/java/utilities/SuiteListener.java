package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class SuiteListener implements ITestListener {

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("SuiteListener: onFinish triggered. Sending email...");

        // Call the method to send the report after all tests have completed
        ExtentReportManager.flushReport();  // Flushes the extent report
        ExtentReportManager.sendReportByEmail();  // Sends the report via email
        System.out.println("Email sent successfully.");
    }

    // Other ITestListener methods can remain unimplemented if you don't need them.
    // You can implement them later if you want to handle specific events like onTestStart, onTestFailure, etc.
}
