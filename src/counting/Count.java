package counting;

public class Count {
    public int [] evenAndOddCounts(int [] value) {
        int even = 0;
        int odd = 0;
        for (int index : value) {
            if (index % 2 == 0) {
                even += 1;
            } else odd += 1;
        }
        return new int[]{even, odd};
    }
}
