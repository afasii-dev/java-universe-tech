import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String market = "1) AirPods\n2) Mac\n3) iPhone\n4) Apple Watch\n5) Accessories\n6)TV&Home\n7) iPad \n";
        System.out.println(market);
        while (true)
        {
            int apple = appleStore();
        }

    }
        private static int appleStore()
        {
            Scanner input = new Scanner(System.in);
            int appleStore = input.nextInt();
            System.out.println();
            if (appleStore <= 1)
            //Here AirPods
                {
                    System.out.println("1) AirPods2\n2) AirPods Pro\n3) Airpods3\n4)AirPods Max");
                    Scanner input2 = new Scanner(System.in);
                    int airPods = input.nextInt();
                    System.out.println();
                    if (airPods <= 1)
                    {
                        System.out.println("Price 149$");
                    }
                    else if (airPods <= 2)
                    {
                        System.out.println("Price 299$");
                    }
                    else if (airPods <= 3)
                    {
                        System.out.println("Price 399$");
                    }
                    else if (airPods >= 4);
                    else
                    {
                        System.out.println("Price 899$");
                    }
                }
            else if (appleStore <= 2)
            //Here Macs
                        {
                        System.out.println("1)MacBook Air\n2)MacBook Pro\n3)Mac mini\n4)Mac Studio\n5)Mac Pro");
                        Scanner input3 = new Scanner(System.in);
                        int mac = input.nextInt();
                        System.out.println();
                        if (mac <= 1)
                        {
                            System.out.println("Price 1599$");
                        }
                        else if (mac <= 2)
                        {
                            System.out.println("Price 2999$");
                        }
                        else if (mac <= 3)
                        {
                            System.out.println("Price 2199$");
                        }
                        else if (mac <= 4)
                        {
                            System.out.println("Price 3499$");
                        }
                        else if (mac >= 5);
                        else
                        {
                            System.out.println("Price 7899$");
                        }
                        }
            else if (appleStore <=3)
            //Here iPhone
                     {
                         System.out.println(" 1)iPhone SE\n 2)iPhone XR\n 3)iPhone 13\n 4)iPhone 13Pro mini\n 5)iPhone 13Pro\n 6)iPhone 13Pro Max");
                         Scanner input3 = new Scanner(System.in);
                         int iPhone = input.nextInt();
                         System.out.println();
                         if (iPhone <= 1)
                         {
                             System.out.println("Price 599$");
                         }
                         else if (iPhone <= 2)
                         {
                             System.out.println("Price 799$");
                         }
                        else if (iPhone <= 3)
                         {
                             System.out.println("Price 1199$");
                         }
                        else if (iPhone <= 4)
                         {
                             System.out.println("Price 1399$");
                         }
                        else if (iPhone <= 5)
                         {
                             System.out.println("Price 1999$");
                         }
                        else if (iPhone >= 6);
                        else
                        {
                            System.out.println("Price 2699$");
                        }


                     }
            else if (appleStore <= 4)
            //Here appleWatch;
            {
                System.out.println(" 1)Apple Watch 7\n 2)Apple Watch Hermes\n 3)Apple Watch SE\n 4)Apple Watch 3");
                Scanner input4 = new Scanner(System.in);
                int appleWatch = input.nextInt();
                System.out.println();
                if (appleWatch <= 1)
                {
                    System.out.println("Price 399");
                }
                else if (appleWatch <= 2)
                {
                    System.out.println("Price 699$");
                }
                else if (appleWatch <= 3)
                {
                    System.out.println("Price 599$");
                }
                else if (appleWatch >= 4);
                else
                {
                    System.out.println("Price 499$");
                }
            }
            else if (appleStore <= 5)
            //Here Apple Accessories
            {
                System.out.println(" 1)MagSafe\n 2)Apple Watch bands\n 3)Apple Case");
                Scanner input5 = new Scanner(System.in);
                int appleAccessories = input.nextInt();
                System.out.println();
                if (appleAccessories <= 1)
                {
                    System.out.println("Price 400$");
                }
                else if (appleAccessories <= 2)
                {
                    System.out.println("Price 99$");
                }
                else if (appleAccessories >= 4);
                else
                {
                    System.out.println("Price 199$");
                }

            }else if (appleStore <= 6)
            //Here Apple Home
            {
                System.out.println(" 1)Apple TV\n 2)HomePod mini");
                Scanner input6 = new Scanner(System.in);
                int appleTv = input.nextInt();
                System.out.println();
                if (appleTv <= 1)
                {
                    System.out.println("Price 149$");
                }
                else
                {
                    System.out.println("Price 639$");
                }
            }
            else
            //Here iPad
            {
                System.out.println(" 1)iPad mini\n 2)iPad Air\n 3)iPad Pro\n 4)iPad");
                Scanner input7 = new Scanner(System.in);
                int ipad = input.nextInt();
                System.out.println();
                if (ipad <= 1)
                {
                    System.out.println("Price 699$");
                }
                else if (ipad <= 2)
                {
                    System.out.println("Price 899$");
                }
                else if (ipad >= 5);
                else if (ipad <= 3)
                {
                    System.out.println("Price 1499$");
                }
                else
                {
                    System.out.println("Price 999$");
                }
            }
                return appleStore();
            }

    }
