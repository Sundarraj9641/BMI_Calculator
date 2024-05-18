package com.bmicalculator;

public class Bmi {
	
	public float getWeight(String str) {
		String we[]= str.split("@");
		String we1 = we[0];
		String we2 = we1.replace("-", ".");
		float weight = Float.valueOf(we2);
		
		return weight;
	}
	
	public float getHeight(String str) {
		String he[]= str.split("@");
		String he1 = he[1];
		String he2 = he1.replace("-", ".");
		float height = Float.valueOf(he2);
		
		return height;
	}
	
	public float calculateBMI(float weight, float height) {

			if(weight==0 || height==0) {
				return -1;
			} else {
				float BMI = weight/(height*height);
				return BMI;
			}
	
		}
	
	public String checkStatus(float BMI) {
		if(BMI>=20 && BMI<=24) {
			return "nourished";
		} else {
			return "malnourished";
		}
	}
	

	public static void main(String[] args) {
		
		Bmi b = new Bmi();
		String wh = "68-33@1-78";
		float bmi = b.calculateBMI(b.getWeight(wh),b.getHeight(wh));
		System.out.println(b.checkStatus(bmi));

	}

}
