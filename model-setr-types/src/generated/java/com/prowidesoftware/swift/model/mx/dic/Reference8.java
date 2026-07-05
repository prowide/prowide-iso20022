
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
 * Additional references linked to the order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference8", propOrder = {
    "qtId",
    "ioiId",
    "refOrdrId"
})
public class Reference8 {

    @XmlElement(name = "QtId")
    protected String qtId;
    @XmlElement(name = "IOIId")
    protected String ioiId;
    @XmlElement(name = "RefOrdrId")
    protected String refOrdrId;

    /**
     * Gets the value of the qtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtId() {
        return qtId;
    }

    /**
     * Sets the value of the qtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference8 setQtId(String value) {
        this.qtId = value;
        return this;
    }

    /**
     * Gets the value of the ioiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIOIId() {
        return ioiId;
    }

    /**
     * Sets the value of the ioiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference8 setIOIId(String value) {
        this.ioiId = value;
        return this;
    }

    /**
     * Gets the value of the refOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefOrdrId() {
        return refOrdrId;
    }

    /**
     * Sets the value of the refOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference8 setRefOrdrId(String value) {
        this.refOrdrId = value;
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
