package alfa.br.com.gilmario.modelo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format={"pretty", "html:reports/test-report"},
        glue = {"alfa.br.com.gilmario"},
        features = {"src/test/resource/avaliacao.features"})
public class CucumberRunner {
}
