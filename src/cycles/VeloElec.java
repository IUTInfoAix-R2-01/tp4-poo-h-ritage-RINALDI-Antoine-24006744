package cycles;

public class VeloElec extends Velo{
	private static final double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur){
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public VeloElec(double diamRoue, double coupleMoteur){
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	public VeloElec(){
		super();
	}
	public double getDEFAUT_COUPLE_MOTEUR(){
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setdEFAUT_COUPLE_MOTEUR(){
		
	}
}
