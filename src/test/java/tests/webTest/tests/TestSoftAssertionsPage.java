package tests.webTest.tests;

import org.junit.jupiter.api.Test;
import tests.TestBase;
import tests.webTest.pages.SelenideOnGithub;

public class TestSoftAssertionsPage  extends TestBase {

    @Test
    public void testSoftAssertionsHaveJUnit5Example() {

        SelenideOnGithub selenideOnGithub = new SelenideOnGithub();

        selenideOnGithub
                .openPage();

        selenideOnGithub
                .goToWikiTab()
                .assertTexTitleWikiTabIsVisible()
                .assertWikiBlockHaveSoftAssertions()
                .assertWikiBlockHaveSoftAssertions()
                .goToSoftAssertionsPage()
                .assertTexTitleSoftAssertionsIsVisible()
                .assertBlockSoftAssertionsHaveJUnitExample();
    }
}
