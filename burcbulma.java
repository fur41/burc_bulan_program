import java.time.Month;
import java.util.Scanner;

    public class burcbulma {
    
        public static void main(String[] args) {
        
            Scanner inp= new Scanner(System.in);

            int day , ay;

            System.out.print(" Gün giriniz :");
            
                day = inp.nextInt();

            System.out.print("Doğdunuz ayı giriniz :");

                ay=inp.nextInt();
                  switch (ay) {
                    case 01: if ((day<=31)&&(day>=1))
                    if (day<=21){System.out.println("Oğlak");
          }         else{System.out.println("Kova");}
        else{System.out.println("Hatalı veri girdiniz");}
                        
                        break;
                  
                    default:
                        break;}
                    switch (ay) {
                        case 02:
                        if ((day<=29)&&(day>=1))
                        if (day<=19){System.out.println("Kova");
              }         else{System.out.println("Balık");}
            else{System.out.print("Hatalı veri girdiniz");}
                            break;
                    
                        default:
                            break;
                    }
            switch (ay) {
                case 03: if ((day<=31)&&(day>=1))
                if (day<=20){System.out.println("Balık");
      }         else{System.out.println("Koç");}
    else{System.out.print("Hatalı veri girdiniz");}
                    
                    break;
            
                default:
                    break;
            }
                  
            switch (ay) {
                case 04: if ((day<=30)&&(day>=1))
                if (day<=20){System.out.println("Koç");
      }         else{System.out.println("Boğa");}
    else{System.out.println("Hatalı veri girdiniz");}
                    
                    break;
            
                default:
                    break;
            }     
                switch (ay) {
                    case 05: if ((day<=31)&&(day>=1))
                    if (day<=21){System.out.println("Boğa");
          }         else{System.out.println("İkizler");}
        else{System.out.print("Hatalı veri girdiniz");}
                        
                        break;
                
                    default:
                        break;
                }
       switch (ay) {
        case 06: if ((day<=30)&&(day>=1))
        if (day<=22){System.out.println("İkizler");
}         else{System.out.println("Yengeç");}
else{System.out.println("Hatalı veri girdiniz");}
            
            break;
       
        default:
            break;
       }

        switch (ay) {
            case 07: if ((day<=31)&&(day>=1))
            if (day<=22){System.out.println("Yengeç");
  }         else{System.out.println("Aslan");}
else{System.out.print("Hatalı veri girdiniz");}
                
                break;
        
            default:
                break;
        }               
                
        switch (ay) {
            case 8: if ((day<=31)&&(day>=1))
            if (day<=22){System.out.println("Aslan");
  }         else{System.out.println("Başak");}
else{System.out.println("Hatalı veri girdiniz");}
                
                break;
        
            default:
                break;
        }

        switch (ay) {
            case 9: if ((day<=30)&&(day>=1))
            if (day<=22){System.out.println("Başak");
  }         else{System.out.println("Terazi");}
else{System.out.println("Hatalı veri girdiniz");}
                
                break;
        
            default:
                break;
        }
        switch (ay) {
            case 10: if ((day<=31)&&(day>=1))
            if (day<=22){System.out.println("Terazi");
  }         else{System.out.println("Akrep");}
else{System.out.println("Hatalı veri girdiniz");}
                
                break;
        
            default:
                break;
        }
        
        switch (ay) {
            case 11: if ((day<=30)&&(day>=1))
            if (day<=21){System.out.println("Akrep");
  }         else{System.out.println("Yay");}
else{System.out.println("Hatalı veri girdiniz");}
                
                break;
        
            default:
                break;
        }
        
        switch (ay) {
            case 12: if ((day<=31)&&(day>=1))
            if (day<=21){System.out.println("Yay");
  }         else{System.out.println("Oğlak");}
else{System.out.println("Hatalı veri girdiniz");}
                
                break;
        
            default:
                break;
        }
   
    }
}
