package testutil;

import model.Attribute;
import model.AttributeGroup;
import model.Product;
import service.product.Attributable;

import java.util.ArrayList;
import java.util.List;

public class ProductTestUtil {
    public static Product prepareProductForTest(){
        Attribute attributeHeight = new Attribute("height", "24");
        Attribute attributeLength = new Attribute("length", "58");
        Attribute attributeName = new Attribute("name", "Janusz");
        Attribute attributeSurname = new Attribute("surname", "Soft");
        Attribute attributeColor = new Attribute("color", "blue");
        Attribute attributeShape = new Attribute("shape", "rectangular");

        List<Attributable> firstAttList = new ArrayList<Attributable>();
        firstAttList.add(attributeHeight);
        firstAttList.add(attributeLength);

        List<Attributable> secondAttList = new ArrayList<Attributable>();
        secondAttList.add(attributeName);
        secondAttList.add(attributeSurname);

        List<Attributable> thirdAttList = new ArrayList<Attributable>();
        thirdAttList.add(attributeShape);

        AttributeGroup attrGr1 = new AttributeGroup("group1",firstAttList);
        AttributeGroup attrGr2 = new AttributeGroup("group2",secondAttList);
        AttributeGroup attrGr3 = new AttributeGroup("group3", thirdAttList);
        attrGr2.addAttributeToAttributes(attrGr3);
        attrGr1.addAttributeToAttributes(attrGr2);
        attrGr2.addAttributeToAttributes(attributeColor);

        return new Product(attrGr1);
    }
}
