
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the derivative instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivativeInstrument5", propOrder = {
    "xpryDt",
    "pricMltplr",
    "undrlygInstrm",
    "optnTp",
    "strkPric",
    "optnExrcStyle",
    "dlvryTp",
    "asstClssSpcfcAttrbts"
})
public class DerivativeInstrument5 {

    @XmlElement(name = "XpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "PricMltplr")
    protected BigDecimal pricMltplr;
    @XmlElement(name = "UndrlygInstrm")
    protected FinancialInstrumentIdentification5Choice undrlygInstrm;
    @XmlElement(name = "OptnTp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code optnTp;
    @XmlElement(name = "StrkPric")
    protected SecuritiesTransactionPrice4Choice strkPric;
    @XmlElement(name = "OptnExrcStyle")
    @XmlSchemaType(name = "string")
    protected OptionStyle7Code optnExrcStyle;
    @XmlElement(name = "DlvryTp")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType4Code dlvryTp;
    @XmlElement(name = "AsstClssSpcfcAttrbts")
    protected AssetClass2 asstClssSpcfcAttrbts;

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public DerivativeInstrument5 setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the pricMltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricMltplr() {
        return pricMltplr;
    }

    /**
     * Sets the value of the pricMltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DerivativeInstrument5 setPricMltplr(BigDecimal value) {
        this.pricMltplr = value;
        return this;
    }

    /**
     * Gets the value of the undrlygInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentIdentification5Choice }
     *     
     */
    public FinancialInstrumentIdentification5Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Sets the value of the undrlygInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentIdentification5Choice }
     *     
     */
    public DerivativeInstrument5 setUndrlygInstrm(FinancialInstrumentIdentification5Choice value) {
        this.undrlygInstrm = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionType2Code getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType2Code }
     *     
     */
    public DerivativeInstrument5 setOptnTp(OptionType2Code value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice4Choice }
     *     
     */
    public SecuritiesTransactionPrice4Choice getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice4Choice }
     *     
     */
    public DerivativeInstrument5 setStrkPric(SecuritiesTransactionPrice4Choice value) {
        this.strkPric = value;
        return this;
    }

    /**
     * Gets the value of the optnExrcStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle7Code }
     *     
     */
    public OptionStyle7Code getOptnExrcStyle() {
        return optnExrcStyle;
    }

    /**
     * Sets the value of the optnExrcStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle7Code }
     *     
     */
    public DerivativeInstrument5 setOptnExrcStyle(OptionStyle7Code value) {
        this.optnExrcStyle = value;
        return this;
    }

    /**
     * Gets the value of the dlvryTp property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public PhysicalTransferType4Code getDlvryTp() {
        return dlvryTp;
    }

    /**
     * Sets the value of the dlvryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType4Code }
     *     
     */
    public DerivativeInstrument5 setDlvryTp(PhysicalTransferType4Code value) {
        this.dlvryTp = value;
        return this;
    }

    /**
     * Gets the value of the asstClssSpcfcAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClass2 }
     *     
     */
    public AssetClass2 getAsstClssSpcfcAttrbts() {
        return asstClssSpcfcAttrbts;
    }

    /**
     * Sets the value of the asstClssSpcfcAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClass2 }
     *     
     */
    public DerivativeInstrument5 setAsstClssSpcfcAttrbts(AssetClass2 value) {
        this.asstClssSpcfcAttrbts = value;
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
