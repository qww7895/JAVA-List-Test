package day05;

public class Students {
	private String name;
	private int []score=new int[3];
	private int sum;
	private int avg;
	public Students(){}
	public Students(String name,int []arr) {
		this.name=name;
		this.score=arr;
	}
	public Students(String name,int num1,int num2,int num3) {
		this.name=name;
		this.score[0]=num1;
		this.score[1]=num2;
		this.score[2]=num3;	
		setAvg();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
		sum=0;
		for(int i=0;i<score.length;i++){
			sum+=score[i];
		}
		avg=sum/score.length;
	}
	public void setAvg() {
		sum=0;
		for(int i=0;i<score.length;i++){
			sum+=score[i];
		}
		avg=sum/score.length;		
	}
	public int getSum() {
		return sum;
	}
	public int getAvg() {
		return avg;
	}

	
}
