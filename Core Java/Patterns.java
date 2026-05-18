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

    
}