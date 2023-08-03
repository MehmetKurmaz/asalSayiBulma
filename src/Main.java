public class Main {
    public static void main(String[] args) {
        int i,x;
        boolean asalSayi;
      System.out.print("1-100'e kadar olan asal sayilar :");

      for ( i=2;i<100;i++){

          asalSayi=true;

          for ( x=2;x<i;x++){
              if (i%x==0) {
                  asalSayi = false;
                  break;
              }
          }
          if (asalSayi){
              System.out.print(i+" ");
          }
      }

    }


}