public class printTable{
	public static void main(String[] args) {
		int a[][]={{0,0},{1,4},{2,7},{3,9},{4,11}};
		int b[][]={{2,1},{4,2},{6,3},{10,5},{12,7}};
		double x,y;
		System.out.println("a 		b 		Middle Point");
		for(int i= 0; i <= 5; i++){
			System.out.print("\n");
			x = (a[i][0] + b[i][0])/2.0;
			y = (a[i][1] + b[i][1])/2.0;;
			System.out.print("(" + a[i][0] + "," + a[i][1] + ") 		");
			System.out.print("(" + b[i][0] + "," + b[i][1] + ") 		");
			System.out.print("(" + x + "," + y+ ")");
			
		}
	}
}