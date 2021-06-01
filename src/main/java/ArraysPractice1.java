
public class ArraysPractice1 {
	public static void main(String[] args) {
		float[] numbers = {20.0f,30.6f, 45.7f, 78.44f, 78.09f};
		float sum = 0;
		for(float ele : numbers) {
			sum = sum+ele;
		}
		System.out.println(sum);
		
	}
}
