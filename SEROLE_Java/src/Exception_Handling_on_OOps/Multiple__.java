//package Exception_Handling_on_OOps;
//
//interface Parent1 {
//	void ParentMethod1();
//}
//
//interface Parent2 {
//	void ParentMethod2();
//}
//
//class child implements Parent1, Parent2 { // child
//	public void ParentMethod1() {
//		int a = 20;
//		int b = 0;
//		try {
//			System.out.println(a / b);
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//		}
//
//	}
//
//	public void ParentMethod2() {
//		String str = "Chaitanya";
//		try {
//			System.out.println(str.charAt(3));
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}
//}
//
//public class Multiple__ {
//	public static void main(String[] args) {
//		child obj = new child();
//		obj.ParentMethod1();
//		obj.ParentMethod2();
//
//	}
//
//}
