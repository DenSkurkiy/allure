package io_slyusariev;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepTest {

    private final String REPOSITORY = "https://github.com";
    private final String NUMBER_ISSUE = "68";

    public void testIssueSearch(){
        step("open main page", () -> {
            open("https://github.com");
        });

        step("search input field", () -> {

            $(".header-search-input").click();

        });


        step("enter value", () ->{
            $(".header-search-input").sendKeys(REPOSITORY);
        });


        $(".header-search-input").submit();
        $(By.linkText(REPOSITORY)).click();
        $(withText("Issue")).click();
        step("check condition", () -> {
            $(withText(NUMBER_ISSUE)).should(Condition.exist);
        });
    }
}
