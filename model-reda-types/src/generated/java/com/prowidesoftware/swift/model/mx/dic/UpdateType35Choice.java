
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between action to request on a security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateType35Choice", propOrder = {
    "add",
    "del",
    "modfy"
})
public class UpdateType35Choice {

    @XmlElement(name = "Add")
    protected SecurityAttributes12 add;
    @XmlElement(name = "Del")
    protected SecurityAttributes12 del;
    @XmlElement(name = "Modfy")
    protected SecurityAttributes12 modfy;

    /**
     * Gets the value of the add property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public SecurityAttributes12 getAdd() {
        return add;
    }

    /**
     * Sets the value of the add property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public UpdateType35Choice setAdd(SecurityAttributes12 value) {
        this.add = value;
        return this;
    }

    /**
     * Gets the value of the del property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public SecurityAttributes12 getDel() {
        return del;
    }

    /**
     * Sets the value of the del property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public UpdateType35Choice setDel(SecurityAttributes12 value) {
        this.del = value;
        return this;
    }

    /**
     * Gets the value of the modfy property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public SecurityAttributes12 getModfy() {
        return modfy;
    }

    /**
     * Sets the value of the modfy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityAttributes12 }
     *     
     */
    public UpdateType35Choice setModfy(SecurityAttributes12 value) {
        this.modfy = value;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

}
