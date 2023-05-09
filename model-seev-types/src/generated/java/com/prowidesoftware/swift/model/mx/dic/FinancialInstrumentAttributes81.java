
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Description of the financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributes81", propOrder = {
    "finInstrmId",
    "plcOfListg",
    "dayCntBsis",
    "clssfctnTp",
    "dnmtnCcy",
    "nxtCpnDt",
    "xpryDt",
    "fltgRateFxgDt",
    "mtrtyDt",
    "isseDt",
    "nxtCllblDt",
    "putblDt",
    "dtdDt",
    "convsDt",
    "prvsFctr",
    "nxtFctr",
    "intrstRate",
    "nxtIntrstRate",
    "minNmnlQty",
    "ctrctSz"
})
public class FinancialInstrumentAttributes81 {

    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "PlcOfListg")
    protected MarketIdentification3Choice plcOfListg;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat4Choice dayCntBsis;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType32Choice clssfctnTp;
    @XmlElement(name = "DnmtnCcy")
    protected String dnmtnCcy;
    @XmlElement(name = "NxtCpnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate nxtCpnDt;
    @XmlElement(name = "XpryDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate xpryDt;
    @XmlElement(name = "FltgRateFxgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fltgRateFxgDt;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mtrtyDt;
    @XmlElement(name = "IsseDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate isseDt;
    @XmlElement(name = "NxtCllblDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate nxtCllblDt;
    @XmlElement(name = "PutblDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate putblDt;
    @XmlElement(name = "DtdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtdDt;
    @XmlElement(name = "ConvsDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate convsDt;
    @XmlElement(name = "PrvsFctr")
    protected BigDecimal prvsFctr;
    @XmlElement(name = "NxtFctr")
    protected BigDecimal nxtFctr;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "NxtIntrstRate")
    protected BigDecimal nxtIntrstRate;
    @XmlElement(name = "MinNmnlQty")
    protected FinancialInstrumentQuantity1Choice minNmnlQty;
    @XmlElement(name = "CtrctSz")
    protected FinancialInstrumentQuantity1Choice ctrctSz;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public FinancialInstrumentAttributes81 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public MarketIdentification3Choice getPlcOfListg() {
        return plcOfListg;
    }

    /**
     * Sets the value of the plcOfListg property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification3Choice }
     *     
     */
    public FinancialInstrumentAttributes81 setPlcOfListg(MarketIdentification3Choice value) {
        this.plcOfListg = value;
        return this;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public InterestComputationMethodFormat4Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public FinancialInstrumentAttributes81 setDayCntBsis(InterestComputationMethodFormat4Choice value) {
        this.dayCntBsis = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public ClassificationType32Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public FinancialInstrumentAttributes81 setClssfctnTp(ClassificationType32Choice value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the dnmtnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnCcy() {
        return dnmtnCcy;
    }

    /**
     * Sets the value of the dnmtnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes81 setDnmtnCcy(String value) {
        this.dnmtnCcy = value;
        return this;
    }

    /**
     * Gets the value of the nxtCpnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getNxtCpnDt() {
        return nxtCpnDt;
    }

    /**
     * Sets the value of the nxtCpnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes81 setNxtCpnDt(LocalDate value) {
        this.nxtCpnDt = value;
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
    public LocalDate getXpryDt() {
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
    public FinancialInstrumentAttributes81 setXpryDt(LocalDate value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the fltgRateFxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFltgRateFxgDt() {
        return fltgRateFxgDt;
    }

    /**
     * Sets the value of the fltgRateFxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes81 setFltgRateFxgDt(LocalDate value) {
        this.fltgRateFxgDt = value;
        return this;
    }

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
    public FinancialInstrumentAttributes81 setMtrtyDt(LocalDate value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes81 setIsseDt(LocalDate value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the nxtCllblDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getNxtCllblDt() {
        return nxtCllblDt;
    }

    /**
     * Sets the value of the nxtCllblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes81 setNxtCllblDt(LocalDate value) {
        this.nxtCllblDt = value;
        return this;
    }

    /**
     * Gets the value of the putblDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getPutblDt() {
        return putblDt;
    }

    /**
     * Sets the value of the putblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes81 setPutblDt(LocalDate value) {
        this.putblDt = value;
        return this;
    }

    /**
     * Gets the value of the dtdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtdDt() {
        return dtdDt;
    }

    /**
     * Sets the value of the dtdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributes81 setDtdDt(LocalDate value) {
        this.dtdDt = value;
        return this;
    }

    /**
     * Gets the value of the convsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getConvsDt() {
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
    public FinancialInstrumentAttributes81 setConvsDt(LocalDate value) {
        this.convsDt = value;
        return this;
    }

    /**
     * Gets the value of the prvsFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrvsFctr() {
        return prvsFctr;
    }

    /**
     * Sets the value of the prvsFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes81 setPrvsFctr(BigDecimal value) {
        this.prvsFctr = value;
        return this;
    }

    /**
     * Gets the value of the nxtFctr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNxtFctr() {
        return nxtFctr;
    }

    /**
     * Sets the value of the nxtFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes81 setNxtFctr(BigDecimal value) {
        this.nxtFctr = value;
        return this;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes81 setIntrstRate(BigDecimal value) {
        this.intrstRate = value;
        return this;
    }

    /**
     * Gets the value of the nxtIntrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNxtIntrstRate() {
        return nxtIntrstRate;
    }

    /**
     * Sets the value of the nxtIntrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public FinancialInstrumentAttributes81 setNxtIntrstRate(BigDecimal value) {
        this.nxtIntrstRate = value;
        return this;
    }

    /**
     * Gets the value of the minNmnlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinNmnlQty() {
        return minNmnlQty;
    }

    /**
     * Sets the value of the minNmnlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentAttributes81 setMinNmnlQty(FinancialInstrumentQuantity1Choice value) {
        this.minNmnlQty = value;
        return this;
    }

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentAttributes81 setCtrctSz(FinancialInstrumentQuantity1Choice value) {
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
