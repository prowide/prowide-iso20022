
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
 * Specifies the path and data elements requested in the investigation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAmendment1", propOrder = {
    "pth",
    "rcrd"
})
public class TransactionAmendment1 {

    @XmlElement(name = "Pth")
    protected String pth;
    @XmlElement(name = "Rcrd", required = true)
    protected TransactionAmendment1Choice rcrd;

    /**
     * Gets the value of the pth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPth() {
        return pth;
    }

    /**
     * Sets the value of the pth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionAmendment1 setPth(String value) {
        this.pth = value;
        return this;
    }

    /**
     * Gets the value of the rcrd property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmendment1Choice }
     *     
     */
    public TransactionAmendment1Choice getRcrd() {
        return rcrd;
    }

    /**
     * Sets the value of the rcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmendment1Choice }
     *     
     */
    public TransactionAmendment1 setRcrd(TransactionAmendment1Choice value) {
        this.rcrd = value;
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
