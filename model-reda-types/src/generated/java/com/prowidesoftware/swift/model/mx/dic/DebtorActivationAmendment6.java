
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
 * Specifies the amendment of the information that serves as a basis to debit an account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebtorActivationAmendment6", propOrder = {
    "dbtrActvtn",
    "elctrncInvcData"
})
public class DebtorActivationAmendment6 {

    @XmlElement(name = "DbtrActvtn")
    protected DebtorActivation6 dbtrActvtn;
    @XmlElement(name = "ElctrncInvcData")
    protected ElectronicInvoice1 elctrncInvcData;

    /**
     * Gets the value of the dbtrActvtn property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorActivation6 }
     *     
     */
    public DebtorActivation6 getDbtrActvtn() {
        return dbtrActvtn;
    }

    /**
     * Sets the value of the dbtrActvtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorActivation6 }
     *     
     */
    public DebtorActivationAmendment6 setDbtrActvtn(DebtorActivation6 value) {
        this.dbtrActvtn = value;
        return this;
    }

    /**
     * Gets the value of the elctrncInvcData property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicInvoice1 }
     *     
     */
    public ElectronicInvoice1 getElctrncInvcData() {
        return elctrncInvcData;
    }

    /**
     * Sets the value of the elctrncInvcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicInvoice1 }
     *     
     */
    public DebtorActivationAmendment6 setElctrncInvcData(ElectronicInvoice1 value) {
        this.elctrncInvcData = value;
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
