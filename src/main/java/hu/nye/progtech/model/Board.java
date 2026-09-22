package hu.nye.progtech.model;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private final int rows;
    private final int cols;
    private final Map<Character, Vehicle> vehicles;

    public Board(int rows, int cols, Map<Character, Vehicle> vehicles) {
        this.rows = rows;
        this.cols = cols;
        this.vehicles = new HashMap<>(vehicles);
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Map<Character, Vehicle> getVehicles() {
        return new HashMap<>(vehicles);
    }
    // lấy ra một chiếc xe cụ thể dụa vào kí tự(symbol) -> nếu ko ìm thấy xe thì trả về null
    public Vehicle getVehicle(char symbol){
        return vehicles.get(symbol);
    }
    // kiểm tra xem liệu rằng nước đi tới toạ độ (r,c) có hợp lệ"nằm trong bàn cờ" hay ko
    public boolean isInsideBoard(int r, int c){
        return 0 <=r && r < rows && 0 <= c && c < cols;
    }

}





































