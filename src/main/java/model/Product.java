package model;

public class Product {
    private AttributeGroup attributeGroup;

    public Product(AttributeGroup attributeGroup) {
        this.attributeGroup = attributeGroup;
    }

    public AttributeGroup getAttributeGroup() {
        return attributeGroup;
    }

    public void setAttributeGroup(AttributeGroup attributeGroup) {
        this.attributeGroup = attributeGroup;
    }

    @Override
    public String toString() {
        return "Product{" +
                "attributeGroup=" + attributeGroup +
                '}';
    }
}
