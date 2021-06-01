
public class ArrayPractice2 {
	public static void main(String[] args) {
		int[] numbers = {20,22,34,55,67};
		int number = 221;
		boolean flag = true;
		for(int ele : numbers) {
			if(ele==number) {
				System.out.println(number + " " + "Element is present");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println(number + " " + "Element is not present");
		}
	}
}
