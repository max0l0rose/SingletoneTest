public class Main {

    //    static EarlyInitSingleton earlyInitSingleton;

    public static void main(String[] args) {
        EarlyInitSingleton earlyInitSingleton1 = new EarlyInitSingleton();

        EarlyInitSingleton earlyInitSingleton = EarlyInitSingleton.getInstance();

        InitOnDemandSingleton initOnDemandSingleton = InitOnDemandSingleton.getInstance();

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
    }
}


