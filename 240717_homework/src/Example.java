import java.util.Random;

public class Example {
	private boolean isInsertCoin = false; // 동전이 들어갔는지 여부를 나타내는 변수
	private int dolls = 5; // 초기 인형의 개수

	// 동전을 넣는 메서드
	public void insertCoin() {
		// 동전을 넣지 않은 상태에서는 동작하지 않음
		if (!isInsertCoin && dolls > 0) {
			System.out.println("동전을 넣습니다.");
			isInsertCoin = true;
		} else {
			System.out.println("동전을 넣지 않았거나 이미 게임을 진행 중입니다.");
		}
	}

	// 게임을 진행하는 메서드
	public int doGame() {
		// 동전이 들어가지 않았으면 게임을 실행하지 않음
		if (!isInsertCoin) {
			System.out.println("게임을 진행할 동전이 없습니다.");
			return -1; // 게임을 실행하지 않았음을 나타내는 값
		}

		// 랜덤하게 결과를 결정 (1 또는 0)
		Random random = new Random();
		int result = random.nextInt(2); // 0 또는 1을 랜덤하게 반환

		// 결과에 따라 처리
		if (result == 1) {
			System.out.println("인형을 뽑았습니다!");
			dolls--; // 인형을 뽑았으므로 인형 개수 감소
		} else {
			System.out.println("인형을 뽑지 못했습니다.");
		}

		// 게임이 끝났으므로 isInsertCoin을 false로 변경
		isInsertCoin = false;

		return result; // 랜덤하게 결정된 결과 반환 (0 또는 1)
	}

	public static void main(String[] args) {
		Example machine = new Example();

		// 동전을 넣지 않은 상태에서 게임 시도 (실행되지 않아야 함)
		machine.doGame();

		// 동전을 넣고 게임 시도
		machine.insertCoin();
		int result = machine.doGame();
		System.out.println("게임 결과: " + result);

		// 동전을 넣지 않은 상태에서 다시 게임 시도 (실행되지 않아야 함)
		machine.doGame();
	}
}
