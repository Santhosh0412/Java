public class NewPattern {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    if (i == 0 && j == 0) {
                        System.out.print("5");
                    } else if (i == 0 && j == 2) {
                        System.out.print("2");
                    } else if (i == 0 && j == 4) {
                        System.out.print("1");
                    } else if (i == 1 && j == 1) {
                        System.out.print("4");
                    } else if (i == 1 && j == 3) {
                        System.out.print("2");
                    } else if (i == 2 && j == 0) {
                        System.out.print("3");
                    } else if (i == 2 && j == 2) {
                        System.out.print("3");
                    } else if (i == 2 && j == 4) {
                        System.out.print("5");
                    } else if (i == 3 && j == 1) {
                        System.out.print("2");
                    } else if (i == 3 && j == 3) {
                        System.out.print("4");
                    } else if (i == 4 && j == 0) {
                        System.out.print("1");
                    } else if (i == 4 && j == 2) {
                        System.out.print("7");
                    } else if (i == 4 && j == 4) {
                        System.out.print("5");
                    } else {
                        System.out.print(" ");
                    } 
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
