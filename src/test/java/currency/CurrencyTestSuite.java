package test.java.currency;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TestCoinComparator.class,
	TestUSCoinBank.class,
	})
public class CurrencyTestSuite {

}
