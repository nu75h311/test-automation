package com.wipro.testing.training.stories;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.annotations.Configure;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.annotations.spring.UsingSpring;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.junit.spring.SpringAnnotatedEmbedderRunner;
import org.junit.runner.RunWith;


@RunWith(SpringAnnotatedEmbedderRunner.class)
@Configure
@UsingEmbedder(embedder = Embedder.class, generateViewAfterStories=true, ignoreFailureInStories=true, ignoreFailureInView=false, stepsFactory=true)
@UsingSpring(resources="classpath:application-context.xml")
@UsingSteps
public class SpringStoriesRunner extends JUnitStories{


	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("stories/PerformSearch.story");
	}

}
