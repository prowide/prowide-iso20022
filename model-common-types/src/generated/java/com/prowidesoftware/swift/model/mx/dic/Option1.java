
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Contracts which grant to the holder either the privilege to purchase or the privilege to sell the assets specified
 * at a predetermined price or formula at or within a time in the future.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option1", propOrder = {
    "convsDt",
    "strkPric",
    "xpryDt",
    "minExrcblMltplQty",
    "minExrcblQty",
    "convsPrd",
    "optnStyle",
    "optnTp",
    "strkVal",
    "strkMltplr",
    "instrmAssgnmtMtd",
    "vrsnNb",
    "sttlStyle",
    "xpryLctn",
    "stdstn",
    "tradgPtyRole",
    "ctrctSz"
})
public class Option1 {

    @XmlElement(name = "ConvsDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime convsDt;
    @XmlElement(name = "StrkPric")
    protected Price1 strkPric;
    @XmlElement(name = "XpryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime xpryDt;
    @XmlElement(name = "MinExrcblMltplQty")
    protected FinancialInstrumentQuantityChoice minExrcblMltplQty;
    @XmlElement(name = "MinExrcblQty")
    protected FinancialInstrumentQuantityChoice minExrcblQty;
    @XmlElement(name = "ConvsPrd")
    protected DateTimePeriodChoice convsPrd;
    @XmlElement(name = "OptnStyle")
    protected OptionStyle1Choice optnStyle;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType1Code optnTp;
    @XmlElement(name = "StrkVal")
    protected BigDecimal strkVal;
    @XmlElement(name = "StrkMltplr")
    protected BigDecimal strkMltplr;
    @XmlElement(name = "InstrmAssgnmtMtd")
    @XmlSchemaType(name = "string")
    protected AssignmentMethod1Code instrmAssgnmtMtd;
    @XmlElement(name = "VrsnNb")
    protected BigDecimal vrsnNb;
    @XmlElement(name = "SttlStyle")
    @XmlSchemaType(name = "string")
    protected SettleStyle1Code sttlStyle;
    @XmlElement(name = "XpryLctn")
    protected String xpryLctn;
    @XmlElement(name = "Stdstn")
    @XmlSchemaType(name = "string")
    protected StandardisationCode stdstn;
    @XmlElement(name = "TradgPtyRole", required = true)
    @XmlSchemaType(name = "string")
    protected OptionParty1Code tradgPtyRole;
    @XmlElement(name = "CtrctSz", required = true)
    protected BigDecimal ctrctSz;

    /**
     * Gets the value of the convsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getConvsDt() {
        return convsDt;
    }

    /**
     * Sets the value of the convsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option1 setConvsDt(OffsetDateTime value) {
        this.convsDt = value;
        return this;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public Option1 setStrkPric(Price1 value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option1 setXpryDt(OffsetDateTime value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblMltplQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getMinExrcblMltplQty() {
        return minExrcblMltplQty;
    }

    /**
     * Sets the value of the minExrcblMltplQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public Option1 setMinExrcblMltplQty(FinancialInstrumentQuantityChoice value) {
        this.minExrcblMltplQty = value;
        return this;
    }

    /**
     * Gets the value of the minExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public FinancialInstrumentQuantityChoice getMinExrcblQty() {
        return minExrcblQty;
    }

    /**
     * Sets the value of the minExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantityChoice }
     *     
     */
    public Option1 setMinExrcblQty(FinancialInstrumentQuantityChoice value) {
        this.minExrcblQty = value;
        return this;
    }

    /**
     * Gets the value of the convsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateTimePeriodChoice getConvsPrd() {
        return convsPrd;
    }

    /**
     * Sets the value of the convsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public Option1 setConvsPrd(DateTimePeriodChoice value) {
        this.convsPrd = value;
        return this;
    }

    /**
     * Gets the value of the optnStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle1Choice }
     *     
     */
    public OptionStyle1Choice getOptnStyle() {
        return optnStyle;
    }

    /**
     * Sets the value of the optnStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle1Choice }
     *     
     */
    public Option1 setOptnStyle(OptionStyle1Choice value) {
        this.optnStyle = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType1Code }
     *     
     */
    public OptionType1Code getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType1Code }
     *     
     */
    public Option1 setOptnTp(OptionType1Code value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the strkVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrkVal() {
        return strkVal;
    }

    /**
     * Sets the value of the strkVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Option1 setStrkVal(BigDecimal value) {
        this.strkVal = value;
        return this;
    }

    /**
     * Gets the value of the strkMltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrkMltplr() {
        return strkMltplr;
    }

    /**
     * Sets the value of the strkMltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Option1 setStrkMltplr(BigDecimal value) {
        this.strkMltplr = value;
        return this;
    }

    /**
     * Gets the value of the instrmAssgnmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentMethod1Code }
     *     
     */
    public AssignmentMethod1Code getInstrmAssgnmtMtd() {
        return instrmAssgnmtMtd;
    }

    /**
     * Sets the value of the instrmAssgnmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentMethod1Code }
     *     
     */
    public Option1 setInstrmAssgnmtMtd(AssignmentMethod1Code value) {
        this.instrmAssgnmtMtd = value;
        return this;
    }

    /**
     * Gets the value of the vrsnNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsnNb() {
        return vrsnNb;
    }

    /**
     * Sets the value of the vrsnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Option1 setVrsnNb(BigDecimal value) {
        this.vrsnNb = value;
        return this;
    }

    /**
     * Gets the value of the sttlStyle property.
     * 
     * @return
     *     possible object is
     *     {@link SettleStyle1Code }
     *     
     */
    public SettleStyle1Code getSttlStyle() {
        return sttlStyle;
    }

    /**
     * Sets the value of the sttlStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettleStyle1Code }
     *     
     */
    public Option1 setSttlStyle(SettleStyle1Code value) {
        this.sttlStyle = value;
        return this;
    }

    /**
     * Gets the value of the xpryLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryLctn() {
        return xpryLctn;
    }

    /**
     * Sets the value of the xpryLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Option1 setXpryLctn(String value) {
        this.xpryLctn = value;
        return this;
    }

    /**
     * Gets the value of the stdstn property.
     * 
     * @return
     *     possible object is
     *     {@link StandardisationCode }
     *     
     */
    public StandardisationCode getStdstn() {
        return stdstn;
    }

    /**
     * Sets the value of the stdstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardisationCode }
     *     
     */
    public Option1 setStdstn(StandardisationCode value) {
        this.stdstn = value;
        return this;
    }

    /**
     * Gets the value of the tradgPtyRole property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty1Code }
     *     
     */
    public OptionParty1Code getTradgPtyRole() {
        return tradgPtyRole;
    }

    /**
     * Sets the value of the tradgPtyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty1Code }
     *     
     */
    public Option1 setTradgPtyRole(OptionParty1Code value) {
        this.tradgPtyRole = value;
        return this;
    }

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Option1 setCtrctSz(BigDecimal value) {
        this.ctrctSz = value;
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
