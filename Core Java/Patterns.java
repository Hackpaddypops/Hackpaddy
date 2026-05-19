public static void main(String[] args) {
    System.out.println("5 column 5 rows:");
    for(int i=1; i<6;i++){
        for(int j=1;j<6;j++){
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after each row
    }

    System.out.println("Right Angle Triangle:");
    for(int i=1; i<6;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after each row
    }

    System.out.println("Numbered Right Angle Triangle:");
    for(int i=1; i<6;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println(); // Move to the next line after each row
    }

    System.out.println("Same Numbered Right Angle Triangle:");
    for(int i=1; i<6;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println(); // Move to the next line after each row
    }

    System.out.println("Reverse Right Angle Triangle:");
    for(int i=5; i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after each row
    }

    System.out.println("Reverse Numbered Right Angle Triangle:");
    for(int i=5; i>0;i--){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println(); // Move to the next line after each row
    }

    System.out.println("Triangle:");
    int n=5;
    for(int i=0; i<n;i++){
        for(int j=1;j<=(n-i-1);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(i*2+1);j++){
            System.out.print("*");
        }
        for(int j=1;j<=(n-i-1);j++){
            System.out.print(" ");
        }
        System.out.println();
    }

    
    for(int i=n; i>0;i--){
        for(int j=1;j<(n-i+1);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(i*2-1);j++){
            System.out.print("*");
        }
        for(int j=1;j<(n-i+1);j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    System.out.println("Reverse Triangle Up ^");

    System.out.println("Half Triangle:");
    for(int i=0; i<n;i++){
        for(int j=1;j<=(i+1);j++){
            System.out.print("*");
        }
        for(int j=1;j<=(n-i-1);j++){
            System.out.print(" ");
        }
        System.out.println();
    }

    
    for(int i=n; i>0;i--){
        for(int j=1;j<=(i-1);j++){
            System.out.print("*");
        }
        for(int j=1;j<(n-i+1);j++){
            System.out.print(" ");
        }
        System.out.println();
    }

    System.out.println("Binary Right Angle Triangle:");
    for(int i=1; i<6;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2 == 0){
                System.out.print(1);
            }else{
                System.out.print(0);
            }
            
        }
        System.out.println(); // Move to the next line after each row
    }
    
    System.out.println("Numbered Reverse Diamond");
    for(int i=1;i<n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        //spaces
        for(int j=1;j<=2*(n-i-1);j++){
            System.out.print(" ");
        }
        for(int j=i;j>0;j--){
            System.out.print(j);
        }
        System.out.println();
    }
    
    System.out.println("Sequence Numbered Right Triangle");
    int count = 1;
    for(int i = 1; i<n;i++){
        //numbers
        for(int j=1;j<=i;j++,count++){
            System.out.print(count + " ");
        }
        System.out.println();
    }

    System.out.println("Alphabetical Right Triangle");
    for(int i=1;i<=n;i++){
        //alphabets
        for(int j=0;j<i;j++){
            System.out.print((char)('A'+j) + " ");
        }
        System.out.println();
    }

    System.out.println("Reverse Alphabetical Right Triangle");
    for(int i=n;i>=0;i--){
        //alphabets
        for(int j=0;j<i;j++){
            System.out.print((char)('A'+j) + " ");
        }
        System.out.println();
    }

    System.out.println("Same Alphabetical Right Triangle");
    for(int i=0;i<n;i++){
        //alphabets
        for(int j=0;j<=i;j++){
            System.out.print((char)('A'+i) + " ");
        }
        System.out.println();
    }
    
    System.out.println("Alphabetical Triangle");
    for(int i=0;i<n;i++){
        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }

        //alphabet
        char ch='A';
        int breakpoint = (i*2+1)/2;
        for(int j=1;j<=(i*2+1);j++){
            System.out.print(ch);
            if(j<=breakpoint) ch++;
            else ch--;
        }

        //space
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }

    System.out.println("Same Alphabetical Right Triangle");
    for(int i=0;i<n;i++){
        //alphabets
        for(int j=0;j<=i;j++){
            char ch = (char) ('E'-i);
            System.out.print((char)(ch+j) + " ");
        }
        System.out.println();
    }

    System.out.println("Diamond Stars:");
    n=6;
    for(int i=0; i<n-1;i++){
        
        for(int j=0;j<(n-i-1);j++){
            System.out.print("*");
        }
        for(int j=0;j<(i*2);j++){
            System.out.print(" ");
        }
        for(int j=0;j<(n-i-1);j++){
            System.out.print("*");
        }
        System.out.println();
    }

    
    for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        for(int j=0;j<2*(n-i-1);j++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println("HorizontalDiamond Stars:");
    n=6;
    for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        for(int j=0;j<2*(n-i-1);j++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i=1; i<n-1;i++){
        
        for(int j=0;j<(n-i-1);j++){
            System.out.print("*");
        }
        for(int j=0;j<(i*2);j++){
            System.out.print(" ");
        }
        for(int j=0;j<(n-i-1);j++){
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println("Rectangle/Square:");
    n=3;
    for(int i=0; i<n-1;i++){
        
        for(int j=0;j<(n-i-1);j++){
            System.out.print("*");
        }
        for(int j=0;j<(i*2);j++){
            System.out.print(" ");
        }
        for(int j=0;j<(n-i-1);j++){
            System.out.print("*");
        }
        System.out.println();
    }

    
    for(int i=1;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        for(int j=0;j<2*(n-i-1);j++){
            System.out.print(" ");
        }
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //TODO: Numbered Rectangle
    System.out.println("Numbers in Rectangle:");
    n=4;
    for(int i=n;i>0;i--){
        for(int j = 0;j< (2*n-1);j++){
            System.out.print(i);
        }
    }
    
    

}