package JavascriptMain;

public class Task {
    public int [] reverseNumber(int [] number){
        int [] newArray = new int[number.length];

        for (int num = 0; num < number.length; num++){
            int index = number.length - 1 - num;
            newArray[index] = number[num];
            number[num] = number[index];
        }
        return number;
    }

    

//    public int [] newReverseNumber(int [] number){
//        int [] newArray = new int[number.length];
//        for(int index = 0; index < number.length; index++){
//            for (int element = 0; element < number.length; element++){}
//        }
//    }

}
