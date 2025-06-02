package nsu;

public class IdGenerator {
    private static final long STRAT_ID = 1L;
    private static long currentId = STRAT_ID;

    public static synchronized long generateId() {
        return currentId++;
    }
}
