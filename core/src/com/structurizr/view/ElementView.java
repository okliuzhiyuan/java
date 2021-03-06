package com.structurizr.view;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.structurizr.model.Element;

public class ElementView {

    private Element element;
    private String id;

    ElementView() {
    }

    public ElementView(Element element) {
        this.element = element;
    }

    @JsonIgnore
    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public String getId() {
        if (element != null) {
            return element.getId();
        } else {
            return this.id;
        }
    }

    void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElementView that = (ElementView) o;

        if (!getId().equals(that.getId())) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public String toString() {
        return getElement().toString();
    }

}
