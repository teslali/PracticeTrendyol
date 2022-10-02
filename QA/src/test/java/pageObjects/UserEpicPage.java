package pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteKeyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.GenericUtils;
import utils.TestContextSetup;

public class UserEpicPage {
	public WebDriver driver;
	GenericUtils genericUtils;
	TestContextSetup testContextSetup;

	public UserEpicPage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	public UserEpicPage(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.genericUtils = testContextSetup.pageObjectManager.getGenericUtils();
	}

	By clsPop = By.xpath("//*[name()='path' and @id='Combined-Shape']");
	By cookieAccept = By.xpath("//button[@id='onetrust-accept-btn-handler']");
	By header = By.xpath("//img[@alt='Trendyol']");
	By loginLanding = By.xpath("//div[@class='login-button']");
	By emailInput = By.xpath("//input[@id='login-email']");
	By passwordInput = By.xpath("//input[@id='login-password-input']");
	By passwordBtn = By.xpath("//button[@type='submit']//span[contains(text(),'Giriş Yap')]");
	By drpdwnLogin = By.xpath("//p[contains(text(),'Giriş Yap')]");
	By google = By.xpath("//i[@class='q-icon icon-google i-google']");
	By googleMail = By.id("identifierId");
	By googleNext = By.xpath("//span[contains(text(),'İleri')]");
	By googlePassword = By.xpath("//input[@name='password']");
	By googleLgn = By.xpath("//span[contains(text(),'İleri')]");
	By searchBar = By.xpath("//input[@placeholder='Aradığınız ürün, kategori veya markayı yazınız']");
	By searchBtn = By.xpath("//i[@class='ft51BU2r']");
	By kadinHead = By.xpath("//a[@class='category-header'][contains(text(),'Kadın')]");
	By kadinMont = By.xpath("//div[@id='sub-nav-1']//a[contains(text(),'Mont')]");
	By erkekHead = By.xpath("//a[@class='category-header'][normalize-space()='Erkek']");
	By erkekCeket = By.xpath("//div[@id='sub-nav-2']//a[contains(text(),'Ceket')]");
	By erkekGomlek = By.xpath("//div[@id='sub-nav-2']//a[contains(text(),'Gömlek')]");
	By erkekBuy = By.xpath("(//span[@title='Altınyıldız Classics'][contains(text(),'Altınyıldız Classics')])[5]");
	By erkekBuy2 = By.xpath("(//img[@loading='lazy'])[20]");
	By altinyildiz = By.xpath("(//div)[255]");
	By cocukHead = By.xpath("//a[normalize-space()='Çocuk']");
	By cocukMendil = By.xpath("//a[normalize-space()='Islak Mendil']");
	By evHead = By.xpath("//a[normalize-space()='Ev & Mobilya']");
	By evPerde = By.xpath("//a[normalize-space()='Perde']");
	By marketHead = By.xpath("//a[normalize-space()='Süpermarket']");
	By marketCay = By.xpath("//a[normalize-space()='Çay']");
	By kozmetikHead = By.xpath("//a[@class='category-header'][normalize-space()='Kozmetik']");
	By kozmetikMakyaj = By.xpath("//a[normalize-space()='Makyaj Seti']");
	By ayakkabiHead = By.xpath("//a[contains(text(),'Ayakkabı & Çanta')]");
	By ayakkabiBot = By.xpath("//a[normalize-space()='Bot']");
	By saatHead = By.xpath("//a[@class='category-header'][normalize-space()='Saat & Aksesuar']");
	By saatCuzdan = By.xpath("//div[@id='sub-nav-10']//a[contains(text(),'Cüzdan & Kartlık')]");
	By elektronikHead = By.xpath("//a[@class='category-header'][normalize-space()='Elektronik']");
	By elektronikXbox = By.xpath("//a[normalize-space()='Xbox']");
	By sporHead = By.xpath("//a[normalize-space()='Spor&Outdoor']");
	By sporBilal = By.xpath("//a[normalize-space()='Okçuluk']");
	By myAccount = By.xpath("//p[contains(text(),'Hesabım')]");
	By logOut = By.xpath("//p[contains(text(),'Çıkış Yap')]");
	By ytSearch = By.xpath("//button[@id='search-icon-legacy']//yt-icon[@class='style-scope ytd-searchbox']");
	By ytVideo = By.xpath("//div[@class='ytp-left-controls']//button[@title='Oynat (k)']");
	By ytEmpty = By
			.xpath("//ytd-comments-header-renderer[@class='style-scope ytd-item-section-renderer']//div[@id='title']");
	By sagFoto = By.xpath("//div[@class='product-image-container']//i[@class='i-arrow-right right']");
	By firstColor = By.xpath("(//img[@loading='lazy'])[9]");
	By secondColor = By.xpath("(//img[@loading='lazy'])[10]");
	By thirdColor = By.xpath("(//img[@loading='lazy'])[11]");
	By xLarge = By.xpath("//div[@title='Beden seçmek için tıklayınız'][normalize-space()='XL']");
	By addCart = By.xpath("//div[@class='product-button-container']");
	By fiyat = By.xpath("//div[6]/div/div[2]");
	By prcRange1 = By.cssSelector(".min");
	By prcRange2 = By.cssSelector(".max");
	By prcRangeSearch = By.xpath("//button[@class='fltr-srch-prc-rng-srch']");
	By kalip = By.xpath("//div[8]/div");
	By slimFit = By.xpath("//div[8]/div[2]/a/div");
	By cartDelete = By.xpath("(//i[@class='i-trash'])[1]");
	By goCart = By.xpath("//p[normalize-space()='Sepetim']");
	By lichKing = By.xpath("(//div)[485]");
	By cartDelete2 = By.xpath("//button[2]");
	By cartDelScndItem = By.xpath("(//i[@class='i-trash'])[2]");

