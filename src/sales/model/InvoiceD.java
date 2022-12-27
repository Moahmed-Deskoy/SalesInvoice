package sales.model;

import java.util.ArrayList;

public class InvoiceD {

    private int number;
    private String Date;
    private String Customer;
    private ArrayList<LineD> lines;

    public InvoiceD() {
    }

    public InvoiceD(int number, String Date, String Customer) {
        this.number = number;
        this.Date = Date;
        this.Customer = Customer;
    }

  public double getInvoiceTotal() {
        double total = 0.0;
        for (LineD line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    
    
 
    }

    public ArrayList<LineD> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();

        }
        return lines;
    }

    public void setLines(ArrayList<LineD> lines) {
        this.lines = lines;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "InvoiceD{" + "number=" + number + ", Date=" + Date + ", Customer=" + Customer + '}';
    }
    public String getAsCSV() {
        return number + "," + Date + "," + Customer;
    }

}
