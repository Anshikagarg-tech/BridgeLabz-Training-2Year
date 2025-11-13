import java.util.*;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] votesCast = {"A", "B", "A", "C", "A", "B", "C", "A", "C", "B"};

        for (String candidate : votesCast)
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);

        // Print total votes
        System.out.println("Vote Count:");
        for (String c : votes.keySet())
            System.out.println(c + " : " + votes.get(c));

        // Find winner
        String winner = "";
        int maxVotes = 0;
        for (String c : votes.keySet()) {
            if (votes.get(c) > maxVotes) {
                maxVotes = votes.get(c);
                winner = c;
            }
        }
        System.out.println("\nWinner: " + winner + " (" + maxVotes + " votes)");
    }
}
