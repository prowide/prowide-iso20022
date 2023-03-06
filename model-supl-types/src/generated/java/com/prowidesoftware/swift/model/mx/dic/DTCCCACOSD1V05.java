
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
@XmlType(name = "DTCCCACOSD1V05", propOrder = {
    "pgntn",
    "corpActnGnlInf",
    "undrlygScty",
    "corpActnDtls",
    "acctBal",
    "corpActnConfDtls",
    "corpActnConfSctiesMvmntDtls",
    "corpActnConfCshMvmntDtls",
    "optnTxDtls"
})
public class DTCCCACOSD1V05 {

    @XmlElement(name = "Pgntn")
    protected Pagination pgntn;
    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD27 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD9 undrlygScty;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD16 corpActnDtls;
    @XmlElement(name = "AcctBal")
    protected List<AccountBalanceSD9> acctBal;
    @XmlElement(name = "CorpActnConfDtls")
    protected CorporateActionConfirmationDetailsSD1 corpActnConfDtls;
    @XmlElement(name = "CorpActnConfSctiesMvmntDtls")
    protected List<CorporateActionConfirmationSecuritiesMovementDetailsSD5> corpActnConfSctiesMvmntDtls;
    @XmlElement(name = "CorpActnConfCshMvmntDtls")
    protected List<CorporateActionConfirmationCashMovementDetailsSD4> corpActnConfCshMvmntDtls;
    @XmlElement(name = "OptnTxDtls")
    protected List<OptionTransactionDetailsSD2> optnTxDtls;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public DTCCCACOSD1V05 setPgntn(Pagination value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD27 }
     *     
     */
    public CorporateActionGeneralInformationSD27 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD27 }
     *     
     */
    public DTCCCACOSD1V05 setCorpActnGnlInf(CorporateActionGeneralInformationSD27 value) {
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
    public DTCCCACOSD1V05 setUndrlygScty(FinancialInstrumentAttributesSD9 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD16 }
     *     
     */
    public CorporateActionSD16 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD16 }
     *     
     */
    public DTCCCACOSD1V05 setCorpActnDtls(CorporateActionSD16 value) {
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
     * {@link AccountBalanceSD9 }
     * 
     * 
     */
    public List<AccountBalanceSD9> getAcctBal() {
        if (acctBal == null) {
            acctBal = new ArrayList<AccountBalanceSD9>();
        }
        return this.acctBal;
    }

    /**
     * Gets the value of the corpActnConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionConfirmationDetailsSD1 }
     *     
     */
    public CorporateActionConfirmationDetailsSD1 getCorpActnConfDtls() {
        return corpActnConfDtls;
    }

    /**
     * Sets the value of the corpActnConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionConfirmationDetailsSD1 }
     *     
     */
    public DTCCCACOSD1V05 setCorpActnConfDtls(CorporateActionConfirmationDetailsSD1 value) {
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
     * {@link CorporateActionConfirmationSecuritiesMovementDetailsSD5 }
     * 
     * 
     */
    public List<CorporateActionConfirmationSecuritiesMovementDetailsSD5> getCorpActnConfSctiesMvmntDtls() {
        if (corpActnConfSctiesMvmntDtls == null) {
            corpActnConfSctiesMvmntDtls = new ArrayList<CorporateActionConfirmationSecuritiesMovementDetailsSD5>();
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
     * {@link CorporateActionConfirmationCashMovementDetailsSD4 }
     * 
     * 
     */
    public List<CorporateActionConfirmationCashMovementDetailsSD4> getCorpActnConfCshMvmntDtls() {
        if (corpActnConfCshMvmntDtls == null) {
            corpActnConfCshMvmntDtls = new ArrayList<CorporateActionConfirmationCashMovementDetailsSD4>();
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
     * {@link OptionTransactionDetailsSD2 }
     * 
     * 
     */
    public List<OptionTransactionDetailsSD2> getOptnTxDtls() {
        if (optnTxDtls == null) {
            optnTxDtls = new ArrayList<OptionTransactionDetailsSD2>();
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
    public DTCCCACOSD1V05 addAcctBal(AccountBalanceSD9 acctBal) {
        getAcctBal().add(acctBal);
        return this;
    }

    /**
     * Adds a new item to the corpActnConfSctiesMvmntDtls list.
     * @see #getCorpActnConfSctiesMvmntDtls()
     * 
     */
    public DTCCCACOSD1V05 addCorpActnConfSctiesMvmntDtls(CorporateActionConfirmationSecuritiesMovementDetailsSD5 corpActnConfSctiesMvmntDtls) {
        getCorpActnConfSctiesMvmntDtls().add(corpActnConfSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnConfCshMvmntDtls list.
     * @see #getCorpActnConfCshMvmntDtls()
     * 
     */
    public DTCCCACOSD1V05 addCorpActnConfCshMvmntDtls(CorporateActionConfirmationCashMovementDetailsSD4 corpActnConfCshMvmntDtls) {
        getCorpActnConfCshMvmntDtls().add(corpActnConfCshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the optnTxDtls list.
     * @see #getOptnTxDtls()
     * 
     */
    public DTCCCACOSD1V05 addOptnTxDtls(OptionTransactionDetailsSD2 optnTxDtls) {
        getOptnTxDtls().add(optnTxDtls);
        return this;
    }

}
