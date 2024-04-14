package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeaturesFile/Crm.feature",
glue={"stepdef","hooksDemo"})
public class CRMRunner 
{

}
