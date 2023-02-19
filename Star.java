import java.util.Scanner;

/*
Java döngüler ile yıldız yapın
   *      3 space  1.  1 star
  ***     2 space  2.  3 star
 *****    1 space  3.  5 star
*******   0 space  4.  7 star
            n-i      i   2i-1
            n=4
 */
public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Sayı Giriniz:");
        n = input.nextInt();

        for (int i=1; i<=n; i++){
            for (int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n-1; i>=1; i--){
            for (int k=n-i; k>=1; k--){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    }

