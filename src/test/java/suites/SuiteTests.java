package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.ContactTests;
import tests.LoginTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTests.class,
        ContactTests.class
})
public class SuiteTests {
}
