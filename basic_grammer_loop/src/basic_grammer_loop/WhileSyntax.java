package basic_grammer_loop;

import java.util.Random;

public class WhileSyntax {
	
	public static void main (String[] args) {
		
//		int count = 0;
//		
//		while (count < 10) {
//			System.out.println("반복중입니다."); // X 10
//			count++;
//		}
//		
//		System.out.println("반복이 종료되었습니다.");
		
//		while (true) {
//			System.out.println(Math.random());
//		}
		
		Random random = new Random();
		int enemyHealthPoint = random.nextInt(Integer.MAX_VALUE);
		System.out.println(enemyHealthPoint);
		
		
		while (enemyHealthPoint > 0) {
			int damage = random.nextInt(1000); //0~999사이의 수
			System.out.println(damage);
			enemyHealthPoint -= damage;
			System.out.println(enemyHealthPoint);
			
		}
	}

}
