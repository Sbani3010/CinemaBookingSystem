package za.ac.cput.factory;
 /*
SnackFactory.java
Snack factory class.
Luphiwe Sikupela(216060133)
04/April/2023
 */


import za.ac.cput.domain.Snack;
import za.ac.cput.util.Helper;

public class SnackFactory {
        public static Snack createSnack(String price, String name){
            if(Helper.isNullOrEmpty(price) || Helper.isNullOrEmpty(name))
                return null;
            return new Snack.Builder().setPrice(price)
                    .setName(name)
                    .setId(Helper.generateId()).build();
        }
    }

