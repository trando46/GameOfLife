class Player{
    private String name;
    private double money;
    private int age;
    private int hand21; 
    private String status;

    public Player(){
        name = "";
        money = 0;
        age = 0;
        hand21 = 0;
        status = "alive";
    }
    public Player(String n){
        name = n;
        money = 0;
        age = 0;
        hand21 = 0;
        status = "alive";
    }
    public void setName(String n){name = n;}
    public void setMoney(double m){money = m;}
    public void addMoney(double m){money+=m;}
    public void subtractMoney(double m){//debt?
        if (m>money){money=0;}
        else{money-=m;}
    }
    public void addAge(int a){
        int tmp = age+a;
        if (tmp>100){age=100;}
        else {age+=a;}
    }
    public void subtractAge(int a){
        int tmp = age-a;
        if (tmp<0){age=0;}
        else {age-=a;}
    }
    public void setHand21(int num){hand21=num;}
    public void addHand21(int num){hand21+=num;}
    public void setStatus(String s){status=s;}
    public String getName(){return name;}
    public double getMoney(){return money;}
    public int getAge(){return age;}
    public int getHand21(){return hand21;}
    public String getStatus(){return status;}
}