	// clicks on header
	public void Header() {
		driver.findElement(header).click();
	}

	// closes add that first appears on landing page and accepts cookies
	public void ClsPop() {
		driver.findElement(clsPop).click();
		driver.findElement(cookieAccept).click();
	}

	// hovers mouse over login and clicks log in
	public void LoginLanding() {
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(drpdwnLogin);
		actions.moveToElement(we).perform();
		driver.findElement(loginLanding).click();
	}

	// writes credentials and logs in
	public WebDriver EmailInput() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String mail = prop.getProperty("email");
		String password = prop.getProperty("password");
		driver.findElement(emailInput).sendKeys(mail);
		driver.findElement(passwordInput).sendKeys(password);
		driver.findElement(passwordBtn).click();

		return driver;
	}

	// JOKE try/catch's purpose is, it writes string before page fully load so
	// try/catch delays the search a bit
	// if it works it aint stupid
	public void Joke() throws InterruptedException {
		try {
			driver.findElement(header).click();
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			driver.findElement(header).click();
		}
		driver.findElement(searchBar).sendKeys("junior quality assurance engineer jobs");
		driver.findElement(searchBtn).click();
		Thread.sleep(2500);
	}

	// logs in via google
	public WebDriver Google() throws IOException {
		driver.findElement(google).click();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String mail = prop.getProperty("email");
		String password = prop.getProperty("password");
		driver.findElement(googleMail).sendKeys(mail);
		driver.findElement(googleNext).click();
		driver.findElement(googlePassword).sendKeys(password);
		driver.findElement(googleLgn).click();
		return driver;
	}

	// jiggle jiggle
	public void Show() {
		for (int i = 0; i < 2; i++) {
			Actions actions = new Actions(driver);
			WebElement kadin = driver.findElement(kadinHead);
			actions.moveToElement(kadin).build().perform();

			WebElement erkek = driver.findElement(erkekHead);
			actions.moveToElement(erkek).build().perform();

			WebElement cocuk = driver.findElement(cocukHead);
			actions.moveToElement(cocuk).build().perform();

			WebElement ev = driver.findElement(evHead);
			actions.moveToElement(ev).build().perform();

			WebElement market = driver.findElement(marketHead);
			actions.moveToElement(market).build().perform();

			WebElement kozmetik = driver.findElement(kozmetikHead);
			actions.moveToElement(kozmetik).build().perform();

			WebElement ayakkabi = driver.findElement(ayakkabiHead);
			actions.moveToElement(ayakkabi).build().perform();

			WebElement saat = driver.findElement(saatHead);
			actions.moveToElement(saat).build().perform();

			WebElement elektronik = driver.findElement(elektronikHead);
			actions.moveToElement(elektronik).build().perform();

			WebElement spor = driver.findElement(sporHead);
			actions.moveToElement(spor).build().perform();

		}
	}

	public void LogOut() {
		Actions actions = new Actions(driver);
		WebElement out = driver.findElement(myAccount);
		actions.moveToElement(out).perform();
		driver.findElement(logOut).click();
	}

	// opens new tab and goes back to first tab
	public void NewTab() throws InterruptedException {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://youtu.be/fT7hEq-J6aI?t=10");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.SPACE);
		ArrayList<String> windowsHandles = new ArrayList<String>(driver.getWindowHandles());
		for (String item : windowsHandles) {
			driver.switchTo().window(item);
		}
		// windowsHandles arraylist's first tab is main tab
		driver.switchTo().window(windowsHandles.get(0));
	}

	public void Gomlek() throws InterruptedException {
		// clicks on "gomlek", performs a random click to check if a new tab opens, if
		// it is shuts it down, if not continues normally
		Actions actions = new Actions(driver);
		WebElement gomlek = driver.findElement(erkekHead);
		actions.moveToElement(gomlek).perform();
		driver.findElement(erkekGomlek).click();
		driver.findElement(By.cssSelector("body")).click();
		Thread.sleep(2500);
		ArrayList<String> windowsHandles = new ArrayList<String>(driver.getWindowHandles());
		try {
			driver.switchTo().window(windowsHandles.get(2));
			driver.close();
			driver.switchTo().window(windowsHandles.get(0));
		} catch (Exception e) {
			Thread.sleep(1);
		}
	}

	public void Filter() throws InterruptedException {
		// sets up filters and choses a shirt
		driver.findElement(altinyildiz).click();
		driver.findElement(fiyat).click();
		driver.findElement(prcRange1).sendKeys("230");
		driver.findElement(prcRange2).sendKeys("250");
		driver.findElement(prcRangeSearch).click();
		Thread.sleep(2000);
		driver.findElement(erkekBuy).click();
		Thread.sleep(3000);
		// new array needed idk why
		// google> how to update arrays
		ArrayList<String> windowsHandles0 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowsHandles0.get(2));
		Thread.sleep(3500);
		for (int i = 0; i < 5; i++) {
			driver.findElement(sagFoto).click();
			Thread.sleep(750);
		}
	}

	public void ShirtSpecs() {
		// first item to cart
		driver.findElement(secondColor).click();
		driver.findElement(thirdColor).click();
		driver.findElement(addCart).click();
	}

	public void LichKing() throws InterruptedException {
		// second item to cart
		driver.findElement(searchBar).sendKeys("world of warcraft");
		driver.findElement(searchBtn).click();
		driver.findElement(lichKing).click();
		ArrayList<String> windowsHandles1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowsHandles1.get(3));
		Thread.sleep(1000);
		driver.findElement(addCart).click();
		driver.findElement(goCart).click();
	}

	public void EmptyCart() {
		driver.findElement(cartDelete).click();
		driver.findElement(cartDelete2).click();
	}

}