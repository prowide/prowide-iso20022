
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
 * Provides for reporting details of non-equity instruments as part of transparency calculations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport16", propOrder = {
    "techRcrdId",
    "id",
    "fullNm",
    "tradgVn",
    "rptgDt",
    "mtrtyDt",
    "finInstrmClssfctn",
    "undrlygInstrmAsstClss",
    "derivCtrctTp",
    "bd",
    "emssnAllwncTp",
    "deriv"
})
public class TransparencyDataReport16 {

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
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate mtrtyDt;
    @XmlElement(name = "FinInstrmClssfctn", required = true)
    @XmlSchemaType(name = "string")
    protected NonEquityInstrumentReportingClassification1Code finInstrmClssfctn;
    @XmlElement(name = "UndrlygInstrmAsstClss")
    @XmlSchemaType(name = "string")
    protected ProductType5Code undrlygInstrmAsstClss;
    @XmlElement(name = "DerivCtrctTp")
    @XmlSchemaType(name = "string")
    protected FinancialInstrumentContractType1Code derivCtrctTp;
    @XmlElement(name = "Bd")
    protected DebtInstrument5 bd;
    @XmlElement(name = "EmssnAllwncTp")
    @XmlSchemaType(name = "string")
    protected EmissionAllowanceProductType2Code emssnAllwncTp;
    @XmlElement(name = "Deriv")
    protected Derivative3Choice deriv;

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
    public TransparencyDataReport16 setTechRcrdId(String value) {
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
    public TransparencyDataReport16 setId(String value) {
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
    public TransparencyDataReport16 setFullNm(String value) {
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
    public TransparencyDataReport16 setTradgVn(String value) {
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
    public TransparencyDataReport16 setRptgDt(LocalDate value) {
        this.rptgDt = value;
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
    public TransparencyDataReport16 setMtrtyDt(LocalDate value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link NonEquityInstrumentReportingClassification1Code }
     *     
     */
    public NonEquityInstrumentReportingClassification1Code getFinInstrmClssfctn() {
        return finInstrmClssfctn;
    }

    /**
     * Sets the value of the finInstrmClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEquityInstrumentReportingClassification1Code }
     *     
     */
    public TransparencyDataReport16 setFinInstrmClssfctn(NonEquityInstrumentReportingClassification1Code value) {
        this.finInstrmClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrmAsstClss property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType5Code }
     *     
     */
    public ProductType5Code getUndrlygInstrmAsstClss() {
        return undrlygInstrmAsstClss;
    }

    /**
     * Sets the value of the undrlygInstrmAsstClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType5Code }
     *     
     */
    public TransparencyDataReport16 setUndrlygInstrmAsstClss(ProductType5Code value) {
        this.undrlygInstrmAsstClss = value;
        return this;
    }

    /**
     * Gets the value of the derivCtrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentContractType1Code }
     *     
     */
    public FinancialInstrumentContractType1Code getDerivCtrctTp() {
        return derivCtrctTp;
    }

    /**
     * Sets the value of the derivCtrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentContractType1Code }
     *     
     */
    public TransparencyDataReport16 setDerivCtrctTp(FinancialInstrumentContractType1Code value) {
        this.derivCtrctTp = value;
        return this;
    }

    /**
     * Gets the value of the bd property.
     * 
     * @return
     *     possible object is
     *     {@link DebtInstrument5 }
     *     
     */
    public DebtInstrument5 getBd() {
        return bd;
    }

    /**
     * Sets the value of the bd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtInstrument5 }
     *     
     */
    public TransparencyDataReport16 setBd(DebtInstrument5 value) {
        this.bd = value;
        return this;
    }

    /**
     * Gets the value of the emssnAllwncTp property.
     * 
     * @return
     *     possible object is
     *     {@link EmissionAllowanceProductType2Code }
     *     
     */
    public EmissionAllowanceProductType2Code getEmssnAllwncTp() {
        return emssnAllwncTp;
    }

    /**
     * Sets the value of the emssnAllwncTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmissionAllowanceProductType2Code }
     *     
     */
    public TransparencyDataReport16 setEmssnAllwncTp(EmissionAllowanceProductType2Code value) {
        this.emssnAllwncTp = value;
        return this;
    }

    /**
     * Gets the value of the deriv property.
     * 
     * @return
     *     possible object is
     *     {@link Derivative3Choice }
     *     
     */
    public Derivative3Choice getDeriv() {
        return deriv;
    }

    /**
     * Sets the value of the deriv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Derivative3Choice }
     *     
     */
    public TransparencyDataReport16 setDeriv(Derivative3Choice value) {
        this.deriv = value;
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
