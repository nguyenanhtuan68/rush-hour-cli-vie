package hu.nye.progtech.model;
import java.util.Objects;
public class Vehicle{
    // các thuộc tính cố định
    private final char symbol;
    private final int length;
    private final Orientation orientation;
    // thuộc tính thay đổi khi xe di chuyển(toạ độ)
    private int row;
    private int col;

    public Vehicle(char symbol, int length, Orientation orientation, int row, int col) {
        this.symbol = symbol;
        this.length = length;
        this.orientation = orientation;
        this.row = row;
        this.col = col;
    }
    // tạo các Getter chỉ đọc
    public char getSymbol(){
        return symbol;
    }
    public int getLength(){
        return length;
    }
    public Orientation getOrientation(){
        return orientation;
    }
    // tạo các getter và setter cho toạ độ
    public int getRow(){
        return row;
    }
    public void setRow(int row){
        this.row=row;
    }
    public int getCol(){
        return col;
    }
    public void setCol(int col){
        this.col=col;
    }

    // Kiểm tra xem có phải xe target ko("xe target được mặc định là X")
    public boolean isPlayerTarget(){
        return this.symbol == 'A';
    }
    public boolean isAiTarget(){
        return this.symbol == 'B';
    }

    // So sánh 2 xe: Hai xe được coi là 1 nếu cùng  1 kí hiệu symbol
    @Override
    public boolean equals(Object o){
        if (this ==o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return symbol == vehicle.symbol;
    }
    // hashcode bắt buộc phải đi cùng equals để dùng được trong set và map
    @Override
    public int hashCode(){
        return Objects.hash(symbol);
    }

}










