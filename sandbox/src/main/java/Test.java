public class Test {

	public static void main (String[] args)
	{

		System.out.println("Hello, World!");

		double a = 5;
        System.out.println("Площадь квадрата, состороной " + a + " = " + area(a));

        double x = 3;
        double y = 6;
        System.out.println("Площадь прямоугольника, со сторонами " + x + " и " + y + " = " + area(x,y));
	}

	public static double area(double a){
		return a*a;
	}

    public static double area(double a,double b){
        return a*b;
    }

}
