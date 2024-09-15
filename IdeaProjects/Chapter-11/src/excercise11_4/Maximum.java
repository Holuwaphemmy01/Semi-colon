package excercise11_4;

import java.util.ArrayList;

public class Maximum {
    public int Largest(ArrayList <Integer> values) {
        int numb = 0;
        if(values.size() > 0){
            for(int max : values){
                if(max > numb){
                    numb = max;
                }
            }
            return numb;
        }

        return 0;
    }
}
