package com.company;
import java.util.Random;

    public class Keep extends Plar implements Suc{


        public int issuc() {
            Random a = new Random();
            int x = a.nextInt(100)+1;
            int nati = x <= 70 ? 1 : 0;
            return nati;
        }
    }


