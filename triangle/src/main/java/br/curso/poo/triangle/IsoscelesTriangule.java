package br.curso.poo.triangle;

public class IsoscelesTriangule extends Triangle {

	public IsoscelesTriangule(int l1, int l2, int l3) throws Exception {
		super(l1, l2, l3);
		if (!Triangle.isIsosceles(l1, l2, l3)) {
			throw new Exception("Nao e um triangulo isosceles");
		}
	}

	@Override
	public double getArea() {
		return Math.round((getBase() * getHeight()) / 2);
	}
	
	public int getBase() {
		if (l1 == l2) {
			return l3;
		} else if (l2 == l3) {
			return l1;
		} else {
			return l2;
		}
	}
	
	public int getL() {
		if (l1 == l2) {
			return l1;
		} else {
			return l2;
		}
	}
	
	public double getHeight() {
		int l = getL();
		double base = getBase() / 2;
		return Math.sqrt((l * l) - (base * base));
	}
}