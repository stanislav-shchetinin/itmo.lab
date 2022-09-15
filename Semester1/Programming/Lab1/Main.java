public class Main {
    public static void main (String[] args){

        int k[];
        k = new int[6];
        for (int i = 5; i <= 15; i += 2) {
            k[(i - 5) / 2] = i;
        }

        double x[];
        x = new double[11];
        final double MIN = -7.0, MAX = 10.0;

        for (int i = 0; i < 11; ++i){
            double rnd = Math.random() * (MAX - MIN) + MIN;
            x[i] = rnd;
        }

        double c[][];
        c = new double[6][11];

        for (int i = 0; i < 6; ++i){
            for (int j = 0; j < 11; ++j){

                if (k[i] == 11){
                    c[i][j] = Math.tan( Math.pow(x[j]/2.0/3.0, 3) );
                } else if (k[i] == 5 || k[i] == 9 || k[i] == 15) {
                    c[i][j] = Math.log( 3 * Math.pow( Math.abs(x[j])/(Math.abs(x[j]) + 1.0), 2 ));
                } else {
                    c[i][j] = Math.atan( Math.sin( Math.asin(
                          1.0 / ( Math.pow( Math.E,
                                  Math.pow( Math.tan( Math.cos( Math.atan( (x[j] + 15)/17.0 ) ) ), 2 )) )
                    ) ) );
                }

            }
        }

        for (int i = 0; i < 6; ++i){
            for (int j = 0; j < 11; ++j){
                System.out.printf("%.4f  ", c[i][j]);
            }
            System.out.print("\n");
        }

    }
}
