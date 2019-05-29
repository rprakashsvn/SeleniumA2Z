package Basics;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.automationtesting.excelreport.Xl;

public class ExcelReportGeneration {

	public static void main(String args[]) throws Exception, IOException, ParserConfigurationException {

		// Xl.generateReport("./ExcelReportGen.xlsx");
		Xl.generateReport("./Reports\\", "ExcelResult.xlsx");
		System.out.println("Excel Report Generated Successfully");

	}
}
