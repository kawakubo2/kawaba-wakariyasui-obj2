package lib;

public class Bit {
	private static boolean dic = false; // OFF
	private static boolean hex = false; // OFF
	private static String dicStr = "";	// 10進数
	private static String hexStr  ="";	// 16進数
	private static boolean spc = true;	// 2進数はｽﾍﾟｰｽで区切る
	/*
	 * 出力切り替え
	 */
	public static void withDecimal() {
		dic = true;
	}
	public static void noDecimal() {
		dic = false;
	}
	public static void withHex() {
		hex = true;
	}
	public static void noHex() {
		hex= false;
	}	
	public static void withSpace() {
		spc = true;
	}
	public static void noSpace() {
		spc= false;
	}	
	/*
	 * 改行メソッド
	 */
	public static void newLine() {
		System.out.println();
	}
	public static void println() {
		System.out.println();
	}
	public static void printlnH() {
		System.out.println();
	}
	/*
	 * 出力メソッド+改行+改行
	 */
	
	public static void printlnn(int n) {
		System.out.println(toBinaryString(n)+"\n");
	}
	public static void printlnn(String s, int n) {
		System.out.println(s+toBinaryString(n)+"\n");
	}
	public static void printlnnH(String s, int n) {
		System.out.println(s+toHexString(n)+"\n");
	}
	/*
	 * 出力メソッド
	 */
	public static void println(int n) {
		System.out.println(toBinaryString(n));
	}
	public static void print(int n) {
		System.out.print(toBinaryString(n));
	}
	public static void println(String s, int n) {
		System.out.println(s+toBinaryString(n));
	}
	public static void print(String s, int n) {
		System.out.print(s+toBinaryString(n));
	}	
	public static void printlnH(String s, int n) {
		System.out.println(s+toHexString(n));
	}

	public static void printH(String s, int n) {
		System.out.print(s+toHexString(n));
	}	
	public static void printlnH(int n) {
		System.out.println(toHexString(n));
	}
	public static void printlnnH(int n) {
		System.out.println(toHexString(n)+"\n");
	}
	public static void printH(int n) {
		System.out.print(toHexString(n));
	}	
	
	/*
	 *  byteを2進数の文字列に変換する
	 */
	public static String toBinaryString(int n) {	// 整形する
		return toBinaryString(n," ");
	}
	//
	public static String toBinaryString(int n, String delim) {
		String s = toByte(n);
		return toBinaryString(s, delim);
	}
	
	/*
	 * byte型の値（-128～127)を2進数文字列にして返す
	 */
	public static String toByte(int b) {
		int c=b;
		int size = 8;
		
		/* 最上位８ビットと最下位８ビットを取り出しANDを取る
		 * これにより、下位８ビットにbyteの値として合成する
		 */
		
		int and;
		int top8 = (c>>>24);
		int btm8 = (0b00000000000000000000000011111111 & c);
		
		int mid = (0b00000000111111110000000000000000 & c);
		
		and = mid!=0 ? top8 & btm8 : btm8;
		
		// 2進数文字列に変換する（上位24ビットが0なので1～8桁になる）
		String temp = Integer.toBinaryString(and);
		//
		// 10進数、16進数の文字列を作成しておく
		setValue(temp);

		// ８桁に満たない場合はゼロで埋める
		int tempSize = temp.length();
		String zero = tempSize==8 ? "" : "0".repeat(size - tempSize);
		return zero + temp;
		
	}

	/*
	 * 区切り文字を挟んで見やすく整形する
	 */
	public static String toBinaryString(String bin,String delim) {
		
		/* 整形せずにリターンする　*/
		if(!spc) {
			String ret  = dic ? bin + dicStr : bin;
			String ret2 = hex ? ret + hexStr : ret;
			return ret2;			
		}

		/*  1111 1111 の形に整形　*/	
		String temp = bin.substring(0,4)+ delim + bin.substring(4);
		
		String ret  = dic ? temp + dicStr : temp;
		String ret2 = hex ? ret + hexStr : ret;
		return ret2;
	}
	/*
	 * byteを16進数文字列に変換する
	 */
	public static String toHexString(int n) {
		String s = Integer.toHexString(n);
		
		int len = s.length();
		if(len<=2) {
			return toHexString(s, 2).toUpperCase();
		}else {
			return  s.substring(len-2).toUpperCase(); 	
		}
	}
	
	public static String toHexString(String hex, int len) {
		
		String temp = hex.length()<len ? "0".repeat(len-hex.length())+hex : hex;
		
		return temp.toUpperCase();
	}

	/*
	 * byteの２進数文字列を10進数の文字列に変換して返す
	 */
	public static void setValue( String s) {
		int n = Integer.parseInt(s,2);
		byte b = (byte)n;
		dicStr = String.format("%5s", b);
		hexStr = "  " + toHexString(n);
	}	
	
	// テスト用
	public static void main(String[] args) {
		
		withDecimal();
		
		byte a = (byte)0xF0;
		
		//int a=0xF0;
		System.out.println(toBinaryString(a));
		System.out.println();
		
		for(int i=1; i<=8; i++) {
			System.out.println(toBinaryString(a<<i));
		}
	}
	
	
	
}
