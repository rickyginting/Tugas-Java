class Burung extends Enemy{
    void walk(){
        System.out.println("Berjalan");
    }
    void jump(){
        System.out.println("Loncat");
    }
    void fly(){
        System.out.println("Terbang");
    }
    public static void main(String args[]){
      Burung garuda = new Burung();
      garuda.fly();
      Enemy serang = new Enemy();
      serang.attack();
    }

}
