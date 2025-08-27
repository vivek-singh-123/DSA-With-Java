package BitManipulation;

public class GetBit {
    public static void main(String[] args) {
        int n=5;  //binary no would be: 0101
        int pos=3;
        int bitMast=1<<pos;

        if((bitMast & n) == 0){
            System.out.println("Bit was zero");
        }else {
            System.out.println("Bit was one");
        }
    }
}
