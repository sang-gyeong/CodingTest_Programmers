import java.util.*;
class Pair{
	int x;
	int y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class BOJ16236 {
	static final int [] dx = {0,0,1,-1};
	static final int [] dy = {1,-1,0,0};
	static int size, time, ate, n, sx, sy;
	static int [][] a = new int [22][22];
	static List <Pair> fish;
	static List <Pair> canEat;

	static void glow() {//아기상어 성장 + 먹을 수 있는 물고기 추가 
		if (size==2&&(ate==0||ate==1)) {
			size=2;
			return;
		}
		if (ate==size) {
			size++;
			ate=0;
			for (int i=0; i<fish.size();i++) {
				if(a[fish.get(i).x][fish.get(i).y]<=size-1) {
					canEat.add(new Pair(fish.get(i).x,fish.get(i).y));
				}
			}
		}
	}

	static void eat() {
		if(canEat.size()==0) {
			return;
		}
		int [][] d = new int [n][n];
		for (int i=0; i<n; i++) {
			Arrays.fill(d[i], -1);
		}
		Queue <Pair> q = new LinkedList<>();
		d[sx][sy]=0;
		q.add(new Pair(sx,sy));
		while(!q.isEmpty()) {
			Pair p = q.poll();
			int x = p.x;
			int y = p.y;
			for (int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				if (nx>=0 && nx<=n-1 && ny>=0 && ny<=n-1) {
					if (d[nx][ny]==-1 && a[nx][ny]<=size ) {
						d[nx][ny] = d[x][y]+1;
						q.add(new Pair(nx,ny));
					}
				}
			}
		}
		if (canEat.size()==1 && d[canEat.get(0).x][canEat.get(0).y]==-1) { //생선하나인데 갈수 없을 때 
			return;
		}
		//먹을 수 있는 물고기 중 가장 이동거리가 작은 물고기 위치 찾기 
		int disi=0;
		int min=500; 
		boolean cant = true; //모든 먹을수있는 물고기를 방문하지 못하는 경우 처리 
		for (int i=0; i<canEat.size();i++) {
			if(d[canEat.get(i).x][canEat.get(i).y]==-1) {
				continue;
			}
			cant = false;
			int dis = d[canEat.get(i).x][canEat.get(i).y];
			if (dis>min) continue;
			else if (dis<min) {
				min=dis;
				disi=i;
			}
			else if (dis==min) {
				if (canEat.get(i).x<canEat.get(disi).x) {
					disi=i;
				}else if (canEat.get(i).x==canEat.get(disi).x) {
					if (canEat.get(i).y<canEat.get(disi).y)
						disi=i;
				}
			}
		}
		if(cant)return;
		a[sx][sy]=0;
		sx=canEat.get(disi).x;//아기상어 위치 갱신 
		sy=canEat.get(disi).y;
		canEat.remove(disi);
		ate+=1;
		time+=min;
		glow();
		eat();	
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		a = new int [n][n];
		fish = new ArrayList<>();
		canEat = new ArrayList<>();
		sx = 0;
		sy = 0;
		time = 0;
		ate = 0;
		size = 2;//아기상어의 크기 
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				a[i][j] = kb.nextInt();
				if (a[i][j]==9) {
					sx=i;
					sy=j;
				}else if(a[i][j]>=1 && a[i][j]<=6) {
					if (a[i][j]==1) canEat.add(new Pair(i,j));
					fish.add(new Pair(i,j));
				}
			}
		}
		if (canEat.size()==0) {
			System.out.println(0);
			System.exit(0);
		}
		eat();
		System.out.println(time);
	}
}
