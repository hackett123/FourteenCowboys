package hackett.model;

public class Tile implements ITile {
    private Rank rank;

    Tile(Rank rank) {
        this.rank = rank;
    }

    @Override
    public Rank getRank() {
        return this.rank;
    }

    @Override
    public void incrementRank() {
        this.rank = Rank.values()[this.rank.ordinal() + 1];
    }
}
