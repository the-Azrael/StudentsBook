public class NotEnoughDataException extends RuntimeException{
    public NotEnoughDataException() {
        super("Недостаточно данных о студенте!");
    }
}
