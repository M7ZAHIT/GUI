package GUI01;

public class PhoneCompany {
    public static void main(String[] args) {
         info(encode(130999,101,7777,99,7000,6));
    }

    public static long encode(int caller, int caller_zone,
                              int callee, int callee_zone,
                              int duration, int tariff) {
        long all = caller;
        all=all<<7;
        all+=caller_zone;
        all=all<<17;
        all+=callee;
        all=all<<7;
        all+=callee_zone;
        all=all<<13;
        all+=duration;
        all=all<<3;
        all+=tariff;

        return  all;
    }

    public static void info(long res) {
        long tariff = res & 7;
        res = res>>3;
        long duration = res & 0x1FFF;
        res = res >> 13;
        long callee_zone = res & 0x7f;
        res = res >> 7;
        long callee = res & 0x1FFFF;
        res = res >>17;
        long caller_zone = res & 0x7F;
        res = res >>7;
        long caller = res & 0x1FFFF;
        System.out.println("Caller : "+caller);
        System.out.println("Caller_zone : "+caller_zone);
        System.out.println("Callee : "+callee);
        System.out.println("Callee_zone : "+callee_zone);
        System.out.println("Duration : "+duration);
        System.out.println("Tariff : "+tariff);
    }
}
