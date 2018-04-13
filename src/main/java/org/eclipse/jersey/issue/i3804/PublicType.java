package org.eclipse.jersey.issue.i3804;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PublicType {
    private String name;
    private Long id;

    public PublicType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("PublicType{name='%s', id=%d}", name, id);
    }
}
