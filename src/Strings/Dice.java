package Strings;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
    }
    static void dice(String dul, int target){
        if(target == 0){
            System.out.println(dul);
            return;
        }
        for(int i = 1; i <= 6 && i <= target;i++){
            dice(dul + i,target - i);
        }
    }
}
