public class arrays{
    public static void main(String[] args) {
        int[][] arr = new int[10][];
       arr[0] = new int[10];
       arr[1] = new int[2];

       try{
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        catch(Exception e){
            System.out.println("Exception has occured");
        }


    }
}