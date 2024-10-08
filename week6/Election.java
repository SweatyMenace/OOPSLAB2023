import java.util.Scanner;

class Election {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] candidates = {'1', '2', '3', '4', '5'};
        int[] votes = {0, 0, 0, 0, 0};
        int vote_invalid=0, vote_valid=0;
        int flag = 1;
        do{
        System.out.println("Vote for the president: \n (1)\n (2)\n (3)\n (4)\n (5):\n or 6 to exit");
        int vote = scanner.nextInt();
        switch (vote) {
            case 1:
                votes[0]++; 
                vote_valid++;
                break;
            case 2:
                votes[1]++;
                vote_valid++;
                break;
            case 3:
                votes[2]++;
                vote_valid++;
                break;
            case 4:
                votes[3]++;
                vote_valid++;
                break;
            case 5:
                votes[4]++;
                vote_valid++;
                break;
            case 6: 
                flag=0; 
                break; 
            default:
                System.out.println("Invalid input"); 
                vote_invalid++;
                break;
        }} while(flag == 1);

        double max = votes[0];
        int index = 0;
        for(int i=0; i < votes.length; i++){
            if(votes[i]>max)
            {
                max = votes[i];
                index=i;
            }
        }
        System.out.println("The winner is " + candidates[index] + " with a total of " + votes[index] + " votes.");
        System.out.println("Number of votes casted:  " + vote_valid);
        scanner.close();
    }
}
