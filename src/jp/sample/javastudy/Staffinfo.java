package jp.sample.javastudy;

class Staff {
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}
	
	public Staff(String name, int staffid, String email) {
		super();
		this.name = name;
		this.staffid = staffid;
		this.email = email;
	}
}

public class Staffinfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// インスタンスの生成を行った
		Staff yamada = new Staff("Yamada Taro", 12345, "yamada@abc.co.jp");
//		yamada.name = "Taro Yamada";
//		System.out.println(yamada.name);
		yamada.sayhello();
		
	}

}
