package org.bigtester.ate.core.sample.simplemaven;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;

import org.bigtester.ate.TestProjectRunner;
import org.dbunit.DatabaseUnitException;

import com.github.javaparser.ParseException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException, DatabaseUnitException, SQLException
    {
    	try {
			TestProjectRunner.runTest("bigtesterTest/testproject.xml");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
