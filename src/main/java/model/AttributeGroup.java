package model;

import service.product.Attributable;

import java.util.List;

public class AttributeGroup implements Attributable {
    private String groupName;
    private List<Attributable> attributes;

    public AttributeGroup(String groupName, List<Attributable> attributes){
        this.groupName = groupName;
        this.attributes = attributes;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Attributable> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributable> attributes) {
        this.attributes = attributes;
    }

    public void addAttributeToAttributes(Attributable attributable){
        this.attributes.add(attributable);
    }

    @Override
    public String toString() {
        return "AttributeGroup{" +
                "groupName='" + groupName + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
