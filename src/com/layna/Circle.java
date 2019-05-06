package com.layna;

import java.math.BigDecimal;
import java.math.RoundingMode;



public static void main(String[] args) {
		
		public class Circle {
			
			private double radius;
			
			
			
			public Circle(double radius) {
				this.radius = radius;
			}
			
			public double getCircumference() {
				return 2* Math.PI * radius;
			}
			
			public String getFormattedCircumference() {
				return formatNumber(getCircumference());
			}
			
			public double getArea() {
				return (Math.PI * Math.pow(radius, 2));
			}
			
			public String getFormattedArea() {
				return formatNumber(getArea());
			}

			public double getRadius() {
				return radius;
			}

			public void setRadius(double radius) {
				this.radius = radius;
			}

			private String formatNumber(double x) {
				BigDecimal bd = new BigDecimal(Double.toString(x));
				bd = bd.setScale(2, RoundingMode.HALF_UP);
				return bd.toString();
			}

			
			

		
	}


