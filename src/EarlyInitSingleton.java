class EarlyInitSingleton {
	final static EarlyInitSingleton INSTANCE = new EarlyInitSingleton();

	public static EarlyInitSingleton getInstance() {
		return INSTANCE;
	}

	// private constructor and other methods...
	int a = 1; //1
	static int b = 1; //2
}
