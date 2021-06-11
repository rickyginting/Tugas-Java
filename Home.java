class Home extends Info{
    void content(){
        System.out.println("===================");
        System.out.println("Total Kasus : 45029");
        System.out.println("Sembuh : 17883");
        System.out.println("Meninggal : 2429");
        System.out.println("Dirawat : 24717");
        System.out.println("===================");
    }

     public static void main(String args[]){
         Info a = new Info();
         a.title();
         Home total = new Home();
         total.content();
         Info b = new Info();
         b.versi();
     }
}