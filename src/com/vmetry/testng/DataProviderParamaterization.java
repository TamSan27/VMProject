/*
 * package com.vmetry.testng;
 * 
 * import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import org.testng.Assert; import
 * org.testng.annotations.AfterClass; import org.testng.annotations.BeforeClass;
 * import org.testng.annotations.Test; import org.testng.asserts.SoftAssert;
 * 
 * public class DataProviderParamaterization { WebDriver driver; SoftAssert
 * softAssert;
 * 
 * @BeforeClass public void setUp() { driver = new ChromeDriver(); softAssert =
 * new SoftAssert(); }
 * 
 * @Test(dataProvider = "Vmetry Batch 11", dataProviderClass = DataSource.class)
 * public void validateUserPresence(String user, boolean presence) { boolean
 * found = false;
 * 
 * driver.get("https://www.w3schools.com/html/html_tables.asp"); WebElement tbl
 * = driver.findElement(By.id("customers")); List<WebElement> rows =
 * tbl.findElements(By.tagName("tr")); for (WebElement row : rows) { found =
 * false; List<WebElement> cols = row.findElements(By.tagName("td")); for
 * (WebElement col : cols) { if (col.getText().trim().equalsIgnoreCase(user)) {
 * found = true; break; } } if (found) { break; } } if (found == presence) {
 * Assert.assertTrue(found, "Data not present in the table"); } else {
 * Assert.assertFalse(found, "Data present in the table"); } }
 * 
 * @AfterClass public void tearDown() throws InterruptedException {
 * Thread.sleep(1500); driver.quit(); }
 * 
 * }
 */