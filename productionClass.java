product.java

package product;

public class productionClass {
   private int SerialNumber;
   private String name;

   public product(int SerialNumber, String name) {
       this.SerialNumber = SerialNumber;
       this.name = name;
   }

   public int getSerialNumber() {
       return SerialNumber;
   }

   public void setSerialNumber(int serialNumber) {
       this.serialNumber = serialNumber;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

Pc.java

package product;

public class Pc {
   private String graphicCard;
   private int ramCapacity;
   
   public Pc(String graphicCard, String isbn, int ramCapacity) {
       this.graphicCard = graphicCard;
       this.ramCapacity = ramCapacity;
   }

   public String getgraphicCard() {
       return graphicCard;
   }

   public void setgraphicCard(String graphicCard) {
       this.graphicCard = graphicCard;
   }

   public int getramCapacitys() {
       return ramCapacity;
   }

   public void setramCapacitys(int ramCapacity) {
       this.ramCapacity = ramCapacity;
   }
}

Phone.java

package product;

public class Phone {
   private int cameraResolution ;
   private String Brand;

   public Phone(int  cameraResolution, String Brand) {
       this.cameraResolution = cameraResolution;
       this.Brand = Brand;
   }

   public int cameraResolution() {
       return cameraResolution;
   }

   public void cameraResolution(int  cameraResolution) {
       this.cameraResolution = cameraResolution;
   }

   public String getBrand() {
       return Brand;
   }

   public void setBrandr(String Brand) {
       this.Brand = Brand;
       }
   }
}