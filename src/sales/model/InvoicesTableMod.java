package sales.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvoicesTableMod extends AbstractTableModel {

    private ArrayList<InvoiceD> invoices;
    private String[] cols = {"No.", "Date", "Customer", "Total"};

    public InvoicesTableMod(ArrayList<InvoiceD> invoices) {
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }
    @Override
    public String getColumnName(int column) {
        return cols[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
InvoiceD invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNumber();
            case 1: return invoice.getDate();
            case 2: return invoice.getCustomer();
            case 3: return invoice.getInvoiceTotal();
            default : return "";
    }
}}
