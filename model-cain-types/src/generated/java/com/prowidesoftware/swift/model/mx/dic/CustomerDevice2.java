
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the customer device.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDevice2", propOrder = {
    "dvc",
    "id",
    "prvdr"
})
public class CustomerDevice2 {

    @XmlElement(name = "Dvc")
    protected Device1 dvc;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Prvdr")
    protected String prvdr;

    /**
     * Gets the value of the dvc property.
     * 
     * @return
     *     possible object is
     *     {@link Device1 }
     *     
     */
    public Device1 getDvc() {
        return dvc;
    }

    /**
     * Sets the value of the dvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Device1 }
     *     
     */
    public CustomerDevice2 setDvc(Device1 value) {
        this.dvc = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerDevice2 setPrvdr(String value) {
        this.prvdr = value;
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
