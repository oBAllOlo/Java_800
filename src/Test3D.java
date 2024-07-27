import java.util.Scanner;

public class Test3D {
    public static void main(String[] args) {
        int [][][]room;
        room_info roomdata = new room_info();
        room = roomdata.inputdata();
        roomdata.checkdata(room);
        roomdata.showdata();
    }
}

class room_info{
    public int block,row,column,total_man,total_avail;

    public int get_total(int[][][]rm, int t){
        int count = 0;
        for (int i = 0; i < block; i++) {
            for (int j = 0; j < row; j++){
                for (int k = 0; k < column; k++) {
                    switch (t) {
                        case 0:
                            if(rm[i][j][k] == 0)
                            count++;
                            break;
                        case 1:
                            if(rm[i][j][k] != 0)
                            count = count + rm[i][j][k];
                            break;
                    }
                }
            }
        }
        return count;
    }
    public int[][][] inputdata(){
        int[][][]rm;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input total Building --> ");
        block = scan.nextInt();
        System.out.print("Input total Floor --> ");
        row = scan.nextInt();
        System.out.print("Input total Room --> ");
        column = scan.nextInt();
        rm = new int[block][row][column];
        for(int i = 0; i < block; i++){
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < column; k++) {
                    System.out.print("Input people in building "+(i+1)+" Floor "+(j+1)+" Room "+(k+1)+" --> ");
                    rm[i][j][k] = scan.nextInt();
                }
            }
        }
        return rm;
    }

    public void checkdata(int[][][] rm) {
        total_man = get_total(rm, 1);
        total_avail = get_total(rm, 0);
    }

    public void showdata(){
        System.out.println("Total People = "+total_man);
        System.out.println("Total Available Room = "+total_avail);
    }
}
