package Basics;

public class ReadCSVFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		/*ReadCSVFile.sample1();
		ReadCSVFile.sample2();*/
	}
/*
	@SuppressWarnings("resource")
	public static void sample1() throws Exception {
		System.out.println("Sample1");
		String filePath = "C:\\Users\\prakash.r\\Desktop\\ReadCSVData.csv";
		Reader readFile = new FileReader(filePath);
		CSVReader csvreader = new CSVReader(readFile);
		List<String[]> data = csvreader.readAll();
		for (String[] d : data) {
			for (String c : d) {
				System.out.println(c);
			}
		}
		System.out.println();
	}

	@SuppressWarnings("resource")
	public static void sample2() throws Exception {
		System.out.println("Sample2");
		String filePath = "C:\\Users\\prakash.r\\Desktop\\ReadCSVData.csv";
		Reader readFile = new FileReader(filePath);
		//CSVReader csvreader = new CSVReader(readFile);
		List<String[]> list = csvreader.readAll();
		Iterator<String[]> ite = list.iterator();
		while (ite.hasNext()) {
			String[] data = ite.next();
			for (int i = 0; i < data.length; i++) {
				System.out.println(data[i]);
			}
		}
	}*/
}