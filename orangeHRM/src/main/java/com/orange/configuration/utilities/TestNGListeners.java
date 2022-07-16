/*
 * package com.orange.configuration.utilities;
 * 
 * import java.io.File; import java.io.IOException; import java.nio.file.Files;
 * import java.nio.file.Path; import java.nio.file.Paths; import
 * java.text.SimpleDateFormat; import java.util.Calendar; import java.util.Date;
 * 
 * import org.testng.ITestContext; import org.testng.ITestListener; import
 * org.testng.ITestResult; import org.testng.log4testng.Logger;
 * 
 * import com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.Status; import
 * com.aventstack.extentreports.markuputils.ExtentColor; import
 * com.aventstack.extentreports.markuputils.MarkupHelper; import
 * com.aventstack.extentreports.reporter.ExtentHtmlReporter; import
 * com.orange.common.utilities.CaptureScreenshot; import
 * com.orange.constants.FilePaths;
 * 
 * 
 * public class TestNGListeners implements ITestListener { private static
 * ExtentHtmlReporter htmlReporter; private static ExtentReports extent; private
 * static ExtentTest extenLogger; private Configuration config; public static
 * ITestResult extentReport; private static Logger mainLogger =
 * Logger.getLogger(TestNGListeners.class); private static String timeStamp;
 * private static String actualResultData; private static String
 * expectedResultData; private static String inputData; private String name;
 * private static String screenshortdir = FilePaths.SCREENSHORT_DIR; private
 * static String reportdir = FilePaths.REPORT_DIR; private static String Report
 * = FilePaths.REPORT_CONFIG; private static String attachscreenshot =
 * FilePaths.ATTACHSCREENSHOT_DIR;
 * 
 * @Override public void onStart(ITestContext testContext) { timeStamp = new
 * SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
 * config = new Configuration(); //makeDir(screenshortdir); makeDir(reportdir);
 * htmlReporter = new ExtentHtmlReporter(Report);// specify location of the
 * report htmlReporter.loadXMLConfig(FilePaths.EXTENT_CONFIG);
 * htmlReporter.config().setChartVisibilityOnOpen(false);
 * htmlReporter.setAppendExisting(true); extent = new ExtentReports();
 * extent.attachReporter(htmlReporter); extent.setSystemInfo("Environemnt",
 * config.getDefaultEnv().toUpperCase()); extent.setSystemInfo("Host name",
 * config.getUrl()); extent.setSystemInfo("Browser", config.getBrowser());
 * extent.setSystemInfo("Headless",
 * config.isHeadlessmode().toString().toUpperCase());
 * extent.setSystemInfo("Incognito",
 * config.getIncognito().toString().toUpperCase()); }
 * 
 * @Override public void onTestStart(ITestResult result) { extentReport =
 * result; }
 * 
 * @Override public void onTestSuccess(ITestResult testResult) { extenLogger =
 * extent.createTest(testResult.getMethod().getMethodName()); // create new
 * entry in the report if (testResult.getName().contains("Loading")) {
 * extenLogger.log(Status.PASS, MarkupHelper.createLabel(testResult.getName(),
 * ExtentColor.TEAL)); // send the passed information to the report with GREEN
 * color highlighted // saveScreenshot(testResult);
 * extenLogger.getModel().setStartTime(getTime(testResult.getStartMillis()));
 * extenLogger.getModel().setEndTime(getTime(testResult.getEndMillis()));
 * 
 * } else { extenLogger.log(Status.PASS,
 * MarkupHelper.createLabel(testResult.getName(), ExtentColor.GREEN)); // send
 * the passed information to the report with GREEN color highlighted
 * extenLogger.log(Status.INFO, "Actual Result => " + actualResultData);
 * extenLogger.log(Status.INFO, "Expected Result => " + expectedResultData);
 * extenLogger.log(Status.INFO, "Input => " + inputData);
 * extenLogger.getModel().setStartTime(getTime(testResult.getStartMillis()));
 * extenLogger.getModel().setEndTime(getTime(testResult.getEndMillis())); } }
 * 
 * @Override public void onTestFailure(ITestResult testResult) { extenLogger =
 * extent.createTest(testResult.getMethod().getMethodName()); // create new
 * entry in the report extenLogger.log(Status.FAIL,
 * MarkupHelper.createLabel(testResult.getName(), ExtentColor.RED)); // send the
 * passed information to the report with RED color highlighted
 * extenLogger.fail(testResult.getThrowable());
 * extenLogger.getModel().setStartTime(getTime(testResult.getStartMillis()));
 * extenLogger.getModel().setEndTime(getTime(testResult.getEndMillis())); //
 * saveScreenshot(testResult);
 * 
 * }
 * 
 * @Override public void onTestSkipped(ITestResult testResult) { extenLogger =
 * extent.createTest(testResult.getName()); // create new entry in the report
 * extenLogger.log(Status.SKIP, MarkupHelper.createLabel(testResult.getName(),
 * ExtentColor.ORANGE)); extenLogger.skip(testResult.getThrowable());
 * extenLogger.getModel().setStartTime(getTime(testResult.getStartMillis()));
 * extenLogger.getModel().setEndTime(getTime(testResult.getEndMillis())); }
 * 
 * @Override public void onFinish(ITestContext testContext) {
 * System.out.println(String.format("*******Generated Extent report**** %s",
 * Report)); extent.flush(); }
 * 
 * 
 * private void saveScreenshot(ITestResult testResult) { name =
 * testResult.getName() + Timestamp.getTimestamp();
 * CaptureScreenshot.capturePage(TotumUtils.getDriver(), name, screenshortdir);
 * File screenshotDIR = new File(screenshortdir + name + ".PNG"); if
 * (screenshotDIR.exists()) { try { extenLogger.info("Screenshot is below:" +
 * extenLogger.addScreenCaptureFromPath(attachscreenshot + name + ".PNG"));
 * 
 * } catch (IOException e) { mainLogger.info(e); e.printStackTrace(); } } }
 * 
 * private String makeDir(String path) { Path dir = Paths.get(path); try {
 * Files.createDirectories(dir); } catch (IOException e) {
 * mainLogger.info("Cannot create directories - " + e); } return path; }
 * 
 * public void reportLogInfo(String expectedResult, String actualResult, String
 * inputs) { expectedResultData =expectedResult; actualResultData =actualResult;
 * inputData =inputs; }
 * 
 * private Date getTime(long millis) { Calendar calendar =
 * Calendar.getInstance(); calendar.setTimeInMillis(millis); return
 * calendar.getTime(); } }
 */