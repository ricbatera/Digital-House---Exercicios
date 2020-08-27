package entities;

public class Prova {
	private Integer dificuldade;
	private Integer energiaNecessaria;
	
	
	
	public Prova(Integer dificuldade, Integer energiaNecessaria) {
		this.dificuldade = dificuldade;
		this.energiaNecessaria = energiaNecessaria;
	}
	
	public Integer getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(Integer dificuldade) {
		this.dificuldade = dificuldade;
	}
	public Integer getEnergiaNecessaria() {
		return energiaNecessaria;
	}
	public void setEnergiaNecessaria(Integer energiaNecessaria) {
		this.energiaNecessaria = energiaNecessaria;
	}
	
	public boolean podeRealizar(Atleta atleta) {
		if(atleta.getNivel() >= this.dificuldade && atleta.getEnergia() >= this.energiaNecessaria) {
			return true;
		}else return false;
	}
	
	
}
