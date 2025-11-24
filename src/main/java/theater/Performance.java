package theater;

/**
 * Class representing a performance of a play.
 */
public class Performance {

    private final String playID;
    private final int audience;

    /**
     * Creates a performance with the given play ID and audience size.
     *
     * @param playID   the ID of the play
     * @param audience the audience size
     */
    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Returns the ID of the play.
     *
     * @return the play ID
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Returns the audience size.
     *
     * @return the audience size
     */
    public int getAudience() {
        return audience;
    }
}
