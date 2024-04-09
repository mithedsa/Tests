import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;

import static org.junit.Assert.*;
public class TestBase {
    AccountData user = new AccountData("mithedsa", "qw5172718");

    GroupData groupData = new GroupData("Это текст для новой записи", "1") ;

    ApplicationManager manager;
    @Before
    public void setUp() {
        manager = new ApplicationManager();
    }
    @After
    public void tearDown() {
        manager.Stop();
    }

}
