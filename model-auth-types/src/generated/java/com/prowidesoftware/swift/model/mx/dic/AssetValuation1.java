
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details about the valuation of the assets held by the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetValuation1", propOrder = {
    "mtrtyDt",
    "ntnlCcyFrstLeg",
    "ntnlCcyScndLeg",
    "qty",
    "pric",
    "acrdIntrst",
    "ttlVal",
    "xpsrVal",
    "collVal",
    "valtnTp",
    "cdtAssmntRslt",
    "rstDt"
})
public class AssetValuation1 {

    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mtrtyDt;
    @XmlElement(name = "NtnlCcyFrstLeg", required = true)
    protected String ntnlCcyFrstLeg;
    @XmlElement(name = "NtnlCcyScndLeg")
    protected String ntnlCcyScndLeg;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "Pric")
    protected CurrencyExchange14 pric;
    @XmlElement(name = "AcrdIntrst")
    protected CurrencyExchange14 acrdIntrst;
    @XmlElement(name = "TtlVal")
    protected CurrencyExchange14 ttlVal;
    @XmlElement(name = "XpsrVal")
    protected CurrencyExchange14 xpsrVal;
    @XmlElement(name = "CollVal")
    protected CurrencyExchange14 collVal;
    @XmlElement(name = "ValtnTp")
    @XmlSchemaType(name = "string")
    protected ValuationType2Code valtnTp;
    @XmlElement(name = "CdtAssmntRslt")
    @XmlSchemaType(name = "string")
    protected AssessmentResultType1Code cdtAssmntRslt;
    @XmlElement(name = "RstDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate rstDt;

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AssetValuation1 setMtrtyDt(LocalDate value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcyFrstLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcyFrstLeg() {
        return ntnlCcyFrstLeg;
    }

    /**
     * Sets the value of the ntnlCcyFrstLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AssetValuation1 setNtnlCcyFrstLeg(String value) {
        this.ntnlCcyFrstLeg = value;
        return this;
    }

    /**
     * Gets the value of the ntnlCcyScndLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtnlCcyScndLeg() {
        return ntnlCcyScndLeg;
    }

    /**
     * Sets the value of the ntnlCcyScndLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AssetValuation1 setNtnlCcyScndLeg(String value) {
        this.ntnlCcyScndLeg = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public AssetValuation1 setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public CurrencyExchange14 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public AssetValuation1 setPric(CurrencyExchange14 value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the acrdIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public CurrencyExchange14 getAcrdIntrst() {
        return acrdIntrst;
    }

    /**
     * Sets the value of the acrdIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public AssetValuation1 setAcrdIntrst(CurrencyExchange14 value) {
        this.acrdIntrst = value;
        return this;
    }

    /**
     * Gets the value of the ttlVal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public CurrencyExchange14 getTtlVal() {
        return ttlVal;
    }

    /**
     * Sets the value of the ttlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public AssetValuation1 setTtlVal(CurrencyExchange14 value) {
        this.ttlVal = value;
        return this;
    }

    /**
     * Gets the value of the xpsrVal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public CurrencyExchange14 getXpsrVal() {
        return xpsrVal;
    }

    /**
     * Sets the value of the xpsrVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public AssetValuation1 setXpsrVal(CurrencyExchange14 value) {
        this.xpsrVal = value;
        return this;
    }

    /**
     * Gets the value of the collVal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public CurrencyExchange14 getCollVal() {
        return collVal;
    }

    /**
     * Sets the value of the collVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public AssetValuation1 setCollVal(CurrencyExchange14 value) {
        this.collVal = value;
        return this;
    }

    /**
     * Gets the value of the valtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationType2Code }
     *     
     */
    public ValuationType2Code getValtnTp() {
        return valtnTp;
    }

    /**
     * Sets the value of the valtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationType2Code }
     *     
     */
    public AssetValuation1 setValtnTp(ValuationType2Code value) {
        this.valtnTp = value;
        return this;
    }

    /**
     * Gets the value of the cdtAssmntRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentResultType1Code }
     *     
     */
    public AssessmentResultType1Code getCdtAssmntRslt() {
        return cdtAssmntRslt;
    }

    /**
     * Sets the value of the cdtAssmntRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentResultType1Code }
     *     
     */
    public AssetValuation1 setCdtAssmntRslt(AssessmentResultType1Code value) {
        this.cdtAssmntRslt = value;
        return this;
    }

    /**
     * Gets the value of the rstDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRstDt() {
        return rstDt;
    }

    /**
     * Sets the value of the rstDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AssetValuation1 setRstDt(LocalDate value) {
        this.rstDt = value;
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
