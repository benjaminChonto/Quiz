public class feladat01 {

    public static int feladat01(String[] colors){
        if(colors.length == 0) return 0;
        int subsetCount = 1;
        for(int i = 0; i< colors.length; ++i){
            subsetCount *= 2;
        }
        //Returning the number of subsets with more than one element;
        return subsetCount - colors.length - 1;
    }

    public static void main(String[] args){
        //Examples
        String[] c0 = {};
        String[] c1 = {"piros"};
        String[] c2 = {"piros", "kek"};
        String[] c3 = {"piros","kek","zold"};

        int a = feladat01(c0);
        int b = feladat01(c1);
        int c = feladat01(c2);
        int d = feladat01(c3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
}
