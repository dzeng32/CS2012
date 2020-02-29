package Final;

public class MetricToEnglishConverter implements ScaleConverter{
	
	public double convertDistance(double distanceIn) {
		return distanceIn / 2.54;
	}
	
	public double convertArea(double areaIn) {
		return areaIn / Math.pow(2.54, 2);
	}
	
	public double convertTemperature(double tempIn) {
		return (tempIn * 9.0 / 5.0) + 32;
	}

}
