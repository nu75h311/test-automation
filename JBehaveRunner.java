package com.wipro.testing.training.stories;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.embedder.Embedder;

import com.wipro.testing.training.steps.MathSteps;

public class JBehaveRunner {
	
	private static Embedder embedder = new Embedder();
	private static List<String> storyPaths = Arrays.asList("stories/Math.story");

	public static void main(String args[]) {
		embedder.candidateSteps().add(new MathSteps());
		embedder.runStoriesAsPaths(storyPaths);
	}

}
