

package oopassignment;


public class Wine extends Product{

    private String zapremina;
    
    public Wine(String nazivProizvoda, String barKod, double cena, String zapremina){
        this.nazivProizvoda=nazivProizvoda;
        this.barKod=barKod;
        this.cena=cena;
        this.zapremina=zapremina;
    }
   
   

    @Override
    public double countPrice() {
        return  this.cena + this.cena * 0.30;
    }

    @Override
   public String toString(){
       
       StringBuilder out = new StringBuilder();
       out.append("Naziv proizvoda: ").append(this.nazivProizvoda).append("\n");
       out.append("Bar Kod: ").append(this.barKod).append("\n");
       out.append("Zapremina: ").append(this.zapremina).append("\n");
       out.append("Cena: ").append(countPrice()).append("\n");
       out.append("Porez: ").append(PDV+10+" %").append("\n");
       
       return out.toString();
       
   }


   
    
}
