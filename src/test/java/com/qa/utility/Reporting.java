package com.qa.utility;

	import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

	public class Reporting extends TestListenerAdapter{
		public ExtentHtmlReporter htmlReporter;
		public ExtentReports exReports;
		public ExtentTest xTest;
		
		public void onStart(ITestContext context) { 
		
			
			String DateStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			String repName= "Test-Report-"+DateStamp+ ".html";
			htmlReporter = new 	ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/" +repName);
			exReports =new ExtentReports();
			
			
			//Configuration
			exReports.attachReporter(htmlReporter);
			exReports.setSystemInfo("HostName" , "Localhost");
			exReports.setSystemInfo("QA" , "ANEES");
			exReports.setSystemInfo("OS" , "Windows 10");
			
			htmlReporter.config().setDocumentTitle("Test Automation");
			htmlReporter.config().setReportName("Functional Test Report");
			htmlReporter.config().setTheme(Theme.DARK);
			
			// add scrreshot to report
			htmlReporter.config().setAutoCreateRelativePathMedia(true);
		}
		
		public void onTestFailure(ITestResult res)
		{
			  xTest=exReports.createTest(res.getName()); //creayte an entry in the extent report
			  xTest.log(Status.FAIL, MarkupHelper.createLabel(res.getName(), ExtentColor.GREEN));
			  xTest.log(Status.FAIL,"Test is Failed");
			  
			  //to get details of failure
			  
			  xTest.log(Status.FAIL, res.getThrowable());
			  String SSName= System.getProperty("user.dir")+"/ScreenShots/"+res.getName()+".png";
			  
			  File file=new File(SSName);
			  if(file.exists()) {
				  try {
					  xTest.fail("ScreenShot for the test failed is : "+  xTest.addScreenCaptureFromPath(SSName));
				  }
		
				  catch(Exception e)
				  {
					  e.printStackTrace();
				  }
			  
			  }
		}
			   

		public void onTestSkipped(ITestContext res)
		{
			 xTest=exReports.createTest(res.getName()); //creayte an entry in the extent report
			  xTest.log(Status.SKIP, MarkupHelper.createLabel(res.getName(), ExtentColor.GREEN));
			  xTest.log(Status.SKIP,"Test is Skipped");
		
		}
		public void onTestSuccess(ITestResult result) {
		
			  xTest=exReports.createTest(result.getName()); //creayte an entry in the extent report
			  xTest.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
			  xTest.log(Status.PASS,"Test is passed");
			  
			  
			  ///to attach ss to report
			  //xTest.log(Status.PASS, result.getThrowable());
			 // String SSsName= System.getProperty("user.dir")+"/ScreenShots/"+result.getName()+".png";
			  
			  /*File file=new File(SSsName);
			  if(file.exists()) {
				  try {
					  xTest.pass("ScreenShot for the test Passed is : "+  xTest.addScreenCaptureFromPath(SSsName));
				  }
		
				  catch(Exception e)
				  {
					  e.printStackTrace();
				  }
			  
			  }*/
			  
			
		}
		
		
		public void onFinish(ITestContext context) {
	
			exReports.flush();
		}
		
	     
	
	

	}



