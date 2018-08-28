package br.curso.poo.triangle;

public class ScaleneTriangule extends Triangle {

	public ScaleneTriangule(int l1, int l2, int l3) throws Exception {
		super(l1, l2, l3);
		if (!Triangle.isScalene(l1, l2, l3)) {
			throw new Exception("Nao e um triangulo escaleno");
		}
	}

	@Override
	public double getArea() {
		double p = (l1 + l2 + l3) / 2;
		return Math.round(Math.sqrt(p * (p - l1) * (p - l2) * (p - l3)));
	}

}
