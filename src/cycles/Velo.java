package cycles;

import java.util.Random;

public class Velo {
	private double braquet;
	private double diamRoue;
	private double DEFAUT_BRAQUET;
	private Random genAlea = new Random();
	public Velo(double braquet, Random genAlea, double diamRoue, double DEFAUT_BRAQUET) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		this.DEFAUT_BRAQUET = 13.0;
	}
	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	public void setdEFAUT_BRAQUET(double DEFAUT_BRAQUET){
		this.DEFAUT_BRAQUET = DEFAUT_BRAQUET;
	}
	public Velo(double braquet, double diamRoue){
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	public Velo(double braquet) {
		this.braquet = braquet;
	}
	public Velo() {
		
	}
	public Random getGenAlea(){
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	public double getBraquet(){
		return braquet;
	}
	public void setBraquet(double braquet){
		this.braquet = braquet;
	}
	public double getDiamRoue(){
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue){
		this.diamRoue = diamRoue;
	}
	@Override
	public String toString(){
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	public double getPuissance(double FrequenceCoupsDePedale){
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	public static void main(String[] args){
		Velo V1 = new Velo(10.0, 7.50); 
        Random r = new Random();
        System.out.println(V1.getDEFAUT_BRAQUET());
        V1.setdEFAUT_BRAQUET(10.0);
        V1.setGenAlea(r);
        System.out.println(V1.toString());
        System.out.println(V1.getGenAlea().nextDouble());
        System.out.println(V1.getBraquet());
        V1.setBraquet(4.0);
        System.out.println(V1.getDiamRoue());
        V1.setDiamRoue(6.0);
        System.out.println(V1.toString());
        System.out.println(V1.getPuissance(12.0));
	}
}