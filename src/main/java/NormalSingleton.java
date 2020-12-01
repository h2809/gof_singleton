public class NormalSingleton {
	private static NormalSingleton INSTANCE = new NormalSingleton();
	private String name;

	private NormalSingleton() {
		System.out.println("インスタンスを生成しました。");
		name = "yoshida";
	}

	public String getName() {
		return name;
	}

	public static NormalSingleton getInstance() {
		return INSTANCE;
	}
}
