

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GitHubPage {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.browser = "chrome";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void enterprisePageHaveHeadTest() {
        open("");
        $(byTagAndText("button", "Solutions")).hover();
        $(byTagAndText("a", "Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform."));
    }
}