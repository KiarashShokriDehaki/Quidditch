package com.company;





    public class Match {

        Tm tm1 = new Tm();

        Tm tm2 = new Tm();

        public void shor(){

            for(int i=0 ; i<100;i++){
                tm1.play();
                tm2.play();
            }

            if(tm1.gl>tm2.gl){
                System.out.println("team 1 wins");
            }
            else if (tm1.gl<tm2.gl){

                System.out.println("team 2 wins");
            }
            else {
                System.out.println("draw");
            }

            System.out.println("team 2 : " + tm2.gl);
            System.out.println("team 1 :" + tm1.gl);

        }
    }


