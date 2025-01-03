
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
 * The DTCCCANOEligibleBalanceSD1 message extends ISO corporate action notification (Eligible Balance market practice) message with DTCC corporate action eligible balance elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCANOEligibleBalanceSD1V10", propOrder = {
    "corpActnGnlInf",
    "undrlygScty",
    "dstrbtnAcctBal",
    "redAcctBal",
    "reorgAcctBal"
})
public class DTCCCANOEligibleBalanceSD1V10 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD42 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD21 undrlygScty;
    @XmlElement(name = "DstrbtnAcctBal")
    protected List<AccountBalanceSD10> dstrbtnAcctBal;
    @XmlElement(name = "RedAcctBal")
    protected AccountBalanceSD11 redAcctBal;
    @XmlElement(name = "ReorgAcctBal")
    protected AccountBalanceSD12 reorgAcctBal;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD42 }
     *     
     */
    public CorporateActionGeneralInformationSD42 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD42 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V10 setCorpActnGnlInf(CorporateActionGeneralInformationSD42 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD21 }
     *     
     */
    public FinancialInstrumentAttributesSD21 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD21 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V10 setUndrlygScty(FinancialInstrumentAttributesSD21 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnAcctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dstrbtnAcctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDstrbtnAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBalanceSD10 }
     * 
     * 
     * @return
     *     The value of the dstrbtnAcctBal property.
     */
    public List<AccountBalanceSD10> getDstrbtnAcctBal() {
        if (dstrbtnAcctBal == null) {
            dstrbtnAcctBal = new ArrayList<>();
        }
        return this.dstrbtnAcctBal;
    }

    /**
     * Gets the value of the redAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link AccountBalanceSD11 }
     *     
     */
    public AccountBalanceSD11 getRedAcctBal() {
        return redAcctBal;
    }

    /**
     * Sets the value of the redAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBalanceSD11 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V10 setRedAcctBal(AccountBalanceSD11 value) {
        this.redAcctBal = value;
        return this;
    }

    /**
     * Gets the value of the reorgAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link AccountBalanceSD12 }
     *     
     */
    public AccountBalanceSD12 getReorgAcctBal() {
        return reorgAcctBal;
    }

    /**
     * Sets the value of the reorgAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountBalanceSD12 }
     *     
     */
    public DTCCCANOEligibleBalanceSD1V10 setReorgAcctBal(AccountBalanceSD12 value) {
        this.reorgAcctBal = value;
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
     * Adds a new item to the dstrbtnAcctBal list.
     * @see #getDstrbtnAcctBal()
     * 
     */
    public DTCCCANOEligibleBalanceSD1V10 addDstrbtnAcctBal(AccountBalanceSD10 dstrbtnAcctBal) {
        getDstrbtnAcctBal().add(dstrbtnAcctBal);
        return this;
    }

}
