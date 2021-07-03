package Test;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.common.excelreport.ExcelReportGenerator;

public class GenerateExcelReport {

	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
		// TODO Auto-generated method stub
		ExcelReportGenerator.generateExcelReport("Excelreport.xlsx", "/home/akshathachowtag/eclipse-workspace/Testng_example/");
	}

}
