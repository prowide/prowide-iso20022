
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
@XmlType(name = "NonFinancialRequestContentComponent5", propOrder = {
    "nonFinReqTp",
    "tx",
    "addtlReq"
})
public class NonFinancialRequestContentComponent5 {

    @XmlElement(name = "NonFinReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected List<NonFinancialRequestType2Code> nonFinReqTp;
    @XmlElement(name = "Tx")
    protected CardPaymentTransaction139 tx;
    @XmlElement(name = "AddtlReq")
    protected List<ExternallyDefinedData5> addtlReq;

    /**
     * Gets the value of the nonFinReqTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nonFinReqTp property.
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
     * {@link NonFinancialRequestType2Code }
     * 
     * 
     * @return
     *     The value of the nonFinReqTp property.
     */
    public List<NonFinancialRequestType2Code> getNonFinReqTp() {
        if (nonFinReqTp == null) {
            nonFinReqTp = new ArrayList<>();
        }
        return this.nonFinReqTp;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction139 }
     *     
     */
    public CardPaymentTransaction139 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction139 }
     *     
     */
    public NonFinancialRequestContentComponent5 setTx(CardPaymentTransaction139 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the addtlReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternallyDefinedData5 }
     * 
     * 
     * @return
     *     The value of the addtlReq property.
     */
    public List<ExternallyDefinedData5> getAddtlReq() {
        if (addtlReq == null) {
            addtlReq = new ArrayList<>();
        }
        return this.addtlReq;
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
    public NonFinancialRequestContentComponent5 addNonFinReqTp(NonFinancialRequestType2Code nonFinReqTp) {
        getNonFinReqTp().add(nonFinReqTp);
        return this;
    }

    /**
     * Adds a new item to the addtlReq list.
     * @see #getAddtlReq()
     * 
     */
    public NonFinancialRequestContentComponent5 addAddtlReq(ExternallyDefinedData5 addtlReq) {
        getAddtlReq().add(addtlReq);
        return this;
    }

}
