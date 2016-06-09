# Test Automation Configuration and Create a project


## Configure Eclipse

1.	Open eclipse.exe.
2.	Chose a workspace folder for your projects.
3.	Open menu Window > Preferences > Maven > *User Settings*.
4.	Map the User Settings field to `C:\<maven folder>\conf\settings.xml`.
5.	Click Update Settings; Apply; OK.
6.	Open menu Window > Preferences > Java > *Installed JRE*.
7.	Click Add… > Select Standard VM > Click Next.
8.	Click Directory… > Select the folder where Java was installed > Click Finish.
9.	On the Installed JREs list, leave only the jdk you just added selected.
10.	Click Apply; OK.


## Create a project

1.	Open menu File > New > *Maven Project*.
2.	Check options:  
	-	Create a simple project (skip archetype selection)
	-	Use default Workspace location.
3.	Click Next.
4.	Fill the next step fields as below:
    >Image goes here

5.	Click Finish; the structure below should be created:
    >Image goes here

6.	Open the `pom.xml` file (pom.xml tab), add the following inside the `<project>` section:
    ```xml
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>

    	<dependency>
    	    <groupId>org.jbehave</groupId>
    	    <artifactId>jbehave-spring</artifactId>
    	    <version>3.9.1</version>
    	</dependency>

    	<dependency>
    	    <groupId>org.jbehave.web</groupId>
    	    <artifactId>jbehave-web-selenium</artifactId>
    	    <version>3.6-beta-2</version>
    	</dependency>

    	<dependency>
    	    <groupId>org.seleniumhq.selenium</groupId>
    	    <artifactId>selenium-java</artifactId>
    	    <version>2.53.0</version>
    	</dependency>

    	<dependency>
    	    <groupId>org.seleniumhq.selenium</groupId>
    	    <artifactId>selenium-firefox-driver</artifactId>
    	    <version>2.53.0</version>
    	</dependency>

	</dependencies>

	<build>
        <plugins>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.3</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
    ```
7.	Save All.
8.	In the *Project Explorer* pane, right click the project > Maven > *Update Project*; click OK.
9.	JRE System Library should now show `[JavaSE-1.8]`.
10.	In the *Project Explorer* pane, right click the project > Run As > *Maven install*.
11.	Console should show `BUILD SUCCESS`.


## Configure JBehave plugin

1. In Eclipse, open menu Help > *Install New Software…*
2. Fill the Work with: with http://jbehave.org/reference/eclipse/updates/; click Add…
3. Select the JBehave feature containing *JBehave Eclipse*; click Finish.
4. Follow standard installation procedure (an Eclipse restart will be required).
