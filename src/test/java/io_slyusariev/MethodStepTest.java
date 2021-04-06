package io_slyusariev;

import io.sliuysariev.qa.guru.TestStape;
import org.junit.jupiter.api.Test;

public class MethodStepTest {

       final TestStape steps = new TestStape();

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final String ISSUE_NUMBER = "#68";

    @Test
    public void testIssueSearch() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepositoryFromSearch(REPOSITORY);
        steps.openRepositoryIssues();

        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }

}
