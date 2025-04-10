
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
 * The DTCCCACOSD1 message extends ISO corporate action movement confirmation message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCACOSD1V02", propOrder = {
    "corpActnGnlInf",
    "undrlygScty",
    "corpActnDtls",
    "acctBal",
    "corpActnConfSctiesMvmntDtls",
    "corpActnConfCshMvmntDtls"
})
public class DTCCCACOSD1V02 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD14 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD9 undrlygScty;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD10 corpActnDtls;
    @XmlElement(name = "AcctBal")
    protected List<AccountBalanceSD4> acctBal;
    @XmlElement(name = "CorpActnConfSctiesMvmntDtls")
    protected List<CorporateActionConfirmationSecuritiesMovementDetailsSD2> corpActnConfSctiesMvmntDtls;
    @XmlElement(name = "CorpActnConfCshMvmntDtls")
    protected List<CorporateActionConfirmationCashMovementDetailsSD2> corpActnConfCshMvmntDtls;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD14 }
     *     
     */
    public CorporateActionGeneralInformationSD14 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD14 }
     *     
     */
    public DTCCCACOSD1V02 setCorpActnGnlInf(CorporateActionGeneralInformationSD14 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD9 }
     *     
     */
    public FinancialInstrumentAttributesSD9 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD9 }
     *     
     */
    public DTCCCACOSD1V02 setUndrlygScty(FinancialInstrumentAttributesSD9 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD10 }
     *     
     */
    public CorporateActionSD10 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD10 }
     *     
     */
    public DTCCCACOSD1V02 setCorpActnDtls(CorporateActionSD10 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountBalanceSD4 }
     * 
     * 
     * @return
     *     The value of the acctBal property.
     */
    public List<AccountBalanceSD4> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the corpActnConfSctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnConfSctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnConfSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionConfirmationSecuritiesMovementDetailsSD2 }
     * 
     * 
     * @return
     *     The value of the corpActnConfSctiesMvmntDtls property.
     */
    public List<CorporateActionConfirmationSecuritiesMovementDetailsSD2> getCorpActnConfSctiesMvmntDtls() {
        if (corpActnConfSctiesMvmntDtls == null) {
            corpActnConfSctiesMvmntDtls = new ArrayList<>();
        }
        return this.corpActnConfSctiesMvmntDtls;
    }

    /**
     * Gets the value of the corpActnConfCshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnConfCshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnConfCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionConfirmationCashMovementDetailsSD2 }
     * 
     * 
     * @return
     *     The value of the corpActnConfCshMvmntDtls property.
     */
    public List<CorporateActionConfirmationCashMovementDetailsSD2> getCorpActnConfCshMvmntDtls() {
        if (corpActnConfCshMvmntDtls == null) {
            corpActnConfCshMvmntDtls = new ArrayList<>();
        }
        return this.corpActnConfCshMvmntDtls;
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
     * Adds a new item to the acctBal list.
     * @see #getAcctBal()
     * 
     */
    public DTCCCACOSD1V02 addAcctBal(AccountBalanceSD4 acctBal) {
        getAcctBal().add(acctBal);
        return this;
    }

    /**
     * Adds a new item to the corpActnConfSctiesMvmntDtls list.
     * @see #getCorpActnConfSctiesMvmntDtls()
     * 
     */
    public DTCCCACOSD1V02 addCorpActnConfSctiesMvmntDtls(CorporateActionConfirmationSecuritiesMovementDetailsSD2 corpActnConfSctiesMvmntDtls) {
        getCorpActnConfSctiesMvmntDtls().add(corpActnConfSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnConfCshMvmntDtls list.
     * @see #getCorpActnConfCshMvmntDtls()
     * 
     */
    public DTCCCACOSD1V02 addCorpActnConfCshMvmntDtls(CorporateActionConfirmationCashMovementDetailsSD2 corpActnConfCshMvmntDtls) {
        getCorpActnConfCshMvmntDtls().add(corpActnConfCshMvmntDtls);
        return this;
    }

}
