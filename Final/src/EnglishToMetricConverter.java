package Final;

public class EnglishToMetricConverter implements ScaleConverter{
	
	public double convertDistance(double distanceIn) {
		return distanceIn * 2.54;
	}
	
	public double convertArea(double areaIn) {
		return Math.pow(2.54, 2) * areaIn;
	}
	
	public double convertTemperature(double tempIn) {
		return (tempIn - 32) * 5.0 / 9.0;
	}

}
