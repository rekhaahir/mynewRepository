package com_5_6_19_practicals;

public class Prac79 {
	void showarray(int[][] a) {
		int j;
		A1: for (int i = 0; i < a.length; i++) {
			A2: for (j = 0; j < a.length; j++) {
				if (i == 2 || j == 4) {
					break A2;
				}

			}
			System.out.println(i + " " + j);

		}
	}
	

	public static void main(String[] args) {
		int[][] x= {{10
			,20,30,40},{20},{49},{33}};
		Prac79 ob=new Prac79();
		ob.showarray(x);
		
		/* aa:  
        for(int i=1;i<=3;i++){  
            bb:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        break aa;  
                    }  
                    System.out.println(i+" "+j);  
                }  
        }  
	}*/

	}
	}
