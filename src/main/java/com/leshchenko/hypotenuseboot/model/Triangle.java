package com.leshchenko.hypotenuseboot.model;

public class Triangle {

	private double firstSide;
	private double secondSide;

	public Triangle() {
		firstSide = 0;
		secondSide = 0;
	}

	public double getFirstSide() {
		return firstSide;
	}

	public void setFirstSide(double firstSide) {
		if (validate(firstSide)) {
			this.firstSide = firstSide;
		} else {
			this.firstSide = 0;
		}
	}

	public double getSecondSide() {
		return secondSide;
	}

	public void setSecondSide(double secondSide) {
		if (validate(secondSide)) {
			this.secondSide = secondSide;
		} else {
			this.secondSide = 0;
		}
	}

	public double hypotenuse() {
		return Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
	}

	private boolean validate(double side) {
		if (side >= 0) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(firstSide);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(secondSide);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (Double.doubleToLongBits(firstSide) != Double.doubleToLongBits(other.firstSide))
			return false;
		if (Double.doubleToLongBits(secondSide) != Double.doubleToLongBits(other.secondSide))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [firstSide=" + firstSide + ", secondSide=" + secondSide + "]";
	}

}
