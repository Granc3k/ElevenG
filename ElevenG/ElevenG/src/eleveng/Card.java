package eleveng;

public class Card {

    String number;
    String symbol;
    int value;

    public Card(String number, String symbol, int value) {
        this.number = number;
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return number + "" + symbol;
    }

    public String getNumber() {
        return number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }

}
