package Test1Answer;


    public class BlockConcept {

        //complete controol flows of a java class :

    /*static block , main , contructor-> se pahle normal block -- fir constructor--- then normal code base
            would be getting executed from top to bottom*/


        BlockConcept(){
            System.out.println("constructor 11111111");
        }

        static {
            System.out.println("main function");
            new BlockConcept();
            System.out.println("static block!");
            for(int i=0; i<10; i++){
                System.out.println(i);
            }
        }
        {
            System.out.println("Normal block !");
        }
        public static void main(String[] args) {

        }
    }