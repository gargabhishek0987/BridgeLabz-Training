import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InvoiceObjectCreation {

    
    static List<Invoice> invoices = new ArrayList<>();
    static class Invoice {
        int transactionId;

        Invoice(int transactionId) {
            this.transactionId = transactionId;
        }

        void showInvoice() {
            System.out.println("Invoice created for Transaction ID" + transactionId);
        }
    }

    public static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(2001, 2002, 2003, 2004);
        transactionIds.forEach(InvoiceObjectCreation::createInvoice);

        for (Invoice invoice : invoices) {
            invoice.showInvoice();
        }
    }

    static void createInvoice(int id) {
        Invoice invoice = new Invoice(id);  
        invoices.add(invoice);
    }
}
