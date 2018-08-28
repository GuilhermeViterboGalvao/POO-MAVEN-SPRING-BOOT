package br.curso.poo.triangle;

public class EquilateralTriangule extends Triangle {

	public EquilateralTriangule(int l1, int l2, int l3) throws Exception {
		super(l1, l2, l3);
		if (!Triangle.isEquilateral(l1, l2, l3)) {
			throw new Exception("Nao e um triangulo equilatero!");
		}
	}

	@Override
	public double getArea() {		
		return Math.round((l1 * l1 * Math.sqrt(3d)) / 4);
	}
}