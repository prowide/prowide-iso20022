
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
 * The DTCCCAPASD1 message extends ISO corporate action movement preliminary advice message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCAPASD1V08", propOrder = {
    "corpActnGnlInf",
    "undrlygScty",
    "corpActnBalDtls",
    "corpActnDtls",
    "corpActnMvmntSctiesMvmntDtls",
    "corpActnMvmntCshMvmntDtls",
    "optnTxDtls"
})
public class DTCCCAPASD1V08 {

    @XmlElement(name = "CorpActnGnlInf")
    protected CorporateActionGeneralInformationSD43 corpActnGnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD17 undrlygScty;
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
     *     {@link CorporateActionGeneralInformationSD43 }
     *     
     */
    public CorporateActionGeneralInformationSD43 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD43 }
     *     
     */
    public DTCCCAPASD1V08 setCorpActnGnlInf(CorporateActionGeneralInformationSD43 value) {
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
    public DTCCCAPASD1V08 setUndrlygScty(FinancialInstrumentAttributesSD17 value) {
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
    public DTCCCAPASD1V08 setCorpActnBalDtls(CorporateActionBalanceSD4 value) {
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
    public DTCCCAPASD1V08 setCorpActnDtls(CorporateActionSD18 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnMvmntSctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnMvmntSctiesMvmntDtls property.
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
     * @return
     *     The value of the corpActnMvmntSctiesMvmntDtls property.
     */
    public List<CorporateActionMovementSecuritiesMovementDetailsSD5> getCorpActnMvmntSctiesMvmntDtls() {
        if (corpActnMvmntSctiesMvmntDtls == null) {
            corpActnMvmntSctiesMvmntDtls = new ArrayList<>();
        }
        return this.corpActnMvmntSctiesMvmntDtls;
    }

    /**
     * Gets the value of the corpActnMvmntCshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the corpActnMvmntCshMvmntDtls property.
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
     * @return
     *     The value of the corpActnMvmntCshMvmntDtls property.
     */
    public List<CorporateActionMovementCashMovementDetailsSD5> getCorpActnMvmntCshMvmntDtls() {
        if (corpActnMvmntCshMvmntDtls == null) {
            corpActnMvmntCshMvmntDtls = new ArrayList<>();
        }
        return this.corpActnMvmntCshMvmntDtls;
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
     * {@link OptionTransactionDetailsSD3 }
     * 
     * 
     * @return
     *     The value of the optnTxDtls property.
     */
    public List<OptionTransactionDetailsSD3> getOptnTxDtls() {
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
     * Adds a new item to the corpActnMvmntSctiesMvmntDtls list.
     * @see #getCorpActnMvmntSctiesMvmntDtls()
     * 
     */
    public DTCCCAPASD1V08 addCorpActnMvmntSctiesMvmntDtls(CorporateActionMovementSecuritiesMovementDetailsSD5 corpActnMvmntSctiesMvmntDtls) {
        getCorpActnMvmntSctiesMvmntDtls().add(corpActnMvmntSctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the corpActnMvmntCshMvmntDtls list.
     * @see #getCorpActnMvmntCshMvmntDtls()
     * 
     */
    public DTCCCAPASD1V08 addCorpActnMvmntCshMvmntDtls(CorporateActionMovementCashMovementDetailsSD5 corpActnMvmntCshMvmntDtls) {
        getCorpActnMvmntCshMvmntDtls().add(corpActnMvmntCshMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the optnTxDtls list.
     * @see #getOptnTxDtls()
     * 
     */
    public DTCCCAPASD1V08 addOptnTxDtls(OptionTransactionDetailsSD3 optnTxDtls) {
        getOptnTxDtls().add(optnTxDtls);
        return this;
    }

}
