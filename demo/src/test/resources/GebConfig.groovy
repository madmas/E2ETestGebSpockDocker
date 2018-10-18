/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/#configuration
*/


import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver


waiting {
	timeout = 2
}

environments {
	
	// run via “./gradlew firefoxTest”
	// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
	firefox {
		atCheckWaiting = 1

		driver = { new FirefoxDriver() }
	}

	remoteFirefoxRunner {
		baseUrl = System.getProperty("geb.build.baseUrl")
		driver = {
			URL url = new URL(System.getProperty("e2e-test.remoteWebDriverUrl"))
			DesiredCapabilities capabilities = DesiredCapabilities.chrome()
			RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url, capabilities)
			remoteWebDriver
		}
	}
}

// To run the tests with all browsers just run “./gradlew test”
baseUrl = "http://localhost:5050/index.html"


baseNavigatorWaiting = true


reportsDir = 'build/geb-reports'