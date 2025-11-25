package org.generatingtests;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class Example {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://playwright.dev/");
            assertThat(page.locator("h1")).containsText("Playwright enables reliable end-to-end testing for modern web apps.");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Community")).click();
        }
    }
}
