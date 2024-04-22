public class Match {

    Team tm1 = new Team();

    Team tm2 = new Team();

    public void start(){

        for(int i=0 ; i<100;i++){
            tm1.play();
            tm2.play();
        }

        if(){
            System.out.println("team 1 wins")
        }
        else if (tm1.gl<tm2.gl){

            System.out.println("team 2 wins")
        }
        else {
            System.out.println("draw")
        }

        System.out.println("team 2 : " + tm2.gl);
        System.out.println("team 1 :" + tm1.gl);

    }
}


