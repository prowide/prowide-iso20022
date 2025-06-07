
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides information about the CA security option.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityOption1", propOrder = {
    "sctyId",
    "cdtDbtInd",
    "sctiesQty",
    "minExrcblSctiesQty",
    "minExrcblMltplSctiesQty",
    "newDnmtnSctiesQty",
    "newBrdLotSctiesQty",
    "shrRnkg",
    "addtlQtyForSbcbdRsltntScties",
    "dtDtls",
    "pricDtls",
    "tradgPrd",
    "addtlQtyForExstgScties",
    "tempFinInstrmInd",
    "frctnDspstn"
})
public class SecurityOption1 {

    @XmlElement(name = "SctyId", required = true)
    protected FinancialInstrumentDescription3 sctyId;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "SctiesQty")
    protected UnitOrFaceAmount1Choice sctiesQty;
    @XmlElement(name = "MinExrcblSctiesQty")
    protected UnitOrFaceAmount1Choice minExrcblSctiesQty;
    @XmlElement(name = "MinExrcblMltplSctiesQty")
    protected UnitOrFaceAmount1Choice minExrcblMltplSctiesQty;
    @XmlElement(name = "NewDnmtnSctiesQty")
    protected UnitOrFaceAmount1Choice newDnmtnSctiesQty;
    @XmlElement(name = "NewBrdLotSctiesQty")
    protected UnitOrFaceAmount1Choice newBrdLotSctiesQty;
    @XmlElement(name = "ShrRnkg")
    protected ShareRanking1FormatChoice shrRnkg;
    @XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
    protected QuantityToQuantityRatio1 addtlQtyForSbcbdRsltntScties;
    @XmlElement(name = "DtDtls")
    protected CorporateActionDate3 dtDtls;
    @XmlElement(name = "PricDtls")
    protected CorporateActionPrice4 pricDtls;
    @XmlElement(name = "TradgPrd")
    protected Period1 tradgPrd;
    @XmlElement(name = "AddtlQtyForExstgScties")
    protected QuantityToQuantityRatio1 addtlQtyForExstgScties;
    @XmlElement(name = "TempFinInstrmInd")
    protected Boolean tempFinInstrmInd;
    @XmlElement(name = "FrctnDspstn")
    protected FractionDispositionType1FormatChoice frctnDspstn;

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public FinancialInstrumentDescription3 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentDescription3 }
     *     
     */
    public SecurityOption1 setSctyId(FinancialInstrumentDescription3 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public SecurityOption1 setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public SecurityOption1 setSctiesQty(UnitOrFaceAmount1Choice value) {
        this.sctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMinExrcblSctiesQty() {
        return minExrcblSctiesQty;
    }

    /**
     * Sets the value of the minExrcblSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public SecurityOption1 setMinExrcblSctiesQty(UnitOrFaceAmount1Choice value) {
        this.minExrcblSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblMltplSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getMinExrcblMltplSctiesQty() {
        return minExrcblMltplSctiesQty;
    }

    /**
     * Sets the value of the minExrcblMltplSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public SecurityOption1 setMinExrcblMltplSctiesQty(UnitOrFaceAmount1Choice value) {
        this.minExrcblMltplSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the newDnmtnSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getNewDnmtnSctiesQty() {
        return newDnmtnSctiesQty;
    }

    /**
     * Sets the value of the newDnmtnSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public SecurityOption1 setNewDnmtnSctiesQty(UnitOrFaceAmount1Choice value) {
        this.newDnmtnSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the newBrdLotSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getNewBrdLotSctiesQty() {
        return newBrdLotSctiesQty;
    }

    /**
     * Sets the value of the newBrdLotSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public SecurityOption1 setNewBrdLotSctiesQty(UnitOrFaceAmount1Choice value) {
        this.newBrdLotSctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the shrRnkg property.
     * 
     * @return
     *     possible object is
     *     {@link ShareRanking1FormatChoice }
     *     
     */
    public ShareRanking1FormatChoice getShrRnkg() {
        return shrRnkg;
    }

    /**
     * Sets the value of the shrRnkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareRanking1FormatChoice }
     *     
     */
    public SecurityOption1 setShrRnkg(ShareRanking1FormatChoice value) {
        this.shrRnkg = value;
        return this;
    }

    /**
     * Gets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public QuantityToQuantityRatio1 getAddtlQtyForSbcbdRsltntScties() {
        return addtlQtyForSbcbdRsltntScties;
    }

    /**
     * Sets the value of the addtlQtyForSbcbdRsltntScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public SecurityOption1 setAddtlQtyForSbcbdRsltntScties(QuantityToQuantityRatio1 value) {
        this.addtlQtyForSbcbdRsltntScties = value;
        return this;
    }

    /**
     * Gets the value of the dtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDate3 }
     *     
     */
    public CorporateActionDate3 getDtDtls() {
        return dtDtls;
    }

    /**
     * Sets the value of the dtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDate3 }
     *     
     */
    public SecurityOption1 setDtDtls(CorporateActionDate3 value) {
        this.dtDtls = value;
        return this;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPrice4 }
     *     
     */
    public CorporateActionPrice4 getPricDtls() {
        return pricDtls;
    }

    /**
     * Sets the value of the pricDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPrice4 }
     *     
     */
    public SecurityOption1 setPricDtls(CorporateActionPrice4 value) {
        this.pricDtls = value;
        return this;
    }

    /**
     * Gets the value of the tradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getTradgPrd() {
        return tradgPrd;
    }

    /**
     * Sets the value of the tradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public SecurityOption1 setTradgPrd(Period1 value) {
        this.tradgPrd = value;
        return this;
    }

    /**
     * Gets the value of the addtlQtyForExstgScties property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public QuantityToQuantityRatio1 getAddtlQtyForExstgScties() {
        return addtlQtyForExstgScties;
    }

    /**
     * Sets the value of the addtlQtyForExstgScties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityToQuantityRatio1 }
     *     
     */
    public SecurityOption1 setAddtlQtyForExstgScties(QuantityToQuantityRatio1 value) {
        this.addtlQtyForExstgScties = value;
        return this;
    }

    /**
     * Gets the value of the tempFinInstrmInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempFinInstrmInd() {
        return tempFinInstrmInd;
    }

    /**
     * Sets the value of the tempFinInstrmInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecurityOption1 setTempFinInstrmInd(Boolean value) {
        this.tempFinInstrmInd = value;
        return this;
    }

    /**
     * Gets the value of the frctnDspstn property.
     * 
     * @return
     *     possible object is
     *     {@link FractionDispositionType1FormatChoice }
     *     
     */
    public FractionDispositionType1FormatChoice getFrctnDspstn() {
        return frctnDspstn;
    }

    /**
     * Sets the value of the frctnDspstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionDispositionType1FormatChoice }
     *     
     */
    public SecurityOption1 setFrctnDspstn(FractionDispositionType1FormatChoice value) {
        this.frctnDspstn = value;
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

}
