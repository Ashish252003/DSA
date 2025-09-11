import java.util.ArrayList;
import java.util.List;

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();

        for (String op : operations) {
            switch (op) {
                case "+":
                    int lastScore = record.get(record.size() - 1);
                    int secondLastScore = record.get(record.size() - 2);
                    record.add(lastScore + secondLastScore);
                    break;

                case "D":
                    int scoreToDouble = record.get(record.size() - 1);
                    record.add(scoreToDouble * 2);
                    break;

                case "C":
                    record.remove(record.size() - 1);
                    break;

                default:
                    record.add(Integer.parseInt(op));
                    break;
            }
        }

        int sum = 0;
        for (int score : record) {
            sum += score;
        }

        return sum;
    }
}