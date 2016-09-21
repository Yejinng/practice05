package prob4;

public class Rectangle extends Shape implements Resizable{

	double width;
	double height;
	
	public Rectangle(double width, double height){
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

	@Override
	public void resize(double p) {
		width *= 0.5;
		height *= 0.5;
	}



	@Override
	public double getArea() {
		return width * height;
		
	}

	@Override
	public double getPerimeter() {
		return (width + height )*2;
	}


	
}

