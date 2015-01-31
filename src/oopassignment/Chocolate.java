

package oopassignment;


public class Chocolate extends Product{
    private String tezina;

    public Chocolate(String nazivProizvoda, String barKod, double cena, String tezina){
          this.nazivProizvoda=nazivProizvoda;
          this.barKod=barKod;
          this.cena = cena;
          this.tezina=tezina;
    }
    

    @Override
    public double countPrice() {
        
        return this.cena + this.cena*0.20;
    }
 
    @Override
   public String toString(){
       
       StringBuilder out = new StringBuilder();
       out.append("Naziv proizvoda: ").append(this.nazivProizvoda).append("\n");
       out.append("Bar Kod: ").append(this.barKod).append("\n");
       out.append("Tezina: ").append(this.tezina).append("\n");
       out.append("Cena: ").append(countPrice()).append("\n");
       out.append("Porez: ").append(PDV+" %").append("\n");
       
       return out.toString();
       
   }

   
   
    
}
