package vcanus;

public class _5_Pond {
		
	public static int getCount(int[][] pond, int i, int j, int condition) {
		// 상하좌우가 조건에 일치하는지 확인하기 위한 변수
		int count = 0;
		// 상하좌우 좌표 찾기위한 배열
		int[][] dir =  {
			{0, 1, 0, -1},
			{1, 0, -1, 0}
		};
		// 상하좌우 값 찾기
		for(int k = 0;k<4;k++) {
			int ii = i + dir[0][k];
			int jj = j + dir[1][k];
			// OutOfBounds 방지
			if(ii<0 || ii == pond.length || jj<0 || jj == pond.length) continue;
			// 현재 셀이면서 상하좌우가 같거나 클 경우 count ++
			if(pond[i][j] == condition && pond[ii][jj] >= condition) count++;
		}	
		return count;
	}

	public static void main(String[] args) {	
		
		int[][] pond = {
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
				{0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
				{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
				{0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
				{0, 0, 1, 1, 1, 1 ,1 ,1 ,0, 0},
				{0, 0, 0, 1, 1, 1 ,1 ,0 ,0, 0},
				{0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		};

		// 셀이 1~3이고 상하좌우가 1~3보다 같거나 크다면 셀 +1
		// 깊이가 최대 4 인것을 알기 때문에 이렇게 반복문을 작성했지만 모를 경우는 어떻게 할지 생각이 필요하다.
		for(int k=1;k<4;k++) {
			// pond[i][j]
			for(int i=0;i<pond.length;i++) {
				for(int j=0;j<pond.length;j++) {
					// getCount(pond, i, j, 조건수) == 4 면 상하좌우 같거나 크다. 현재 셀 +1
					if(getCount(pond, i, j, k) == 4) pond[i][j]++;
				}
			}
		}
		// 배열 출력
		for(int i=0;i<pond.length;i++) {
			for(int j=0;j<pond.length;j++) {
				System.out.print(pond[i][j]+" ");
			}
			System.out.println();
		}

	}

}
