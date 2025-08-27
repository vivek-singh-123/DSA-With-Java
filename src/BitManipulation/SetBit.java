package BitManipulation;

public class SetBit {
    public static void main(String[] args) {
        int n=5;  //0101
        int pos=1;
        int bitMask=1<<pos;

        int result = bitMask | n;  //0111
        System.out.println(result);
    }
}
