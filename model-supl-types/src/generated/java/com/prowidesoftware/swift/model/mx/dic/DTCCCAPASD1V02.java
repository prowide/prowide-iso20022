
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
 * The DTCCCAPASD1 messge extends ISO corporate action movement preliminary advice message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAPASD1V02", propOrder = {
    "corpActnGnlInf",
    "undrlygScty",
    "corpActnBalDtls",
    "corpActnDtls",
    "corpActnDtDtls",
    "corpActnMvmntSctiesMvmntDtls",
    "corpActnMvmntCshMvmntDtls"
})
public class DTCCCAPASD1V02 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD14 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD9 undrlygScty;
    @XmlElement(name = "CorpActnBalDtls")
    protected CorporateActionBalanceSD1 corpActnBalDtls;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD8 corpActnDtls;
    @XmlElement(name = "CorpActnDtDtls")
    protected CorporateActionDateSD6 corpActnDtDtls;
    @XmlElement(name = "CorpActnMvmntSctiesMvmntDtls")
    protected List<CorporateActionMovementSecuritiesMovementDetailsSD2> corpActnMvmntSctiesMvmntDtls;
    @XmlElement(name = "CorpActnMvmntCshMvmntDtls")
    protected List<CorporateActionMovementCashMovementDetailsSD2> corpActnMvmntCshMvmntDtls;

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
    public DTCCCAPASD1V02 setCorpActnGnlInf(CorporateActionGeneralInformationSD14 value) {
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
    public DTCCCAPASD1V02 setUndrlygScty(FinancialInstrumentAttributesSD9 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnBalDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionBalanceSD1 }
     *     
     */
    public CorporateActionBalanceSD1 getCorpActnBalDtls() {
        return corpActnBalDtls;
    }

    /**
     * Sets the value of the corpActnBalDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionBalanceSD1 }
     *     
     */
    public DTCCCAPASD1V02 setCorpActnBalDtls(CorporateActionBalanceSD1 value) {
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
    public DTCCCAPASD1V02 setCorpActnDtls(CorporateActionSD8 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDateSD6 }
     *     
     */
    public CorporateActionDateSD6 getCorpActnDtDtls() {
        return corpActnDtDtls;
    }

    /**
     * Sets the value of the corpActnDtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDateSD6 }
     *     
     */
    public DTCCCAPASD1V02 setCorpActnDtDtls(CorporateActionDateSD6 value) {
        this.corpActnDtDtls = value;
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
     * {@link CorporateActionMovementSecuritiesMovementDetailsSD2 }
     * 
     * 
     */
    public List<CorporateActionMovementSecuritiesMovementDetailsSD2> getCorpActnMvmntSctiesMvmntDtls() {
        if (corpActnMvmntSctiesMvmntDtls == null) {
            corpActnMvmntSctiesMvmntDtls = new ArrayList<CorporateActionMovementSecuritiesMovementDetailsSD2>();
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
     * {@link CorporateActionMovementCashMovementDetailsSD2 }
     * 
     * 
     */
    public List<CorporateActionMovementCashMovementDetailsSD2> getCorpActnMvmntCshMvmntDtls() {
        if (corpActnMvmntCshMvmntDtls == null) {
            corpActnMvmntCshMvmntDtls = new ArrayList<CorporateActionMovementCashMovementDetailsSD2>();
        }
        return this.corpActnMvmntCshMvmntDtls;
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
    public DTCCCAPASD1V02 addCorpActnMvmntSctiesMvmntDtls(CorporateActionMovementSecuritiesMovementDetailsSD2 corpActnMvmntSctiesMvmntDtls) {
        getCorpActnMvmntSctiesMvmntDtls().add(corpActnMvmntSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnMvmntCshMvmntDtls list.
     * @see #getCorpActnMvmntCshMvmntDtls()
     * 
     */
    public DTCCCAPASD1V02 addCorpActnMvmntCshMvmntDtls(CorporateActionMovementCashMovementDetailsSD2 corpActnMvmntCshMvmntDtls) {
        getCorpActnMvmntCshMvmntDtls().add(corpActnMvmntCshMvmntDtls);
        return this;
    }

}
