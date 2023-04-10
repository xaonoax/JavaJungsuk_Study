package Ch06_ObjectOriented;

public class Ch06_ex6_09 {

	public static void main(String[] args) {
		
		// 오버로딩의 올바른 예
		class MyMath3 {
			int add(int a, int b) {
				System.out.print("int add(int a, int b) - ");
				return a + b;
			}
			
			long add(long a, long b) {
				System.out.print("int add(int a, int b) - ");
				return a + b;
			}
			
			int add(int[] a) {  // 배열의 모든 요소의 합을 결과로 돌려줌
				System.out.print("int add(int[] a) - ");
				int result = 0;
				for (int i=0; i<a.length; i++)
					result += a[i];
				
				return result;
			}
			
		}
		
	}

}
