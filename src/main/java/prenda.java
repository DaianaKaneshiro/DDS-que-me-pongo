import java.util.*;



class Prenda {
 TipoDePrenda tipo;
 Material material;
 Color color;
 
 public Prenda(TipoDePrenda tipo, Material material, Color color) {
	this.tipo=tipo;
	this.material=material;
	this.color=color;
 	
 }
}


class TipoDePrenda{
	Categoria categoria;

}
 enum Material{
	ALGODON,
	MODAL,
	LYCRA,
	VIDRIO,
	CUERO,
	JEAN,
	
}

class Color{
	Integer rojo;
	Integer azul;
	Integer amarillo;
	
	
}

// Composicion/ Interface 

public interface Categoria{
	

}
enum ParteSuperior implements Categoria{
	REMERA, PULOVER,CAMISA
}

enum ParteInferior implements Categoria{
	PANTALON
}

enum Calzado implements Categoria{
	CONVERSE
}

enum Accesorio implements Categoria{
	ANTEOJOS, COLLAR, AROS
}