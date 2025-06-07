
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "NonFinancialRequestContentComponent2", propOrder = {
    "nonFinReqTp",
    "tx"
})
public class NonFinancialRequestContentComponent2 {

    @XmlElement(name = "NonFinReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected List<NonFinancialRequestType1Code> nonFinReqTp;
    @XmlElement(name = "Tx")
    protected CardPaymentTransaction119 tx;

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
     *     {@link CardPaymentTransaction119 }
     *     
     */
    public CardPaymentTransaction119 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction119 }
     *     
     */
    public NonFinancialRequestContentComponent2 setTx(CardPaymentTransaction119 value) {
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
    public NonFinancialRequestContentComponent2 addNonFinReqTp(NonFinancialRequestType1Code nonFinReqTp) {
        getNonFinReqTp().add(nonFinReqTp);
        return this;
    }

}
