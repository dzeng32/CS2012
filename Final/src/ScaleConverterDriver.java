package Final;

public class ScaleConverterDriver {

	public static void main(String args[]) {
		EnglishToMetricConverter EtoMTest = new EnglishToMetricConverter();
		
		MetricToEnglishConverter MtoETest = new MetricToEnglishConverter();
		
		System.out.println("English to Metric conversion test: ");
		System.out.println(EtoMTest.convertDistance(123.45));
		System.out.println(EtoMTest.convertArea(77.77));
		System.out.println(EtoMTest.convertTemperature(96) + "\n");
		
		System.out.println("Metric to English conversion test: ");
		System.out.println(MtoETest.convertDistance(313.563));
		System.out.println(MtoETest.convertArea(501.740932));
		System.out.println(MtoETest.convertTemperature(35.55555555555556));
	}
	
}
