
public class Purifier {

	/**
	 * 정수기에 남은 물의 양 (단위: L)
	 */
	double remainWater;

	/**
	 * 냉수/온수 선택 버튼 ( 냉,온 수 여부) 0: 온수 1: 냉수
	 */
	int temperature;

	/**
	 * 정수기에 남아 있는 얼음의 양(단위: 개)
	 */
	double remainIceBlock;

	/**
	 * 정수 필터 값이 100이라면, 새 필터 0이라면 교체
	 */
	int filter;

	/**
	 * 물 배출 ==> 물 배출 버튼을 누른 행위!
	 */
	public void waterExhaust() {
		// 물 배출 버튼을 누르면, 정수기 문통의 양이 줄어든다.
		if (remainWater > 0) {
			remainWater--;
		}

		// 남아있는 물의 양이 0일 때는 물통의 양이 더 이상 줄어 들 수 없다.

	}

	/**
	 * 온도 조절
	 */
	public void chooseTemperature() {
		// 온도 조절 버튼을 누를 때마다 냉수/온수가 전환된다.
		if (temperature == 0) {
			temperature = 1; // 냉수일 때 온수 변환
		} else {
			temperature = 0; // 온수일 때 냉수 변환
		}

	}

	/**
	 * 냉각 기능 (얼음을 생성)
	 */
	public void makeIce() {
		// 정수기에 보관할 수 있는 최대 얼음의 개수가 100개
		// 만약 남아있는 얼음의 개수가 100개라면 얼음을 생성하지 않는다.
		if (remainIceBlock < 100) {
			remainIceBlock++;
		}

	}

	/**
	 * 물통에 물을 채운다
	 */
	public void fillWater() {
		// 정수기 물통의 최대 저장용량이 30L로 가정
		// 물통에 남아있는 물의 양이 30L라면 물을 채우지 않는다.
		// 1. 물통에 물을 채운다
		if (remainWater < 30) {
			remainWater++;

			// 2. 물은 필터를 통해 걸러진다. == 필터의 사용량이 줄어든다.
			// 필터의 사용량이 0이 된다면, 필터는 정상기능을 수행할 수 없다.
			if (filter > 0) {
				filter--;
			}
		}
	}

	/**
	 * 얼음 배출
	 */
	public void iceExhaust() {
		// 남아있는 얼음의 개수가 0보다 클 때만 얼음을 배출한다.
		if (remainIceBlock > 0) {
			remainIceBlock--;
		}
	}
}
