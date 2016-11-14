/**
 * Created by student1 on 14.11.16.
 */
public class Matrix {
    double n[][];
    Matrix(){
       double[] n={0};
    }
    Matrix(int n){
        double[][] a = new double[n][n];
        for(int hc=0;hc<a.length;hc++){
            for(int lc=0;lc<a[0].length;lc++){
                a[hc][lc]=0;
            }
        }
    }
    Matrix(double a[][]){
        double n[][]=new double[a.length][a[0].length];
        int c=0;
        for (double e[]:a){
            n[c]=e;
            c++;
        }
    }
    public String toString(){
        String res="{";
        for(double[] st:n){
            for (double s:st) {
                res = res +" "+s;
            }
            res=res+"\n";
        }
        res=res+"}";
        return res;
    }
}
