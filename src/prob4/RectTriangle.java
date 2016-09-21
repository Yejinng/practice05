package prob4;

public class RectTriangle extends Shape {

	double width;
	double height;
	

	public RectTriangle(double width, double height){
		this.width=width;
		this.height=height;
	}


	public double getWidth() {
		return width;
	}



	public double getHeight() {
		return height;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getArea() {
		return width * height * 0.5;
		
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
