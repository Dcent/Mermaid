package dk.softtec4.projectcontroller;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProjectCreateTest {
	

	@Test
	public void shouldCreateAProjectObject() {
		//setup
		Project project = new Project();
		
		//action
		
		//assert
		assertNotNull(project);
	}

}
