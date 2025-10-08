
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
 * The DTCCCAPASD1 message extends ISO corporate action movement preliminary advice message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAPASD1V11", propOrder = {
    "corpActnGnlInf",
    "undrlygScty",
    "corpActnBalDtls",
    "corpActnDtls",
    "corpActnMvmntSctiesMvmntDtls",
    "corpActnMvmntCshMvmntDtls",
    "optnTxDtls"
})
public class DTCCCAPASD1V11 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD58 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD21 undrlygScty;
    @XmlElement(name = "CorpActnBalDtls")
    protected CorporateActionBalanceSD4 corpActnBalDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD18 corpActnDtls;
    @XmlElement(name = "CorpActnMvmntSctiesMvmntDtls")
    protected List<CorporateActionMovementSecuritiesMovementDetailsSD5> corpActnMvmntSctiesMvmntDtls;
    @XmlElement(name = "CorpActnMvmntCshMvmntDtls")
    protected List<CorporateActionMovementCashMovementDetailsSD5> corpActnMvmntCshMvmntDtls;
    @XmlElement(name = "OptnTxDtls")
    protected List<OptionTransactionDetailsSD3> optnTxDtls;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD58 }
     *     
     */
    public CorporateActionGeneralInformationSD58 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD58 }
     *     
     */
    public DTCCCAPASD1V11 setCorpActnGnlInf(CorporateActionGeneralInformationSD58 value) {
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
    public DTCCCAPASD1V11 setUndrlygScty(FinancialInstrumentAttributesSD21 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionBalanceSD4 }
     *     
     */
    public CorporateActionBalanceSD4 getCorpActnBalDtls() {
        return corpActnBalDtls;
    }

    /**
     * Sets the value of the corpActnBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionBalanceSD4 }
     *     
     */
    public DTCCCAPASD1V11 setCorpActnBalDtls(CorporateActionBalanceSD4 value) {
        this.corpActnBalDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD18 }
     *     
     */
    public CorporateActionSD18 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD18 }
     *     
     */
    public DTCCCAPASD1V11 setCorpActnDtls(CorporateActionSD18 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnMvmntSctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnMvmntSctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnMvmntSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionMovementSecuritiesMovementDetailsSD5 }
     * 
     * 
     */
    public List<CorporateActionMovementSecuritiesMovementDetailsSD5> getCorpActnMvmntSctiesMvmntDtls() {
        if (corpActnMvmntSctiesMvmntDtls == null) {
            corpActnMvmntSctiesMvmntDtls = new ArrayList<CorporateActionMovementSecuritiesMovementDetailsSD5>();
        }
        return this.corpActnMvmntSctiesMvmntDtls;
    }

    /**
     * Gets the value of the corpActnMvmntCshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corpActnMvmntCshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorpActnMvmntCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionMovementCashMovementDetailsSD5 }
     * 
     * 
     */
    public List<CorporateActionMovementCashMovementDetailsSD5> getCorpActnMvmntCshMvmntDtls() {
        if (corpActnMvmntCshMvmntDtls == null) {
            corpActnMvmntCshMvmntDtls = new ArrayList<CorporateActionMovementCashMovementDetailsSD5>();
        }
        return this.corpActnMvmntCshMvmntDtls;
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
     * {@link OptionTransactionDetailsSD3 }
     * 
     * 
     */
    public List<OptionTransactionDetailsSD3> getOptnTxDtls() {
        if (optnTxDtls == null) {
            optnTxDtls = new ArrayList<OptionTransactionDetailsSD3>();
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
     * Adds a new item to the corpActnMvmntSctiesMvmntDtls list.
     * @see #getCorpActnMvmntSctiesMvmntDtls()
     * 
     */
    public DTCCCAPASD1V11 addCorpActnMvmntSctiesMvmntDtls(CorporateActionMovementSecuritiesMovementDetailsSD5 corpActnMvmntSctiesMvmntDtls) {
        getCorpActnMvmntSctiesMvmntDtls().add(corpActnMvmntSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnMvmntCshMvmntDtls list.
     * @see #getCorpActnMvmntCshMvmntDtls()
     * 
     */
    public DTCCCAPASD1V11 addCorpActnMvmntCshMvmntDtls(CorporateActionMovementCashMovementDetailsSD5 corpActnMvmntCshMvmntDtls) {
        getCorpActnMvmntCshMvmntDtls().add(corpActnMvmntCshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the optnTxDtls list.
     * @see #getOptnTxDtls()
     * 
     */
    public DTCCCAPASD1V11 addOptnTxDtls(OptionTransactionDetailsSD3 optnTxDtls) {
        getOptnTxDtls().add(optnTxDtls);
        return this;
    }

}
