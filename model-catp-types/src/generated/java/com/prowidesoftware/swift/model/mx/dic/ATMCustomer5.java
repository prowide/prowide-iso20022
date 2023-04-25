
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Customer involved in a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCustomer5", propOrder = {
    "prfl",
    "authntcnRslt"
})
public class ATMCustomer5 {

    @XmlElement(name = "Prfl")
    protected ATMCustomerProfile2 prfl;
    @XmlElement(name = "AuthntcnRslt")
    protected List<TransactionVerificationResult5> authntcnRslt;

    /**
     * Gets the value of the prfl property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomerProfile2 }
     *     
     */
    public ATMCustomerProfile2 getPrfl() {
        return prfl;
    }

    /**
     * Sets the value of the prfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomerProfile2 }
     *     
     */
    public ATMCustomer5 setPrfl(ATMCustomerProfile2 value) {
        this.prfl = value;
        return this;
    }

    /**
     * Gets the value of the authntcnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authntcnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult5 }
     * 
     * 
     * @return
     *     The value of the authntcnRslt property.
     */
    public List<TransactionVerificationResult5> getAuthntcnRslt() {
        if (authntcnRslt == null) {
            authntcnRslt = new ArrayList<>();
        }
        return this.authntcnRslt;
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

    /**
     * Adds a new item to the authntcnRslt list.
     * @see #getAuthntcnRslt()
     * 
     */
    public ATMCustomer5 addAuthntcnRslt(TransactionVerificationResult5 authntcnRslt) {
        getAuthntcnRslt().add(authntcnRslt);
        return this;
    }

}
