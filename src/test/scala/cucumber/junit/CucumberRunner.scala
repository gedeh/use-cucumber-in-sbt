package cucumber.junit

import org.junit.runner.RunWith
import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions

@RunWith(classOf[Cucumber])
@CucumberOptions(
  glue = Array("cucumber.junit.steps"),
  features = Array("classpath:features"),
  plugin = Array("pretty", "html:target/cucumber-reports/cucumber.html")
)
class CucumberRunner {}
