import java.util.Scanner;
public class CarbonFootprintCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /** Calculate Your Carbon Footprint 
           Get Started */       
        System.out.println("\t  -------------- \t");
        System.out.println("\t |  Get Started | \t");
        System.out.println("\t  -------------- \t");
        System.out.println("\t  \t");
        System.out.println("\t START WITH A QUICK CARBON FOOTPRINT ESTIMATE \t");
        System.out.println("\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \t");
        //System.out.println("\t  \t");
        System.out.print("  Zipcode : ");
        int zip = sc.nextInt();
        System.out.print("  State : ");
        String st = sc.next();
        System.out.print("  City : ");
        String cit = sc.next();
        System.out.print("  Country : ");
        String cou = sc.next();
        System.out.println("\tQ1. How many people live in your household?\t");
        System.out.println("\t1.\t\n\t2.\t\n\t3.\t\n\t4.\t\n\t5.\t\n\t6.More than 5\t");
        System.out.print("\t People in your household : \t");
        int ppl = sc.nextInt();
        System.out.println("\tQ2. What is your approximate gross annual household income?\t");
        System.out.println("\t1. less than 10k\t\n\t2. 10k\t\n\t3. 30k\t\n\t4. 50k\t\n\t5. 80k\t");
        System.out.println("\t6. More than 120k\t");
        System.out.print("\t Approximate gross annual household income : \t");
        int inc = sc.nextInt();
         /** TRAVEL */
         System.out.println("\t  \t");
         System.out.println("\t  -------- \t");
        System.out.println("\t | Travel | \t");
        System.out.println("\t  -------- \t");
         System.out.println("\t HOW DO YOU GET AROUND? \t");
         System.out.println("\t ~~~~~~~~~~~~~~~~~~~~~~ \t");
         /** Personal */
          System.out.println("\t Enter No Of Vehicles You Own : \t");
          int veh = sc.nextInt();
          double mileage[]=new double[veh];
          for(int i=0;i<veh;i++)
          {System.out.print("\t Mileage of Vehicle "+(i+1)+" : \t");
            mileage[i]=sc.nextDouble();}
        /** Public Transport */
          System.out.print("\tDistance Travelled by Public Transport: \t");
            double km=sc.nextDouble();
        /** Air Travel */
        System.out.print("\tMiles of Air Travel : \t");
        double miles=sc.nextDouble();
            /** HOME */
        System.out.println("\t  \t");
        System.out.println("\t  ------ \t");
        System.out.println("\t | Home | \t");
        System.out.println("\t  ------ \t");
         System.out.println("\t HOW MUCH DO YOU USE IN YOUR HOME? \t");
         System.out.println("\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \t");
        /** Electricity */
        System.out.println("\t Electricity (in ₹/yr): \t");
        System.out.println("\t1. 0\t\n\t2. 20\t\n\t3. 40\t\n\t4. 60\t\n\t5. 80\t\n\t6. 100\t");
        int elec = sc.nextInt();
        /** Natural Gas */
        System.out.print("\t Natural Gas (in ₹/yr): \t");
        double ng=sc.nextDouble();        
        /** Heating Oil & Other Fuels */
        System.out.print("\t Heating Oil & Other Fuels (in ₹/yr): \t");
        double fuel=sc.nextDouble(); 
        /** Square ft. of living space */
        System.out.print("\t Square ft. of living space : \t");
        double area=sc.nextDouble(); 
        /** Water Usage */
        System.out.println("\t Water Usage : \t");
        System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
        int wtr=sc.nextInt();
        
        /** FOOD */
        System.out.println("\t  \t");
        System.out.println("\t  ------ \t");
        System.out.println("\t | Food | \t");
        System.out.println("\t  ------ \t");
        System.out.println("\t HOW MUCH DO YOU CONSUME OF EACH OF THE FOLLOWING? \t");
        System.out.println("\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \t");
        System.out.print("\t Enter your choice :\t\n\t1. Simple\t\n\t2. Advanced\t");
        int ch=sc.nextInt();
        System.out.println("\t Grains & baked goods(Daily calories per person) :\t");
        System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
        int grain=sc.nextInt();
        System.out.println("\t Dairy(Daily calories per person) :\t");
        System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
        int dairy=sc.nextInt();
        System.out.println("\t Fruits & vegetables(Daily calories per person) :\t");
        System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
        int fruitVeg=sc.nextInt();
        System.out.println("\t Snacks, drinks, etc...(Daily calories per person) :\t");
        System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
        int snax=sc.nextInt();
        switch(ch)
        {case 1:
            System.out.println("\t Enter Meat, fish, eggs(Daily calories per person) :\t");
            System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
            int meat=sc.nextInt();
            break;
         case 2:
             System.out.println("\t Enter Beef, pork, lamb, veal(Daily calories per person) :\t");
            System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
            int beefPork=sc.nextInt();
            System.out.println("\t Enter Fish & seafood(Daily calories per person) :\t");
            System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
            int fish=sc.nextInt();
            System.out.println("\t Enter Other meat (processed, nuts, etc...)(Daily calories per person) :\t");
            System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
            int other=sc.nextInt();
            System.out.println("\t Enter Poultry & eggs(Daily calories per person) :\t");
            System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
            int egg=sc.nextInt();
             break;
         default:
             System.out.println("Invalid Choice");
    
        }
        /** SHOPPING */
        System.out.println("\t  ---------- \t");
        System.out.println("\t | Shopping | \t");
        System.out.println("\t  ---------- \t");
        System.out.println("\t HOW MUCH DO YOU SPEND ON EACH OF THE FOLLOWING? \t");
        System.out.println("\t ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ \t");
        System.out.print("\t Enter your choice :\t\n\t1. Simple\t\n\t2. Advanced\t");
        ch=sc.nextInt();
        switch(ch)
        {case 1:
            System.out.println("\t Enter Goods(₹/month) :\t");
            System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
            int goods=sc.nextInt();
            System.out.println("\t Enter Services(₹/month) :\t");
            System.out.println("\t1. 0\t\n\t2. 1x\t\n\t3. 2x\t\n\t4. 3x\t\n\t5. 4x\t\n\t6. 5x\t");
            int service=sc.nextInt();
            break;
         case 2:
            System.out.println("\t Enter Furniture & appliances(₹/month) :\t");
            double furn=sc.nextDouble(); 
            System.out.println("\t Enter Clothing(₹/month) :\t");
            double cloth=sc.nextDouble();  
            System.out.println("\t Enter Entertainment(₹/month) :\t");
            double enter=sc.nextDouble(); 
            System.out.println("\t Enter Paper, office, & reading(₹/month) :\t");
            double paper=sc.nextDouble(); 
            System.out.println("\t Enter Personal care & cleaning(₹/month) :\t");
            double care=sc.nextDouble(); 
            System.out.println("\t Enter Auto parts(₹/month) :\t");
            double auto=sc.nextDouble();
            System.out.println("\t Enter Medical(₹/month) :\t");
            double med=sc.nextDouble();
            System.out.println("\t Enter Health Care(₹/month) :\t");
            double hcare=sc.nextDouble(); 
            System.out.println("\t Enter Information & Communication(₹/month) :\t");
            double info=sc.nextDouble();
            System.out.println("\t Enter Vehicle services(₹/month) :\t");
            double vehcle=sc.nextDouble();
            System.out.println("\t Enter Personal business & finance(₹/month) :\t");
            double pers=sc.nextDouble();
            System.out.println("\t Enter Household maintenance & repair(₹/month) :\t");
            double house=sc.nextDouble(); 
            System.out.println("\t Enter Organizations & Charity(₹/month) :\t");
            double charity=sc.nextDouble();
            System.out.println("\t Enter Other services(₹/month) :\t");
            double other=sc.nextDouble();
            break;
         default:
             System.out.println("Invalid Choice");
    
        }
        /** Your Carbon Footprint */  
        System.out.println("\t  ---------------- \t");
        System.out.println("\t | Your Footprint | \t");
        System.out.println("\t  ---------------- \t");
        System.out.println("Your Carbon Footprint");
         /** Take Action REDUCE YOUR IMPACT */ 
        System.out.println("\t  ------------- \t");
        System.out.println("\t | Take Action | \t");
        System.out.println("\t  ------------- \t");
        System.out.println("\t REDUCE YOUR IMPACT \t");
        System.out.println("\t ~~~~~~~~~~~~~~~~~~ \t");
        System.out.println("\tFor Transportation :\t");
        System.out.println("\t1. More efficient vehicle\t");
        System.out.println("\t2. Purchase alternative fuel vehicle \t");
        System.out.println("\t3. Purchase electric vehicle \t");
        System.out.println("\t4. Purchase hybrid vehicle \t");
        System.out.println("\t5. Telecommute to work \t");
        System.out.println("\t6. Ride my bike \t");
        System.out.println("\t7. Take public transportation \t");
        System.out.println("\t8. Practice eco driving \t");
        System.out.println("\t9. Maintain \t");
        System.out.println("\t10. Carpool to work \t");
        System.out.println("\t11. Reduce air travel \t");
        System.out.println("\tFor Housing :\t");
        System.out.println("\t1. Switch to CFLs\t");
        System.out.println("\t2. Turn off lights \t");
        System.out.println("\t3. Switch form T12 Lights to T8 Lights \t");
        System.out.println("\t4. Purchase tankless water heater \t");
        System.out.println("\t5. Reduce winter household thermostat \t");
        System.out.println("\t6. Replace refrigerator with Energy Star refrigerator \t");
       
    }
}
