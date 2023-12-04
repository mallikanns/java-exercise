# Java Exercise
# Data Importer

- Create Java program (DataImporter) that  read data from text file : data.csv
then  create object of MoneyData class from each data row.
- put created objects to ArrayList.
-  MoneyData class has attributes:
Id , merchantNumber, expFeeNumber, fileDate, repDate, bankId, bankName, fee

Hint.

```
File file = new File(fileName);
Scanner inputFile = new Scanner(file);
while (inputFile.hasNext()) {
   String friendName = inputFile.nextLine();
   System.out.println(friendName);
}
```


- Create class MoneyDataRepo  has these methods:
  initConnection()
-- save(MoneyData)
- Save all MoneyData objects in ArrayList to Database.


