package org.gk.junitMockito.serviceTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class RegistrationServiceTest {
	private static final Logger LOG = LogManager.getLogger(RegistrationServiceTest.class);

	@DisplayName("Test1")
	@Test
	public void testregService() {
		LOG.info("This Will Be Printed On Info");

		Assertions.assertEquals(1, 1);
		Assertions.assertTrue(true);
		Assertions.assertFalse(false);

		LOG.info("Appending string: {}.", "Hello, World");
	}

}
