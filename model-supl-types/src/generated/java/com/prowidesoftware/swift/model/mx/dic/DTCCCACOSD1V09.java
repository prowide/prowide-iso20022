
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
@XmlType(name = "DTCCCACOSD1V09", propOrder = {
    "corpActnGnlInf",
    "undrlygScty",
    "corpActnDtls",
    "acctBal",
    "corpActnConfDtls",
    "corpActnConfSctiesMvmntDtls",
    "corpActnConfCshMvmntDtls",
    "optnTxDtls"
})
public class DTCCCACOSD1V09 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD44 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD21 undrlygScty;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD20 corpActnDtls;
    @XmlElement(name = "AcctBal")
    protected List<AccountBalanceSD14> acctBal;
    @XmlElement(name = "CorpActnConfDtls")
    protected CorporateActionConfirmationDetailsSD2 corpActnConfDtls;
    @XmlElement(name = "CorpActnConfSctiesMvmntDtls")
    protected List<CorporateActionConfirmationSecuritiesMovementDetailsSD6> corpActnConfSctiesMvmntDtls;
    @XmlElement(name = "CorpActnConfCshMvmntDtls")
    protected List<CorporateActionConfirmationCashMovementDetailsSD5> corpActnConfCshMvmntDtls;
    @XmlElement(name = "OptnTxDtls")
    protected List<OptionTransactionSD6> optnTxDtls;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD44 }
     *     
     */
    public CorporateActionGeneralInformationSD44 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD44 }
     *     
     */
    public DTCCCACOSD1V09 setCorpActnGnlInf(CorporateActionGeneralInformationSD44 value) {
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
    public DTCCCACOSD1V09 setUndrlygScty(FinancialInstrumentAttributesSD21 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD20 }
     *     
     */
    public CorporateActionSD20 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD20 }
     *     
     */
    public DTCCCACOSD1V09 setCorpActnDtls(CorporateActionSD20 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the acctBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctBal property.
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
     * {@link AccountBalanceSD14 }
     * 
     * 
     */
    public List<AccountBalanceSD14> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AccountBalanceSD14>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the corpActnConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionConfirmationDetailsSD2 }
     *     
     */
    public CorporateActionConfirmationDetailsSD2 getCorpActnConfDtls() {
        return corpActnConfDtls;
    }

    /**
     * Sets the value of the corpActnConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionConfirmationDetailsSD2 }
     *     
     */
    public DTCCCACOSD1V09 setCorpActnConfDtls(CorporateActionConfirmationDetailsSD2 value) {
        this.corpActnConfDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnConfSctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnConfSctiesMvmntDtls property.
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
     * {@link CorporateActionConfirmationSecuritiesMovementDetailsSD6 }
     * 
     * 
     */
    public List<CorporateActionConfirmationSecuritiesMovementDetailsSD6> getCorpActnConfSctiesMvmntDtls() {
        if (corpActnConfSctiesMvmntDtls == null) {
            corpActnConfSctiesMvmntDtls = new ArrayList<CorporateActionConfirmationSecuritiesMovementDetailsSD6>();
        }
        return this.corpActnConfSctiesMvmntDtls;
    }

    /**
     * Gets the value of the corpActnConfCshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnConfCshMvmntDtls property.
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
     * {@link CorporateActionConfirmationCashMovementDetailsSD5 }
     * 
     * 
     */
    public List<CorporateActionConfirmationCashMovementDetailsSD5> getCorpActnConfCshMvmntDtls() {
        if (corpActnConfCshMvmntDtls == null) {
            corpActnConfCshMvmntDtls = new ArrayList<CorporateActionConfirmationCashMovementDetailsSD5>();
        }
        return this.corpActnConfCshMvmntDtls;
    }

    /**
     * Gets the value of the optnTxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnTxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionTransactionSD6 }
     * 
     * 
     */
    public List<OptionTransactionSD6> getOptnTxDtls() {
        if (optnTxDtls == null) {
            optnTxDtls = new ArrayList<OptionTransactionSD6>();
        }
        return this.optnTxDtls;
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
    public DTCCCACOSD1V09 addAcctBal(AccountBalanceSD14 acctBal) {
        getAcctBal().add(acctBal);
        return this;
    }

    /**
     * Adds a new item to the corpActnConfSctiesMvmntDtls list.
     * @see #getCorpActnConfSctiesMvmntDtls()
     * 
     */
    public DTCCCACOSD1V09 addCorpActnConfSctiesMvmntDtls(CorporateActionConfirmationSecuritiesMovementDetailsSD6 corpActnConfSctiesMvmntDtls) {
        getCorpActnConfSctiesMvmntDtls().add(corpActnConfSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnConfCshMvmntDtls list.
     * @see #getCorpActnConfCshMvmntDtls()
     * 
     */
    public DTCCCACOSD1V09 addCorpActnConfCshMvmntDtls(CorporateActionConfirmationCashMovementDetailsSD5 corpActnConfCshMvmntDtls) {
        getCorpActnConfCshMvmntDtls().add(corpActnConfCshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the optnTxDtls list.
     * @see #getOptnTxDtls()
     * 
     */
    public DTCCCACOSD1V09 addOptnTxDtls(OptionTransactionSD6 optnTxDtls) {
        getOptnTxDtls().add(optnTxDtls);
        return this;
    }

}
