package day8.basics;

public class BarChartTest {

	public static void main(String[] args) {
BarChartContinues B1 = new BarChartContinues();
B1.Submit();
System.out.println("GRAPH REPRESENTATION");
for(int counter=0;counter<B1.array.length;counter++)
{
	if (counter==10)
	System.out.printf("%5d",100);
else
	System.out.printf("%02d-%02d",counter*10,counter*10+9);

	for(int stars=0;stars<B1.array[counter];stars++)
		System.out.print("*");
	System.out.println();
	
}	
	}

}
