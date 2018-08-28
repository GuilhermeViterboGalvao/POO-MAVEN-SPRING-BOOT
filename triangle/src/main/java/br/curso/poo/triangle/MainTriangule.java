package br.curso.poo.triangle;

public class MainTriangule {

	public static void main(String[] args) throws Exception {
		System.out.println(Triangle.isIsosceles(5, 1, 1));
		System.out.println(Triangle.isScalene(1, 2, 5));
		System.out.println(Triangle.isEquilateral(2, 2, 2));

        /**
         *
         * Exercício:
         *
         * Devemos adaptar a classe Triangle para que
         * ela faça a implementação do método getArea.
         * O método deve fazer o cálculo de todos os tipos
         * de triângulo de maneira correta.
         *
         */
		Triangle t = new Triangle(2, 10, 10) {};
        IsoscelesTriangule i = new IsoscelesTriangule(2, 10, 10);
        System.out.println(t.getArea() == i.getArea());

        Triangle t2 = new Triangle(2, 5, 10) {};
        ScaleneTriangule s = new ScaleneTriangule(2, 5, 10);
        System.out.println(t2.getArea() == s.getArea());

        Triangle t3 = new Triangle(5, 5, 5) {};
        EquilateralTriangule e = new EquilateralTriangule(5, 5, 5);
        System.out.println(t3.getArea() == e.getArea());
    }
}