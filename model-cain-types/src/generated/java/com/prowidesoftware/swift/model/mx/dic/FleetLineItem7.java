
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Supplies additional transaction information for fleet transactions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FleetLineItem7", propOrder = {
    "fuel",
    "svcTp",
    "fuelBrndCd",
    "pdctCd",
    "pdctCtgy",
    "pdctQlfr",
    "pdctCdAssgnr",
    "unitPricTax",
    "unitPric",
    "unitOfMeasr",
    "pctgDscntRate",
    "perUnitDscntRate",
    "flatDscntRate",
    "costPlusUnitDscnt",
    "costPlusUnitDscntSgn",
    "costPlusUnitPric",
    "ttlTmPlugdIn",
    "ttlTmChrgg",
    "chrggStartTm",
    "chrggCmpltnTm",
    "pdctQty",
    "dscntAmt",
    "nonTaxbl",
    "tax",
    "ttlAmtExclgTax",
    "ttlAmtInclgTax",
    "netAmt"
})
public class FleetLineItem7 {

    @XmlElement(name = "Fuel")
    protected boolean fuel;
    @XmlElement(name = "SvcTp")
    @XmlSchemaType(name = "string")
    protected FleetServiceType1Code svcTp;
    @XmlElement(name = "FuelBrndCd")
    protected String fuelBrndCd;
    @XmlElement(name = "PdctCd")
    protected String pdctCd;
    @XmlElement(name = "PdctCtgy")
    protected String pdctCtgy;
    @XmlElement(name = "PdctQlfr")
    protected String pdctQlfr;
    @XmlElement(name = "PdctCdAssgnr")
    protected String pdctCdAssgnr;
    @XmlElement(name = "UnitPricTax")
    protected Boolean unitPricTax;
    @XmlElement(name = "UnitPric")
    protected BigDecimal unitPric;
    @XmlElement(name = "UnitOfMeasr")
    @XmlSchemaType(name = "string")
    protected UnitOfMeasure14Code unitOfMeasr;
    @XmlElement(name = "PctgDscntRate")
    protected BigDecimal pctgDscntRate;
    @XmlElement(name = "PerUnitDscntRate")
    protected BigDecimal perUnitDscntRate;
    @XmlElement(name = "FlatDscntRate")
    protected BigDecimal flatDscntRate;
    @XmlElement(name = "CostPlusUnitDscnt")
    protected BigDecimal costPlusUnitDscnt;
    @XmlElement(name = "CostPlusUnitDscntSgn")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code costPlusUnitDscntSgn;
    @XmlElement(name = "CostPlusUnitPric", required = true)
    protected BigDecimal costPlusUnitPric;
    @XmlElement(name = "TtlTmPlugdIn", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime ttlTmPlugdIn;
    @XmlElement(name = "TtlTmChrgg", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime ttlTmChrgg;
    @XmlElement(name = "ChrggStartTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime chrggStartTm;
    @XmlElement(name = "ChrggCmpltnTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime chrggCmpltnTm;
    @XmlElement(name = "PdctQty")
    protected BigDecimal pdctQty;
    @XmlElement(name = "DscntAmt")
    protected BigDecimal dscntAmt;
    @XmlElement(name = "NonTaxbl")
    protected Boolean nonTaxbl;
    @XmlElement(name = "Tax")
    protected List<Tax44> tax;
    @XmlElement(name = "TtlAmtExclgTax")
    protected BigDecimal ttlAmtExclgTax;
    @XmlElement(name = "TtlAmtInclgTax")
    protected BigDecimal ttlAmtInclgTax;
    @XmlElement(name = "NetAmt")
    protected BigDecimal netAmt;

    /**
     * Gets the value of the fuel property.
     * 
     */
    public boolean isFuel() {
        return fuel;
    }

    /**
     * Sets the value of the fuel property.
     * 
     */
    public FleetLineItem7 setFuel(boolean value) {
        this.fuel = value;
        return this;
    }

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link FleetServiceType1Code }
     *     
     */
    public FleetServiceType1Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FleetServiceType1Code }
     *     
     */
    public FleetLineItem7 setSvcTp(FleetServiceType1Code value) {
        this.svcTp = value;
        return this;
    }

    /**
     * Gets the value of the fuelBrndCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuelBrndCd() {
        return fuelBrndCd;
    }

    /**
     * Sets the value of the fuelBrndCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem7 setFuelBrndCd(String value) {
        this.fuelBrndCd = value;
        return this;
    }

    /**
     * Gets the value of the pdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCd() {
        return pdctCd;
    }

    /**
     * Sets the value of the pdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem7 setPdctCd(String value) {
        this.pdctCd = value;
        return this;
    }

    /**
     * Gets the value of the pdctCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCtgy() {
        return pdctCtgy;
    }

    /**
     * Sets the value of the pdctCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem7 setPdctCtgy(String value) {
        this.pdctCtgy = value;
        return this;
    }

    /**
     * Gets the value of the pdctQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctQlfr() {
        return pdctQlfr;
    }

    /**
     * Sets the value of the pdctQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem7 setPdctQlfr(String value) {
        this.pdctQlfr = value;
        return this;
    }

    /**
     * Gets the value of the pdctCdAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCdAssgnr() {
        return pdctCdAssgnr;
    }

    /**
     * Sets the value of the pdctCdAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem7 setPdctCdAssgnr(String value) {
        this.pdctCdAssgnr = value;
        return this;
    }

    /**
     * Gets the value of the unitPricTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnitPricTax() {
        return unitPricTax;
    }

    /**
     * Sets the value of the unitPricTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FleetLineItem7 setUnitPricTax(Boolean value) {
        this.unitPricTax = value;
        return this;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setUnitPric(BigDecimal value) {
        this.unitPric = value;
        return this;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure14Code }
     *     
     */
    public UnitOfMeasure14Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure14Code }
     *     
     */
    public FleetLineItem7 setUnitOfMeasr(UnitOfMeasure14Code value) {
        this.unitOfMeasr = value;
        return this;
    }

    /**
     * Gets the value of the pctgDscntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgDscntRate() {
        return pctgDscntRate;
    }

    /**
     * Sets the value of the pctgDscntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setPctgDscntRate(BigDecimal value) {
        this.pctgDscntRate = value;
        return this;
    }

    /**
     * Gets the value of the perUnitDscntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPerUnitDscntRate() {
        return perUnitDscntRate;
    }

    /**
     * Sets the value of the perUnitDscntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setPerUnitDscntRate(BigDecimal value) {
        this.perUnitDscntRate = value;
        return this;
    }

    /**
     * Gets the value of the flatDscntRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlatDscntRate() {
        return flatDscntRate;
    }

    /**
     * Sets the value of the flatDscntRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setFlatDscntRate(BigDecimal value) {
        this.flatDscntRate = value;
        return this;
    }

    /**
     * Gets the value of the costPlusUnitDscnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostPlusUnitDscnt() {
        return costPlusUnitDscnt;
    }

    /**
     * Sets the value of the costPlusUnitDscnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setCostPlusUnitDscnt(BigDecimal value) {
        this.costPlusUnitDscnt = value;
        return this;
    }

    /**
     * Gets the value of the costPlusUnitDscntSgn property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCostPlusUnitDscntSgn() {
        return costPlusUnitDscntSgn;
    }

    /**
     * Sets the value of the costPlusUnitDscntSgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public FleetLineItem7 setCostPlusUnitDscntSgn(CreditDebit3Code value) {
        this.costPlusUnitDscntSgn = value;
        return this;
    }

    /**
     * Gets the value of the costPlusUnitPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostPlusUnitPric() {
        return costPlusUnitPric;
    }

    /**
     * Sets the value of the costPlusUnitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setCostPlusUnitPric(BigDecimal value) {
        this.costPlusUnitPric = value;
        return this;
    }

    /**
     * Gets the value of the ttlTmPlugdIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getTtlTmPlugdIn() {
        return ttlTmPlugdIn;
    }

    /**
     * Sets the value of the ttlTmPlugdIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem7 setTtlTmPlugdIn(OffsetTime value) {
        this.ttlTmPlugdIn = value;
        return this;
    }

    /**
     * Gets the value of the ttlTmChrgg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getTtlTmChrgg() {
        return ttlTmChrgg;
    }

    /**
     * Sets the value of the ttlTmChrgg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem7 setTtlTmChrgg(OffsetTime value) {
        this.ttlTmChrgg = value;
        return this;
    }

    /**
     * Gets the value of the chrggStartTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getChrggStartTm() {
        return chrggStartTm;
    }

    /**
     * Sets the value of the chrggStartTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem7 setChrggStartTm(OffsetTime value) {
        this.chrggStartTm = value;
        return this;
    }

    /**
     * Gets the value of the chrggCmpltnTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getChrggCmpltnTm() {
        return chrggCmpltnTm;
    }

    /**
     * Sets the value of the chrggCmpltnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FleetLineItem7 setChrggCmpltnTm(OffsetTime value) {
        this.chrggCmpltnTm = value;
        return this;
    }

    /**
     * Gets the value of the pdctQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPdctQty() {
        return pdctQty;
    }

    /**
     * Sets the value of the pdctQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setPdctQty(BigDecimal value) {
        this.pdctQty = value;
        return this;
    }

    /**
     * Gets the value of the dscntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDscntAmt() {
        return dscntAmt;
    }

    /**
     * Sets the value of the dscntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setDscntAmt(BigDecimal value) {
        this.dscntAmt = value;
        return this;
    }

    /**
     * Gets the value of the nonTaxbl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonTaxbl() {
        return nonTaxbl;
    }

    /**
     * Sets the value of the nonTaxbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FleetLineItem7 setNonTaxbl(Boolean value) {
        this.nonTaxbl = value;
        return this;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax44 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax44> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the ttlAmtExclgTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmtExclgTax() {
        return ttlAmtExclgTax;
    }

    /**
     * Sets the value of the ttlAmtExclgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setTtlAmtExclgTax(BigDecimal value) {
        this.ttlAmtExclgTax = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmtInclgTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmtInclgTax() {
        return ttlAmtInclgTax;
    }

    /**
     * Sets the value of the ttlAmtInclgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setTtlAmtInclgTax(BigDecimal value) {
        this.ttlAmtInclgTax = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FleetLineItem7 setNetAmt(BigDecimal value) {
        this.netAmt = value;
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

    /**
     * Adds a new item to the tax list.
     * @see #getTax()
     * 
     */
    public FleetLineItem7 addTax(Tax44 tax) {
        getTax().add(tax);
        return this;
    }

}
