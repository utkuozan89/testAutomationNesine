package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import listeners.DriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Locale;

import static io.qameta.allure.util.ResultsUtils.firstNonEmpty;

/****************************************************
 * Tarih: 2018-05-30
 * Proje: SolCRM Functional Test Automation
 * Class: 
 * Yazan: Utku Ozan OCAK
 ****************************************************/
public class BaseTest extends BaseLibrary {
    @Before
    public void setUp() {
//        PhantomJsDriverManager.getInstance().useTaobaoMirror().setup();
//        Configuration.browser = "PhantomJS";
//        ChromeDriverManager.getInstance().setup();
//        Configuration.browser = "Chrome";
        String sysProperties = "";
        sysProperties += "Setup started";
        sysProperties += "\nfile.encoding: " + String.format("file.encoding: %s", System.getProperty("file.encoding"));
        sysProperties += "\ndefault charset=" + Charset.defaultCharset();
        sysProperties += "\njava.specification.version" + System.getProperty("java.specification.version");
        sysProperties += "\njava.runtime.version" + System.getProperty("java.runtime.version");
        sysProperties += "\nlocale default:" + Locale.getDefault();
        WebDriverRunner.addListener(new DriverEventListener());
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
        Configuration.browser = (System.getProperty("browser") == null) ? "chrome" : System.getProperty("browser");
        Configuration.driverManagerEnabled = false;
        Configuration.reportsFolder = "test-result/reports";
        Configuration.screenshots = Configuration.remote == null;
        Configuration.savePageSource = false;
        Configuration.holdBrowserOpen = false;
        Configuration.startMaximized = true;
        Configuration.pollingInterval = 100;
        Configuration.collectionsPollingInterval = 100;
        Configuration.headless = false;
        sysProperties += "\nremote: " + Configuration.remote;
        sysProperties += "\nbrowser: " + Configuration.browser;
        sysProperties += "\nbrowser.version: " + Configuration.browserVersion;
        sysProperties += "\nurl: " + Configuration.baseUrl;
        log.info(sysProperties);
    }
}
