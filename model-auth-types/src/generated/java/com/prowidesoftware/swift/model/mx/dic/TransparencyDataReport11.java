
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
 * Provides for reporting qualitative details of equity instruments as part of Transparency calculations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport11", propOrder = {
    "techRcrdId",
    "id",
    "fullNm",
    "tradgVn",
    "rptgDt",
    "finInstrmClssfctn",
    "nbOutsdngInstrms",
    "hldgsExcdgTtlVtngRghtThrshld",
    "issncSz",
    "instrmPric"
})
public class TransparencyDataReport11 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "FullNm")
    protected String fullNm;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "RptgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate rptgDt;
    @XmlElement(name = "FinInstrmClssfctn", required = true)
    @XmlSchemaType(name = "string")
    protected EquityInstrumentReportingClassification1Code finInstrmClssfctn;
    @XmlElement(name = "NbOutsdngInstrms")
    protected BigDecimal nbOutsdngInstrms;
    @XmlElement(name = "HldgsExcdgTtlVtngRghtThrshld")
    protected BigDecimal hldgsExcdgTtlVtngRghtThrshld;
    @XmlElement(name = "IssncSz")
    protected ActiveCurrencyAndAmount issncSz;
    @XmlElement(name = "InstrmPric")
    protected ActiveCurrencyAnd13DecimalAmount instrmPric;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport11 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport11 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the fullNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * Sets the value of the fullNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport11 setFullNm(String value) {
        this.fullNm = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport11 setTradgVn(String value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the rptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getRptgDt() {
        return rptgDt;
    }

    /**
     * Sets the value of the rptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransparencyDataReport11 setRptgDt(LocalDate value) {
        this.rptgDt = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link EquityInstrumentReportingClassification1Code }
     *     
     */
    public EquityInstrumentReportingClassification1Code getFinInstrmClssfctn() {
        return finInstrmClssfctn;
    }

    /**
     * Sets the value of the finInstrmClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityInstrumentReportingClassification1Code }
     *     
     */
    public TransparencyDataReport11 setFinInstrmClssfctn(EquityInstrumentReportingClassification1Code value) {
        this.finInstrmClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the nbOutsdngInstrms property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOutsdngInstrms() {
        return nbOutsdngInstrms;
    }

    /**
     * Sets the value of the nbOutsdngInstrms property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransparencyDataReport11 setNbOutsdngInstrms(BigDecimal value) {
        this.nbOutsdngInstrms = value;
        return this;
    }

    /**
     * Gets the value of the hldgsExcdgTtlVtngRghtThrshld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHldgsExcdgTtlVtngRghtThrshld() {
        return hldgsExcdgTtlVtngRghtThrshld;
    }

    /**
     * Sets the value of the hldgsExcdgTtlVtngRghtThrshld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransparencyDataReport11 setHldgsExcdgTtlVtngRghtThrshld(BigDecimal value) {
        this.hldgsExcdgTtlVtngRghtThrshld = value;
        return this;
    }

    /**
     * Gets the value of the issncSz property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIssncSz() {
        return issncSz;
    }

    /**
     * Sets the value of the issncSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TransparencyDataReport11 setIssncSz(ActiveCurrencyAndAmount value) {
        this.issncSz = value;
        return this;
    }

    /**
     * Gets the value of the instrmPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getInstrmPric() {
        return instrmPric;
    }

    /**
     * Sets the value of the instrmPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TransparencyDataReport11 setInstrmPric(ActiveCurrencyAnd13DecimalAmount value) {
        this.instrmPric = value;
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
