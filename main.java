class animal{
    void eat(){
        System.out.println("eating...animal class...eat method");
    }
}
class lion extends animal{
    void roar(){
        System.out.println("roar...loin class...roar method");
    }
}
class babylion extends lion{
    void weep(){
        System.out.println("weep...babyloin class...weep method");
    }
}
class main{
    public static void main(String args[]){
        babylion obj=new babylion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}