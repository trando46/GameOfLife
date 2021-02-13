class RandomGenerator{
    private int num;

    public RandomGenerator(int min, int max){
        Random random = new Random();
        num = min + random.nextInt(max-min+1);
    }
    public void setNum(int min, int max){
        Random random = new Random();
        num = min + random.nextInt(max-min+1);
    }
    public int getNum(){return num;}
}