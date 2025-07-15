public class OctAdd {
    public static void main(String[]args){
        int oct1=127;
        int oct2=56;
        int dec1=OctToDec(oct1);
        int dec2=DecToOct(oct2);
        int octSum=dec1+dec2;
        System.out.println(octSum);
    }
    static int OctToDec(int octal){
        int decimal=0;  
        int base=1;
        while(octal>0){
            int lastdigit=octal%10;
            decimal=decimal+lastdigit*base;
            base=base*8;
            octal=octal/10;
        }
        return decimal;

    }static int DecToOct(int decimal){
        int octal=0;
        int base=1;
        while(decimal>0){
            int lastdigit=decimal%8;
            octal=octal+lastdigit*base;
            base=base*10;
            decimal=decimal/8;
        }
        return octal;
    }
    
}
