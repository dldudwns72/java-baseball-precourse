package baseball.domain;


import baseball.exception.BallNumberException;

public class BallNumber {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 9;

    private int number;

    public BallNumber(int number) {
        if (isOverNumber(number)) throw new BallNumberException();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private boolean isOverNumber(int number) {
        return number < MIN_NUMBER || number > MAX_NUMBER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BallNumber that = (BallNumber) o;
        return number == that.number;
    }

}
