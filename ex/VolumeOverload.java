package sep27pgm.ex;

public class VolumeOverload {
	 double volume(double r) {
	        double vol = (4 / 3.0) * (22 / 7.0) * r * r * r;
	        return vol;
	    }
	    
	    double volume(double h, double r) {
	        double vol = (22 / 7.0) * r * r * h;
	        return vol;
	    }
	    
	    double volume(double l, double b, double h) {
	        double vol = l * b * h;
	        return vol;
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VolumeOverload vo=new VolumeOverload();
		System.out.println("Volume of sphere is : "+ vo.volume(5));
		System.out.println("Volume of cylinder is : "+vo.volume(5, 4));
		System.out.println("Volume of cuboid  is : "+vo.volume(3, 4, 5));

	}

}
