package Part1.Chapter1;

public class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        this.amount *= multiplier;
    }
}
