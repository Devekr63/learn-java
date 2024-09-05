public class Main {
    public static void main(String[] args) {
        Team<BaseballPlayer> tigers = new Team<>("Tigers");
        Team<Player> wolves = new Team<>("Wolves");

        wolves.addTeamMember(new FootballPlayer("Rudy", "Striker"));
        wolves.addTeamMember(new FootballPlayer("Andy", "Fielder"));
        wolves.addTeamMember(new FootballPlayer("Cody", "Striker"));

        Team<BasketBallPlayer> leakers = new Team<>("Leakers");
        leakers.addTeamMember(new BasketBallPlayer("Johny"));
        leakers.addTeamMember(new BasketBallPlayer("Shake O niel"));
        leakers.addTeamMember(new BasketBallPlayer("Micheal Jordan"));

    }
}
