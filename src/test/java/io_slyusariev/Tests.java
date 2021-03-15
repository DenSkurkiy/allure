package io_slyusariev;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.conditions.Exist;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Tests {

        private final String REPOSITORY = "eroshenkoam/allure-example";
        private final String NUMBER_ISSUE = "68";

        @Test
        @Tag("Critical")

    public void TestIssue(){

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
