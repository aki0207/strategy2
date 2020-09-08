package strategy2;

public class Main {
	public static void main(String[] args) {
		String[] originalData = {
				"Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
		};
		String[] data1 = new String[5];
		String[] data2 = new String[5];
		System.arraycopy(originalData,0,data1,0,originalData.length);
		System.arraycopy(originalData,0,data2,0,originalData.length);
		SortAndPrint sap1 = new SortAndPrint(data1, new SelectionSorter());
		sap1.excute();
		SortAndPrint sap2 = new SortAndPrint(data2, new BubbleSort());
		sap2.excute();
	}

}
