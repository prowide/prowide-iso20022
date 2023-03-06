
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Aim of the non financial request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonFinancialRequestContentComponent1", propOrder = {
    "nonFinReqTp",
    "tx"
})
public class NonFinancialRequestContentComponent1 {

    @XmlElement(name = "NonFinReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected List<NonFinancialRequestType1Code> nonFinReqTp;
    @XmlElement(name = "Tx")
    protected CardPaymentTransaction107 tx;

    /**
     * Gets the value of the nonFinReqTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonFinReqTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonFinReqTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonFinancialRequestType1Code }
     * 
     * 
     */
    public List<NonFinancialRequestType1Code> getNonFinReqTp() {
        if (nonFinReqTp == null) {
            nonFinReqTp = new ArrayList<NonFinancialRequestType1Code>();
        }
        return this.nonFinReqTp;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction107 }
     *     
     */
    public CardPaymentTransaction107 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction107 }
     *     
     */
    public NonFinancialRequestContentComponent1 setTx(CardPaymentTransaction107 value) {
        this.tx = value;
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

    /**
     * Adds a new item to the nonFinReqTp list.
     * @see #getNonFinReqTp()
     * 
     */
    public NonFinancialRequestContentComponent1 addNonFinReqTp(NonFinancialRequestType1Code nonFinReqTp) {
        getNonFinReqTp().add(nonFinReqTp);
        return this;
    }

}
