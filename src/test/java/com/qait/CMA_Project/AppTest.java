package com.qait.CMA_Project;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		try {
			Thread.sleep(1000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_WINDOWS);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_WINDOWS);

			Screen screen = new Screen();
			System.setProperty("webdriver.chrome.driver", "src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Drivers" + File.separator + "chromedriver.exe");

			Pattern Ask_Textbox = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Ask_Textbox.PNG");
			screen.click(Ask_Textbox);
			
			Thread.sleep(3000);
			
			screen.type("Cisco");

			Thread.sleep(5000);

			Pattern Cisco_tab = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Cisco_Button.PNG");
			screen.click(Cisco_tab);

			Thread.sleep(5000);

			Pattern Cisco_Connect_Button = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Cisco_Connect_Button.PNG");
			screen.wait(Cisco_Connect_Button, 3);
			screen.click(Cisco_Connect_Button);

			Thread.sleep(6000);

			Pattern Cisco_Password = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Cisco_Password.PNG");
			screen.type(Cisco_Password, "Qait@121");

			Pattern Cisco_OK_Button = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Cisco_OK_Button.PNG");
			screen.click(Cisco_OK_Button);

			Thread.sleep(5000);

			
			WebDriver driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get("http://cma.cengage.com/");
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver1.navigate().refresh();

			Pattern cma_login_textbox = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Login_Textbox.PNG");
			screen.wait(cma_login_textbox, 5);
			screen.type(cma_login_textbox, "akashyap");

			Pattern cma_password_textbox = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Password_Textbox.PNG");
			screen.type(cma_password_textbox, "q@1nfotech");

			Pattern login_button = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Login_Button.PNG");
			screen.click(login_button);

			Pattern project_WF_tab = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "ProjectWF_Tab.PNG");
			screen.wait(project_WF_tab, 10);
			screen.click(project_WF_tab);

			Pattern positive_sign_button = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Workflow_Button.PNG");
			screen.click(positive_sign_button);

			Pattern image_StatusReportTab = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "status_Report_Tab.PNG");
			screen.wait(image_StatusReportTab, 5);
			screen.click(image_StatusReportTab);

			Pattern select_release_dropdown = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Release_Version_Selection.PNG");
			screen.wait(select_release_dropdown, 5);
			screen.click(select_release_dropdown);
			screen.type("March 2017");

			Pattern click_blank_screen_for_export_file = new Pattern("src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "Images" + File.separator + "Blank_Screen_Export.PNG");
			screen.wait(click_blank_screen_for_export_file, 10);
			screen.click(click_blank_screen_for_export_file);

			Thread.sleep(5000);

			Pattern export_button_in_status_report = new Pattern("src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "Images" + File.separator + "Export_Button.PNG");
			screen.wait(export_button_in_status_report, 10);
			screen.click(export_button_in_status_report);

			Pattern switch_browser = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "switch_browser.PNG");
			screen.wait(switch_browser, 10);
			screen.doubleClick(switch_browser);

			Thread.sleep(3000);

			Pattern march_tab = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Marc_Tab.PNG");
			screen.wait(march_tab, 5);
			screen.click(march_tab);

			Thread.sleep(5000);

			File src = ((TakesScreenshot) driver1).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File("C:\\Users\\akashsharma\\Desktop\\SAM_ProjectsTask_ForToday.PNG"));
			
			driver1.quit();
			Thread.sleep(5000);
			
			System.out.println("Web Browser closed");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://gmail.com/");
			
			System.out.println("New Web Browser Open");
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector("#Email")).sendKeys("samprojects16@gmail.com");
			
			driver.findElement(By.cssSelector("#next")).click();
			
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector("#Passwd")).sendKeys("password@123");
			
			driver.findElement(By.cssSelector("#signIn")).click();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.findElement(By.cssSelector(".aic .z0 div")).click();
			
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector(".oj div textarea")).sendKeys("alokkashyap@qainfotech.com\n"
					+ "amitkumartomar@qainfotech.com\n"
					+ "akash.sharma@qainfotech.com\n"
					+ "tushargupta1@qainfotech.com\n"
					+ "nitindrubra@qainfotech.com\n"
					+ "similmittal@qainfotech.com\n"
					+ "shailjajain@qainfotech.com\n"
					+ "mohitchauhan@qainfotech.com\n"
					+ "naveen.kumar@qainfotech.com\n"
					+ "aditikaloni@qainfotech.com\n"
					+ "pranavbatra@qainfotech.com\n"
					+ "nehachawla@qainfotech.com\n"
					+ "pratishthasingh@qainfotech.com\n"
					+ "paras@qainfotech.com\n"
					+ "sachinkumarsingh@qainfotech.com\n"
					+ "alokmishra@qainfotech.com");
			
			driver.findElement(By.cssSelector(".aoD.az6 input")).sendKeys("Current SAM Projects Task in CMA");
			
			driver.findElement(By.cssSelector(".Ar.Au div")).sendKeys("Hi All,\n"
					+ "Please refer attachments for projects count with steps available in QA Court (Total work for the day)\n"
					+ "Thank You\n\n"
					+ "Best regards\n"
					+ "SAM Team.");
			
			driver.findElement(By.cssSelector(".wG.J-Z-I div div div")).click();
			
			Thread.sleep(4000);
			
			Pattern Desktop = new Pattern("src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "Images" + File.separator + "Desktop.PNG");
			screen.click(Desktop);
			
			Pattern File_Name = new Pattern("src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "Images" + File.separator + "FileName_Textbox.PNG");
			screen.click(File_Name);
			screen.type("SAM_ProjectsTask_ForToday.PNG");
			
			Pattern Open_button = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Open_button.PNG");
			screen.click(Open_button);

			Thread.sleep(6000);
			
			driver.findElement(By.cssSelector(".wG.J-Z-I div div div")).click();
			
			Pattern Downloads = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Downloads.PNG");
			screen.click(Downloads);
			
			Pattern File_Name1 = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "FileName_Textbox.PNG");
			screen.click(File_Name1);
			screen.type("Report.xlsx");

			Pattern Open_button1 = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Open_button.PNG");
			screen.click(Open_button1);
			
			Thread.sleep(6000);
			
			driver.findElement(By.cssSelector(".gU.Up div")).click();
			
			driver.quit();
			
			/*Pattern desktop_screenshot_folder = new Pattern("src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "Images" + File.separator + "screenshots.PNG");
			screen.doubleClick(desktop_screenshot_folder);
*/
			/*Pattern screenshot_captured = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "SAM_ProjectsTask_ForToday.PNG");
			screen.rightClick(screenshot_captured);

			Pattern send_screenshot_link = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Send_To.PNG");
			screen.wait(send_screenshot_link, 2);
			screen.click(send_screenshot_link);

			Pattern mail_recipient_send_screenshot_link = new Pattern("src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "Images" + File.separator + "Mail_Recipient.PNG");
			screen.click(mail_recipient_send_screenshot_link);

			Pattern attach_dropdown_mail_recipient = new Pattern("src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "Images" + File.separator + "Attach_Dropdown.PNG");
			screen.click(attach_dropdown_mail_recipient);

			Thread.sleep(2000);

			Pattern attach_original_mail_recipient = new Pattern("src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "Images" + File.separator + "Attach_OriginalSize.PNG");
			screen.click(attach_original_mail_recipient);

			Pattern attach_button_mail_recipient = new Pattern("src" + File.separator + "main" + File.separator
					+ "resources" + File.separator + "Images" + File.separator + "Attach_Button.PNG");
			screen.click(attach_button_mail_recipient);

			Thread.sleep(5000);

			Pattern outlook_save_button = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Save_Button.PNG");
			screen.click(outlook_save_button);

			Pattern To_Textbox = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "To_Textbox_Button.PNG");
			screen.click(To_Textbox);

			Pattern outlook_to_textbox = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "To_Textbox_Button.PNG");
			screen.type(outlook_to_textbox, "alokkashyap@qainfotech.com; amitkumartomar@qainfotech.com; tushargupta1@qainfotech.com; "
					+ "akash.sharma@qainfotech.com; nitindrubra@qainfotech.com; similmittal@qainfotech.com; shailjajain@qainfotech.com; "
					+ "mohitchauhan@qainfotech.com; naveen.kumar@qainfotech.com; aditikaloni@qainfotech.com; pranavbatra@qainfotech.com; "
					+ "nehachawla@qainfotech.com; pratishthasingh@qainfotech.com");

			Pattern outlook_mail_body = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Mail_Body.PNG");
			screen.click(outlook_mail_body);
			screen.wait(outlook_mail_body, 3);
			screen.type(outlook_mail_body, "Hi team this is your Today's projects count");
			
			Pattern Attach_File_Button = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Attach_file.PNG");
			screen.click(Attach_File_Button);
			
			Pattern BrowsePC_Button = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Browse_PC.PNG");
			screen.click(BrowsePC_Button);
			
			Thread.sleep(2000);
			
			Pattern Downloads = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Downloads.PNG");
			screen.click(Downloads);
			
			Pattern File_Name = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "FileName_Textbox.PNG");
			screen.click(File_Name);
			screen.type("Report.xlsx");
			
			Pattern Open_button = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Open_button.PNG");
			screen.click(Open_button);

			Pattern outlook_send_button = new Pattern("src" + File.separator + "main" + File.separator + "resources"
					+ File.separator + "Images" + File.separator + "Send_Button.PNG");
			screen.click(outlook_send_button);
*/		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
