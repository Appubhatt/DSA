


import java.util.*;

public class Main {

    public static void main(String[] args) {
        float k=0;
        int piles[]={3,6,7,11};
        int h=8;
        for(int i=0;i<piles.length;i++){
            k+=piles[i];
        }

        float f = k/h;
        System.out.println(Math.ceil(f));
    }


}
