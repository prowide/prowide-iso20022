
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of payment instruments.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument17Choice", propOrder = {
    "cshAcctDtls",
    "pmtCardDtls",
    "drctDbtDtls",
    "chq",
    "bkrsDrft"
})
public class PaymentInstrument17Choice {

    @XmlElement(name = "CshAcctDtls")
    protected List<CashAccount26> cshAcctDtls;
    @XmlElement(name = "PmtCardDtls")
    protected PaymentCard2 pmtCardDtls;
    @XmlElement(name = "DrctDbtDtls")
    protected DirectDebitMandate4 drctDbtDtls;
    @XmlElement(name = "Chq")
    protected Boolean chq;
    @XmlElement(name = "BkrsDrft")
    protected Boolean bkrsDrft;

    /**
     * Gets the value of the cshAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshAcctDtls property.
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
     * {@link CashAccount26 }
     * 
     * 
     */
    public List<CashAccount26> getCshAcctDtls() {
        if (cshAcctDtls == null) {
            cshAcctDtls = new ArrayList<CashAccount26>();
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
    public PaymentInstrument17Choice setPmtCardDtls(PaymentCard2 value) {
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
    public PaymentInstrument17Choice setDrctDbtDtls(DirectDebitMandate4 value) {
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
    public PaymentInstrument17Choice setChq(Boolean value) {
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
    public PaymentInstrument17Choice setBkrsDrft(Boolean value) {
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
    public PaymentInstrument17Choice addCshAcctDtls(CashAccount26 cshAcctDtls) {
        getCshAcctDtls().add(cshAcctDtls);
        return this;
    }

}
