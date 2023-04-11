public class PremierLeague {
    public String team;
    public int goal, play, points;

    PremierLeague(String team, int play, int goal, int points) {
        this.team = team;
        this.play = play;
        this.goal = goal;
        this.points = points;
    }

    void print() {
        System.out.println("Team = " + team);
        System.out.println("Play = " + play);
        System.out.println("Goal = " + goal);
        System.out.println("Points = " + points);
    }
}
