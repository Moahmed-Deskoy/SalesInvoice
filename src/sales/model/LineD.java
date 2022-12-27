
package sales.model;


public class LineD {
    
    private String itemName;
    private double price;
    private int count;
    private InvoiceD invoice;
    

    public LineD() {
    }

    public LineD( String itemName, double price, int count) {
        
        this.itemName = itemName;
        this.price = price;
        this.count = count;
    }

    public LineD( String itemName, double price, int count, InvoiceD invoice) {
      
        this.itemName = itemName;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }
    public double getLineTotal(){
    return price*count ;
    }
    

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

   

   

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InvoiceD getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceD invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "LineD{" +"num = " + invoice.getNumber() + "itemName=" + itemName + ", price=" + price + ", count=" + count + ", invoice=" + invoice + '}';
    }

     public String getAsCSV() {
        return invoice.getNumber() + "," + itemName + "," + price + "," + count;
    }
    
}
