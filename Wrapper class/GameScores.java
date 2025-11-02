public class GameScores {
    public static void main(String[] args) {
        Integer scores[] = {10, null, 30, null, 45};

        int nullCount = 0, total = 0;
        for(Integer score : scores) {
            if(score == null) nullCount++;
            else total += score; // auto-unboxing
        }

        System.out.println("Players not played: " + nullCount);
        System.out.println("Total valid scores: " + total);
    }
}
