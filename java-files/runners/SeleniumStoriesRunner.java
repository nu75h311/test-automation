package com.wipro.testing.training.stories;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.wipro.testing.training.steps.PerformSearchSteps;

public class SeleniumStoriesRunner extends JUnitStories{

	public SeleniumStoriesRunner() {
		super();
	}

	@Override
	public InjectableStepsFactory stepsFactory() {
		return new InstanceStepsFactory(configuration(), new PerformSearchSteps());
	}

	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("stories/PerformSearch.story");
	}

}
