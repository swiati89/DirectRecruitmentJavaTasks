package service.product.impl;

import model.Attribute;
import model.AttributeGroup;
import service.product.Attributable;
import service.product.AttributePrinter;

public class AttributePrinterImpl implements AttributePrinter {

    private static final String ATTRIBUTE_LABEL = "*Single attribute ";

    private String tabFormat = "%1$-40s%n";


    public void printAttributes(AttributeGroup attributeGroup, int initLineTab) {
        String format = returnFormat(initLineTab);
        System.out.printf(format, "+-" + attributeGroup.getGroupName() + " begin-+");
        for(Attributable attributeOrList : attributeGroup.getAttributes()){
            if(attributeOrList instanceof Attribute){
                Attribute attribute = (Attribute) attributeOrList;
                printSingleAttributeData(attribute, format);
            } else if (attributeOrList instanceof AttributeGroup) {
                initLineTab++;
                AttributeGroup innerAttributeGroup = (AttributeGroup) attributeOrList;
                printAttributeGroup(innerAttributeGroup, initLineTab);
            }
        }
        System.out.printf(format, "+-" + attributeGroup.getGroupName() + " end-+");
    }

    private void printSingleAttributeData(Attribute attribute, String format) {
        System.out.printf("\t".concat(format),
                ATTRIBUTE_LABEL + attribute.getName() + " = " + attribute.getValue() + "*");
    }

    private void printAttributeGroup(AttributeGroup attributeGroup, int numOfTabs){
        printAttributes(attributeGroup,numOfTabs);
    }

    private String returnFormat (int numOfTabs){
        for(int i = 0; i<numOfTabs; i++){
            tabFormat = "\t".concat(tabFormat);
        }
        return tabFormat;

    }

}
