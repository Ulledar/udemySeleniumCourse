package tests.base;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class Listener implements TestWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        LOGGER.info("Test {} - FAILED", context.getTestMethod().get().getName());
        String screenshotName = context.getTestMethod().get().getName() +
                String.valueOf(System.currentTimeMillis()).substring(9, 13);
        LOGGER.info("Trying to get screenshot...");
        TakesScreenshot ts = (TakesScreenshot) ((BaseTest) context.getRequiredTestInstance()).driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(source, new File("build/reports/test_screenshots/" + screenshotName + ".png"));
        } catch (IOException e) {
            LOGGER.info("Exception on saving screenshot");
            e.printStackTrace();
        }
    }
}
