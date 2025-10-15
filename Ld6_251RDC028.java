import java.util.Scanner;

class Ld6_251RDC028 {
  public static void main(String[] args) {
    int i,j,x = 1,y = 0, a[][] = new int[10][10];
    System.out.println("Roberts Preimanis 16 251RDC028");

    Scanner sc = new Scanner(System.in);
    System.out.print("Ievadiet uzdevuma numuru (1 vai 2): ");
    int uzd = sc.nextInt();
    switch(uzd){
      case 1: {
        for(j=0;j<10; j++){
          if(j > 2) y++;
          for(i=y;i<=j;i++){
            a[i][j] = x;
            x++;
          }
        }
        for(i=0;i<10;i++){
          for(j=0;j<10;j++){
            System.out.print(a[i][j] + "\t");
          }
          System.out.println();
        }
        break;
      }
      case 2: {
        break;
      }
      default: {
        System.out.println("Kļūda!");
        sc.close();
        return;
    	}
		}
    
    sc.close();
  }
}
