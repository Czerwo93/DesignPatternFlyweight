import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class ChessPiecie {
    private String name;
    private int numberPosition;
    private String letterPosition;
    private Color color;

    public ChessPiecie(String name, int numberPosition, String letterPosition, ColorType colorType) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (colorType) {
            case BLACK:
                this.color = ColorRepository.getBlack();
                break;
            case WHITE:
                this.color = ColorRepository.getWhite();
                break;
        }
    }


}
