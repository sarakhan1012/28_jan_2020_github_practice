package com.acc.cucumber1;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {json:target/cucumber.json"}
		,features = "Feature1"
		,glue= {"step_definition1"}
	//	,tags= {"@SmokeTest"})
	//	,tags= {"@RegressionTest"})
    //    ,tags= {"@SmokeTest,@RegressionTest"})
		 ,tags= {"@SmokeTest","~@RegressionTest"})


public class Testrunner1 {

}
