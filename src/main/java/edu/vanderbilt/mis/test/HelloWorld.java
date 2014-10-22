package edu.vanderbilt.mis.test;

import org.apache.maven.shared.release.exec.MavenExecutorException;

import com.atlassian.maven.plugins.jgitflow.extension.command.MavenBuildCommand;
import com.atlassian.maven.plugins.jgitflow.helper.DefaultMavenExecutionHelper;


public class HelloWorld {
      private final static String NEW_FIELD = "New Field";
      
      public void test() throws Exception {
         DefaultMavenExecutionHelper helper = new DefaultMavenExecutionHelper();
         MavenBuildCommand b=  new MavenBuildCommand();
         b.execute( null, null, null );
         helper.execute( null, null );
      }
}
