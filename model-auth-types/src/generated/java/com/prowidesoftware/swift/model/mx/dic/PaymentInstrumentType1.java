
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
 * Identifies a payment instrument type as the search criteria for the financial institution to do the investigation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrumentType1", propOrder = {
    "cardNb",
    "authrtyReqTp",
    "addtlInf"
})
public class PaymentInstrumentType1 {

    @XmlElement(name = "CardNb", required = true)
    protected String cardNb;
    @XmlElement(name = "AuthrtyReqTp", required = true)
    protected List<AuthorityRequestType1> authrtyReqTp;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the cardNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNb() {
        return cardNb;
    }

    /**
     * Sets the value of the cardNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstrumentType1 setCardNb(String value) {
        this.cardNb = value;
        return this;
    }

    /**
     * Gets the value of the authrtyReqTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authrtyReqTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthrtyReqTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityRequestType1 }
     * 
     * 
     */
    public List<AuthorityRequestType1> getAuthrtyReqTp() {
        if (authrtyReqTp == null) {
            authrtyReqTp = new ArrayList<AuthorityRequestType1>();
        }
        return this.authrtyReqTp;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstrumentType1 setAddtlInf(String value) {
        this.addtlInf = value;
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
     * Adds a new item to the authrtyReqTp list.
     * @see #getAuthrtyReqTp()
     * 
     */
    public PaymentInstrumentType1 addAuthrtyReqTp(AuthorityRequestType1 authrtyReqTp) {
        getAuthrtyReqTp().add(authrtyReqTp);
        return this;
    }

}
