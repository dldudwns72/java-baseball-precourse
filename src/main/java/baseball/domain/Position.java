package baseball.domain;


public class Position {

    private static final int MIN_POSITION = 1;
    private static final int MAX_POSITION = 3;
    private static final String BALL_POSITION_EXCEPTION_MESSAGE = "공은 세자리수여야 합니다.";

    private int position;

    public Position(int position) {
        if (isOverPosition(position)) throw new IllegalArgumentException(BALL_POSITION_EXCEPTION_MESSAGE);

        this.position = position;
    }


    private boolean isOverPosition(int position) {
        return position < MIN_POSITION || position > MAX_POSITION;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

}
