package GUI03.Fun;

public class Fun {
    public static void main(String[] args) {

        double f = FunDD.xminim(new Parabola(1,-1,5/4),0,1);

        double s = FunDD.xminim(new FunDD() {
            @Override
            public double fun(double x) {
                return Math.sqrt(((x-0.75)*(x-0.75))+1);
            }
        },0,2);

        double t = FunDD.xminim( d-> (d*d)*(d-2),0,2);

        System.out.println(f+" "+s+" "+t);
    }
}
