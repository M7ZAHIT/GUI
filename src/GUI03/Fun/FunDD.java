package GUI03.Fun;

public interface FunDD {
    double fun(double x);
    static double xminim(FunDD f,double a, double b){
        double minX = a,minVal = f.fun(a);
        for (double x = a; x <= b ; x+=1e-5) {
            double v = f.fun(x);
            if (v<minVal){
                minVal = v;
                minX = x;
            }
        }
        return minX;
    }
}
