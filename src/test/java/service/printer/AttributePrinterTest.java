package service.printer;

import model.Product;
import org.junit.Test;
import service.product.AttributePrinter;
import service.product.impl.AttributePrinterImpl;
import testutil.ProductTestUtil;


public class AttributePrinterTest {

    private final AttributePrinter attributePrinter= new AttributePrinterImpl();

    @Test
    public void printStructure(){
        Product product = ProductTestUtil.prepareProductForTest();
        attributePrinter.printAttributes(product.getAttributeGroup(), 0);
    }
}
