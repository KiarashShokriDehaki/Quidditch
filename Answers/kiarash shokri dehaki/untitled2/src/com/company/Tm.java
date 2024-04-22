package com.company;

public class Tm {




        Keep Keep1 = new Keep();

        Seek se1 = new Seek();

        Cheas ch1 =new Cheas();
        Cheas ch2 =new Cheas();
        Cheas ch3  =new Cheas();
        Beat be1 = new Beat();
        Beat be2 = new Beat();

        int gl = 0 ;

        private void sgl(){this.gl++;}

        public void play (){
            if(Keep1.issuc() == 1){

                sgl();
            }
            if(be1.issuc() + be2.issuc() >= 1) {
                sgl();
            }

            if(ch1.issuc() + ch2.issuc() + ch3.issuc() >= 2){
                sgl();
            }
        }



    }





