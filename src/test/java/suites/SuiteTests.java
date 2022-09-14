package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ContactTests;
import tests.LoginTests;
import tests.SearchTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTests.class,
        ContactTests.class,
        SearchTests.class
})
public class SuiteTests {
}
