package br.curso.poo.triangle;

public abstract class Triangle implements TrianguleArea {

	public Triangle(int l1, int l2, int l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
	}
	
	protected int l1;
	
	protected int l2;
	
	protected int l3;

    public int getL1() {
		return l1;
	}

	public int getL2() {
		return l2;
	}

	public int getL3() {
		return l3;
	}

    @Override
    public double getArea() {
        /**
         * Através da POO conseguimos
         * reaproveitar o código e a lógica
         * e implementarmos a solução em uma única linha.
         */
        return Triangle.getTriangule(l1, l2, l3).getArea();
    }

    public static Triangle getTriangule(int l1, int l2, int l3) {
		if (isIsosceles(l1, l2, l3)) {
			IsoscelesTriangule isosceles = null;
			try {
				isosceles = new IsoscelesTriangule(l1, l2, l3);
			} catch (Exception e) { }
			return isosceles;
		}
		if (isScalene(l1, l2, l3)) {
			ScaleneTriangule scalene = null;
			try {
				scalene = new ScaleneTriangule(l1, l2, l3);
			} catch (Exception e) { }
			return scalene;
		}
		if (isEquilateral(l1, l2, l3)) {
			EquilateralTriangule equilateral = null;
			try {
				equilateral = new EquilateralTriangule(l1, l2, l3);
			} catch (Exception e) { }
			return equilateral;
		}		
		return null;
	}
	
	public static boolean isIsosceles(int l1, int l2, int l3) {
		return (l1 == l2 && l1 != l3) || (l2 == l3 && l2 != l1) || (l3 == l1 && l3 != l2);
	}
	
	public static boolean isScalene(int l1, int l2, int l3) {
		return l1 != l2 && l1 != l3 && l2 != l3;
	}
	
	public static boolean isEquilateral(int l1, int l2, int l3) {
		return l1 == l2 || l2 == l3 || l3 == l1;
	}
}