package niffler.jupiter.extension;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BrowserExtension implements TestExecutionExceptionHandler, AfterEachCallback {

  @Override
  public void handleTestExecutionException(ExtensionContext context, Throwable throwable)
      throws Throwable {
    if (WebDriverRunner.hasWebDriverStarted()) {
      Allure.addAttachment("Screen on fail",
          new ByteArrayInputStream(((TakesScreenshot) WebDriverRunner.getWebDriver())
              .getScreenshotAs(OutputType.BYTES))
      );
    }

    throw throwable;
  }

  @Override
  public void afterEach(ExtensionContext context) throws Exception {
    if (WebDriverRunner.hasWebDriverStarted()) {
      Selenide.closeWebDriver();
    }
  }
}
