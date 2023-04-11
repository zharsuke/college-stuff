public class Candidates {
    public String [] candidates;
    public int amount;
    public Candidates(int amount) {
        this.amount = amount;
        candidates = new String[amount];

    }
    public String divideConquer(String [] candidates, int left, int right) {
        int mid;
        String result = "";
        if (left == right) {
            result = candidates[left];
        } else {
            mid = (left + right) / 2;
            String result1 = divideConquer(candidates, left, mid);
            String result2 = divideConquer(candidates, mid+1, right);
            result = result1 + " " + result2;
        }
        return result;
    }

    public String getHighest() {
        String highest = "";
        int max = 0;
        for (int i = 0; i < amount; i++) {
            int count = 0;
            for (int j = 0; j < amount; j++) {
                if (candidates[i].equals(candidates[j])) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                highest = candidates[i];
            }
        }
        return highest;
    }
}
