public class Perulangan{
    public static void main(String[] args){
        String[] arr = {"Merah", "Hitam", "Putih", "Biru"};

        //cara manggil tanpa menggunakan perulangan
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        for (String i : arr){
            System.out.println(i);
        }
    }
}