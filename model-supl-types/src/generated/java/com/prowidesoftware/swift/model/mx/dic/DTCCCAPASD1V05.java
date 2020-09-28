
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
 * The DTCCCAPASD1 messge extends ISO corporate action movement preliminary advice message with DTCC corporate action elements not covered in the standard message. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAPASD1V05", propOrder = {
    "corpActnGnlInf",
    "undrlygScty",
    "corpActnBalDtls",
    "corpActnDtls",
    "sctiesQty",
    "corpActnMvmntSctiesMvmntDtls",
    "corpActnMvmntCshMvmntDtls",
    "optnTxDtls"
})
public class DTCCCAPASD1V05 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD25 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD9 undrlygScty;
    @XmlElement(name = "CorpActnBalDtls")
    protected CorporateActionBalanceSD3 corpActnBalDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD8 corpActnDtls;
    @XmlElement(name = "SctiesQty")
    protected CorporateActionQuantitySD2 sctiesQty;
    @XmlElement(name = "CorpActnMvmntSctiesMvmntDtls")
    protected List<CorporateActionMovementSecuritiesMovementDetailsSD4> corpActnMvmntSctiesMvmntDtls;
    @XmlElement(name = "CorpActnMvmntCshMvmntDtls")
    protected List<CorporateActionMovementCashMovementDetailsSD4> corpActnMvmntCshMvmntDtls;
    @XmlElement(name = "OptnTxDtls")
    protected List<OptionTransactionDetailsSD1> optnTxDtls;

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD25 }
     *     
     */
    public CorporateActionGeneralInformationSD25 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD25 }
     *     
     */
    public DTCCCAPASD1V05 setCorpActnGnlInf(CorporateActionGeneralInformationSD25 value) {
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
    public DTCCCAPASD1V05 setUndrlygScty(FinancialInstrumentAttributesSD9 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionBalanceSD3 }
     *     
     */
    public CorporateActionBalanceSD3 getCorpActnBalDtls() {
        return corpActnBalDtls;
    }

    /**
     * Sets the value of the corpActnBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionBalanceSD3 }
     *     
     */
    public DTCCCAPASD1V05 setCorpActnBalDtls(CorporateActionBalanceSD3 value) {
        this.corpActnBalDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD8 }
     *     
     */
    public CorporateActionSD8 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD8 }
     *     
     */
    public DTCCCAPASD1V05 setCorpActnDtls(CorporateActionSD8 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionQuantitySD2 }
     *     
     */
    public CorporateActionQuantitySD2 getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionQuantitySD2 }
     *     
     */
    public DTCCCAPASD1V05 setSctiesQty(CorporateActionQuantitySD2 value) {
        this.sctiesQty = value;
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
     * {@link CorporateActionMovementSecuritiesMovementDetailsSD4 }
     * 
     * 
     */
    public List<CorporateActionMovementSecuritiesMovementDetailsSD4> getCorpActnMvmntSctiesMvmntDtls() {
        if (corpActnMvmntSctiesMvmntDtls == null) {
            corpActnMvmntSctiesMvmntDtls = new ArrayList<CorporateActionMovementSecuritiesMovementDetailsSD4>();
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
     * {@link CorporateActionMovementCashMovementDetailsSD4 }
     * 
     * 
     */
    public List<CorporateActionMovementCashMovementDetailsSD4> getCorpActnMvmntCshMvmntDtls() {
        if (corpActnMvmntCshMvmntDtls == null) {
            corpActnMvmntCshMvmntDtls = new ArrayList<CorporateActionMovementCashMovementDetailsSD4>();
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
     * {@link OptionTransactionDetailsSD1 }
     * 
     * 
     */
    public List<OptionTransactionDetailsSD1> getOptnTxDtls() {
        if (optnTxDtls == null) {
            optnTxDtls = new ArrayList<OptionTransactionDetailsSD1>();
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
    public DTCCCAPASD1V05 addCorpActnMvmntSctiesMvmntDtls(CorporateActionMovementSecuritiesMovementDetailsSD4 corpActnMvmntSctiesMvmntDtls) {
        getCorpActnMvmntSctiesMvmntDtls().add(corpActnMvmntSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnMvmntCshMvmntDtls list.
     * @see #getCorpActnMvmntCshMvmntDtls()
     * 
     */
    public DTCCCAPASD1V05 addCorpActnMvmntCshMvmntDtls(CorporateActionMovementCashMovementDetailsSD4 corpActnMvmntCshMvmntDtls) {
        getCorpActnMvmntCshMvmntDtls().add(corpActnMvmntCshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the optnTxDtls list.
     * @see #getOptnTxDtls()
     * 
     */
    public DTCCCAPASD1V05 addOptnTxDtls(OptionTransactionDetailsSD1 optnTxDtls) {
        getOptnTxDtls().add(optnTxDtls);
        return this;
    }

}
