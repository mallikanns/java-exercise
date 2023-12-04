package javaexercise;

//Create java program that read data from text file then create object of MoneyData class from each data row
//Put created objects to ArrayList

//Create class MoneyDataRepo has these methods: initCollection(), save(MoneyData)
//Save all MoneyData objects in ArrayList to Database

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataImporter {

	public static void main(String[] args) throws FileNotFoundException {
		// read text file data.csv
		String fileName = "data.csv";

		// create new ArrayList object
		ArrayList<MoneyData> list = new ArrayList<>();
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd-MM-yy");
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		
		// skip first line
		if (inputFile.hasNext()) {
			inputFile.nextLine();
		}
		while (inputFile.hasNext()) {
			String readRow = inputFile.nextLine();
			// System.out.println(readRow);
			String[] data = readRow.split(",");
			int Id = Integer.valueOf(data[0]);
			String merchantNumber = data[1];
			String expFeeNumber = data[2];
//			LocalDate fileDate = LocalDate.parse(data[3], DateTimeFormatter.ofPattern("dd-MM-yy"));
//			LocalDate repDate = LocalDate.parse(data[4], DateTimeFormatter.ofPattern("dd-MM-yy"));
			LocalDate fileDate = LocalDate.parse(data[3] , formatter);
			LocalDate repDate = LocalDate.parse(data[4], formatter);
			int bankId = Integer.parseInt(data[5]) ;
//			int bankId = Integer.valueOf(data[5]);
			String bankName = data[6];
			double fee = Double.valueOf(data[7]);
			System.out.println(repDate);
			// create new MoneyData object
			MoneyData m = new MoneyData(Id, merchantNumber, expFeeNumber, fileDate, repDate, bankId, bankName, fee);
			// add object to ArrayList
			list.add(m);
		}
		inputFile.close();
		System.out.println(list.size());
		System.out.println(list.get(15));

		MoneyDataRepoTwo repo = new MoneyDataRepoTwo();

		repo.initCollection();
		for (MoneyData moneyData : list) {
			repo.save(moneyData);
		}
	}

}
