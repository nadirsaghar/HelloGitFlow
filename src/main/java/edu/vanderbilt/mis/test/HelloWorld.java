package edu.vanderbilt.mis.test;

import org.apache.maven.shared.release.exec.MavenExecutorException;

import com.atlassian.maven.plugins.jgitflow.helper.DefaultMavenExecutionHelper;


public class HelloWorld {
      private final static String NEW_FIELD = "New Field";
      
      public void test() throws MavenExecutorException {
         DefaultMavenExecutionHelper helper = new DefaultMavenExecutionHelper();
         helper.execute( null, null );
      }
}
