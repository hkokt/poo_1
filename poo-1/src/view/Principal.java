package view;

public class Principal {

	public static void main(String[] args) {
//		quebraHeap();
		quebraStack("bla");
	}

	public static void quebraHeap() {
		String[] strArray = new String[999999999];
		for (String str : strArray) {
			str += "a";
		}
	}

	public static void quebraStack(String bla) {
		if (bla == "nao vai parar nunca")
			return;
		else {
			bla += "bla";
			quebraStack(bla);
		}
	}

}
