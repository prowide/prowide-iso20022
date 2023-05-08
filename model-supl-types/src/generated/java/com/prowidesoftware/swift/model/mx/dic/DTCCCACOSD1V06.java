
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
@XmlType(name = "DTCCCACOSD1V06", propOrder = {
    "corpActnGnlInf",
    "undrlygScty",
    "corpActnDtls",
    "acctBal",
    "corpActnConfDtls",
    "corpActnConfSctiesMvmntDtls",
    "corpActnConfCshMvmntDtls",
    "optnTxDtls"
})
public class DTCCCACOSD1V06 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD32 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD17 undrlygScty;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD20 corpActnDtls;
    @XmlElement(name = "AcctBal")
    protected List<AccountBalanceSD13> acctBal;
    @XmlElement(name = "CorpActnConfDtls")
    protected CorporateActionConfirmationDetailsSD2 corpActnConfDtls;
    @XmlElement(name = "CorpActnConfSctiesMvmntDtls")
    protected List<CorporateActionConfirmationSecuritiesMovementDetailsSD6> corpActnConfSctiesMvmntDtls;
    @XmlElement(name = "CorpActnConfCshMvmntDtls")
    protected List<CorporateActionConfirmationCashMovementDetailsSD5> corpActnConfCshMvmntDtls;
    @XmlElement(name = "OptnTxDtls")
    protected List<OptionTransactionDetailsSD4> optnTxDtls;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD32 }
     *     
     */
    public CorporateActionGeneralInformationSD32 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD32 }
     *     
     */
    public DTCCCACOSD1V06 setCorpActnGnlInf(CorporateActionGeneralInformationSD32 value) {
        this.corpActnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD17 }
     *     
     */
    public FinancialInstrumentAttributesSD17 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD17 }
     *     
     */
    public DTCCCACOSD1V06 setUndrlygScty(FinancialInstrumentAttributesSD17 value) {
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
    public DTCCCACOSD1V06 setCorpActnDtls(CorporateActionSD20 value) {
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
     * {@link AccountBalanceSD13 }
     * 
     * 
     * @return
     *     The value of the acctBal property.
     */
    public List<AccountBalanceSD13> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<>();
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
    public DTCCCACOSD1V06 setCorpActnConfDtls(CorporateActionConfirmationDetailsSD2 value) {
        this.corpActnConfDtls = value;
        return this;
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
     * {@link CorporateActionConfirmationSecuritiesMovementDetailsSD6 }
     * 
     * 
     * @return
     *     The value of the corpActnConfSctiesMvmntDtls property.
     */
    public List<CorporateActionConfirmationSecuritiesMovementDetailsSD6> getCorpActnConfSctiesMvmntDtls() {
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
     * {@link CorporateActionConfirmationCashMovementDetailsSD5 }
     * 
     * 
     * @return
     *     The value of the corpActnConfCshMvmntDtls property.
     */
    public List<CorporateActionConfirmationCashMovementDetailsSD5> getCorpActnConfCshMvmntDtls() {
        if (corpActnConfCshMvmntDtls == null) {
            corpActnConfCshMvmntDtls = new ArrayList<>();
        }
        return this.corpActnConfCshMvmntDtls;
    }

    /**
     * Gets the value of the optnTxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the optnTxDtls property.
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
     * {@link OptionTransactionDetailsSD4 }
     * 
     * 
     * @return
     *     The value of the optnTxDtls property.
     */
    public List<OptionTransactionDetailsSD4> getOptnTxDtls() {
        if (optnTxDtls == null) {
            optnTxDtls = new ArrayList<>();
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
    public DTCCCACOSD1V06 addAcctBal(AccountBalanceSD13 acctBal) {
        getAcctBal().add(acctBal);
        return this;
    }

    /**
     * Adds a new item to the corpActnConfSctiesMvmntDtls list.
     * @see #getCorpActnConfSctiesMvmntDtls()
     * 
     */
    public DTCCCACOSD1V06 addCorpActnConfSctiesMvmntDtls(CorporateActionConfirmationSecuritiesMovementDetailsSD6 corpActnConfSctiesMvmntDtls) {
        getCorpActnConfSctiesMvmntDtls().add(corpActnConfSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnConfCshMvmntDtls list.
     * @see #getCorpActnConfCshMvmntDtls()
     * 
     */
    public DTCCCACOSD1V06 addCorpActnConfCshMvmntDtls(CorporateActionConfirmationCashMovementDetailsSD5 corpActnConfCshMvmntDtls) {
        getCorpActnConfCshMvmntDtls().add(corpActnConfCshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the optnTxDtls list.
     * @see #getOptnTxDtls()
     * 
     */
    public DTCCCACOSD1V06 addOptnTxDtls(OptionTransactionDetailsSD4 optnTxDtls) {
        getOptnTxDtls().add(optnTxDtls);
        return this;
    }

}
