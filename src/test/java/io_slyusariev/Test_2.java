package io_slyusariev;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.conditions.Exist;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Test_2 {

    private final String REPOSITORY = "eroshenkoam/allure-example";
    private final String NUMBER_ISSUE = "68";

    @Test
    @Tag("Critical")
    @Story("Broken Test")

    public void TestIssue(){

        step("open main page", () -> {
            open("https://github.c");
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

