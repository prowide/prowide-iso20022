
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
 * Instrument that has or represents monetary value and is used to process a payment instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument8", propOrder = {
    "sttlmCcy",
    "cshAcctDtls",
    "pmtCardDtls",
    "drctDbtDtls",
    "chq",
    "bkrsDrft"
})
public class PaymentInstrument8 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "CshAcctDtls")
    protected List<CashAccount4> cshAcctDtls;
    @XmlElement(name = "PmtCardDtls")
    protected PaymentCard2 pmtCardDtls;
    @XmlElement(name = "DrctDbtDtls")
    protected DirectDebitMandate4 drctDbtDtls;
    @XmlElement(name = "Chq")
    protected Boolean chq;
    @XmlElement(name = "BkrsDrft")
    protected Boolean bkrsDrft;

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstrument8 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshAcctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount4 }
     * 
     * 
     * @return
     *     The value of the cshAcctDtls property.
     */
    public List<CashAccount4> getCshAcctDtls() {
        if (cshAcctDtls == null) {
            cshAcctDtls = new ArrayList<>();
        }
        return this.cshAcctDtls;
    }

    /**
     * Gets the value of the pmtCardDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard2 }
     *     
     */
    public PaymentCard2 getPmtCardDtls() {
        return pmtCardDtls;
    }

    /**
     * Sets the value of the pmtCardDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard2 }
     *     
     */
    public PaymentInstrument8 setPmtCardDtls(PaymentCard2 value) {
        this.pmtCardDtls = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandate4 }
     *     
     */
    public DirectDebitMandate4 getDrctDbtDtls() {
        return drctDbtDtls;
    }

    /**
     * Sets the value of the drctDbtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandate4 }
     *     
     */
    public PaymentInstrument8 setDrctDbtDtls(DirectDebitMandate4 value) {
        this.drctDbtDtls = value;
        return this;
    }

    /**
     * Gets the value of the chq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChq() {
        return chq;
    }

    /**
     * Sets the value of the chq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentInstrument8 setChq(Boolean value) {
        this.chq = value;
        return this;
    }

    /**
     * Gets the value of the bkrsDrft property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBkrsDrft() {
        return bkrsDrft;
    }

    /**
     * Sets the value of the bkrsDrft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentInstrument8 setBkrsDrft(Boolean value) {
        this.bkrsDrft = value;
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
     * Adds a new item to the cshAcctDtls list.
     * @see #getCshAcctDtls()
     * 
     */
    public PaymentInstrument8 addCshAcctDtls(CashAccount4 cshAcctDtls) {
        getCshAcctDtls().add(cshAcctDtls);
        return this;
    }

}
