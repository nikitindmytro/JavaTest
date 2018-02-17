public class Test {

	public static void main (String[] args)
	{

		System.out.println("Hello, World!");

		Square a = new Square(5);
		System.out.println("Площадь квадрата, состороной " + a.l + " = " + a.area());

		Rectangle x = new Rectangle(3,6);
        System.out.println("Площадь прямоугольника, со сторонами " + x.l + " и " + x.w + " = " + x.area());
	}

	public static double area(double a){
		return a*a;
	}

    public static double area(double a,double b){
        return a*b;
    }

}
