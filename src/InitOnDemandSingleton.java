class InitOnDemandSingleton {
	private static class InstanceHolder {
		private static final InitOnDemandSingleton INSTANCE = new InitOnDemandSingleton();
	}

	public static InitOnDemandSingleton getInstance() {
		return InstanceHolder.INSTANCE;
	}

	static int getC() {
		return d;
	}

	// private constructor and other methods...
	int a = 1;
	static int b = getC();
	static int c = 1;
	final static int d = 1;
}
