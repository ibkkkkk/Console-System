package education.basic;

public interface Delivery {
	//配送支持を受けて、問い合わせ番号を返す。
	public String deliver(String name, String address, String item);
};
