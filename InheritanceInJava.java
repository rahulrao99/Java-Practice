class Phone{
    private int number;
    Phone(){
        
    }
    
    void setNumber(int number){
        this.number=number;
    }
    
    int getNumber(){
        return number;
    }
    public void call(){
        System.out.println("call is made");
    }
    
    public void message(){
        System.out.println("message is sent");
    }
}

class SmartPhone extends Phone {
    int cameraMegaPX;
    
    public void click(){
        System.out.println("A photo was clicked");
    }
    
    public void playMusic(){
        System.out.println("Music Startde Playing");
    }
    
    public void pauseMusic(){
        System.out.println("Music Paused");
    }
    
    public void stopMusic(){
        System.out.println("Music Stopped");
    }
}

class Main{
    public static void main(String args[]){
        SmartPhone p1=new SmartPhone();
        p1.setNumber(99220728);
        System.out.println("Phone number is:" +p1.getNumber());
        p1.call();
        p1.playMusic();
    }
}
