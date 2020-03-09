/*
 * package com.vmetry.testng;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.testng.annotations.AfterClass; import org.testng.annotations.BeforeClass;
 * import org.testng.annotations.BeforeMethod; import
 * org.testng.annotations.Test; import org.testng.asserts.SoftAssert;
 * 
 * 
 * public class Verification { WebDriver driver; String url1 =
 * "http://www.cricinfo.com/", title1 =
 * "cricinfo - Cricket Live Scores, Stats, Schedules, Fixtures & News"; String
 * url2 = "https://www.cricbuzz.com/", title2 =
 * "Cricket Score, Schedule, Latest News, Stats & Videos | cricbuzz.com";
 * SoftAssert softAssert;
 * 
 * @BeforeClass public void setUp() { driver = new ChromeDriver();
 * driver.get(url1); }
 * 
 * @BeforeMethod public void beforeMethod() { softAssert = new SoftAssert(); }
 * 
 * @Test(priority = 0) public void validateCricinfo() {
 * softAssert.assertEquals(driver.getCurrentUrl(), url1);
 * softAssert.assertEquals(driver.getTitle(), title1); softAssert.assertAll(); }
 * 
 * @Test(priority = 1) public void validateCricBuzz() { driver.get(url2);
 * softAssert.assertEquals(driver.getCurrentUrl(), url2);
 * softAssert.assertEquals(driver.getTitle(), title2); softAssert.assertAll(); }
 * 
 * @AfterClass public void tearDown() throws InterruptedException {
 * Thread.sleep(1500); driver.quit(); } }
 */