package hackett.model;

import hackett.util.annotations.ImplementedBy;

/**
 * Wrapper class which holds a Rank with ability to get and increment rank.
 */
@ImplementedBy(Tile.class)
public interface ITile {

    Rank getRank();

    void incrementRank();
}
