
public class VolumeofEarth {
	public static void main(String[] args) {
		int radius = 6378;
		double VolumeEarthkilometer = (4/3)*3.14*radius*radius*radius;
		double VolumeEarthmiles = VolumeEarthkilometer * 0.621371;
		
		System.out.println("the volume of earth is in cubic kilometers is "+VolumeEarthkilometer + "and the Volume in cubic miles is "+VolumeEarthmiles);
	}

}
