package DDT;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class Working_with_CSV_File {
	public static void main(String[] args) throws IOException, CsvException {
		FileReader fileReader=new FileReader("./Files/csvData.csv");
		CSVReader csvReader=new CSVReader(fileReader);
		List<String[]> value = csvReader.readAll();
		
		for(String[] strings:value)
		{
			for(String string:strings)
			{
				System.out.println(string);
			}
		}
		
		
		
	}

}
