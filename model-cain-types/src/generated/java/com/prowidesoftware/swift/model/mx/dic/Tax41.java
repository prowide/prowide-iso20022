
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Description of tax.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tax41", propOrder = {
    "tp",
    "othrTp",
    "desc",
    "xmptn",
    "xmptRsn",
    "amt",
    "rate",
    "inclInTtl",
    "cdtDbt"
})
public class Tax41 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected AddendumTaxType3Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Xmptn")
    protected Boolean xmptn;
    @XmlElement(name = "XmptRsn")
    protected String xmptRsn;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "InclInTtl")
    protected Boolean inclInTtl;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AddendumTaxType3Code }
     *     
     */
    public AddendumTaxType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddendumTaxType3Code }
     *     
     */
    public Tax41 setTp(AddendumTaxType3Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Tax41 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Tax41 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the xmptn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXmptn() {
        return xmptn;
    }

    /**
     * Sets the value of the xmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Tax41 setXmptn(Boolean value) {
        this.xmptn = value;
        return this;
    }

    /**
     * Gets the value of the xmptRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmptRsn() {
        return xmptRsn;
    }

    /**
     * Sets the value of the xmptRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Tax41 setXmptRsn(String value) {
        this.xmptRsn = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Tax41 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Tax41 setRate(BigDecimal value) {
        this.rate = value;
        return this;
    }

    /**
     * Gets the value of the inclInTtl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInclInTtl() {
        return inclInTtl;
    }

    /**
     * Sets the value of the inclInTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Tax41 setInclInTtl(Boolean value) {
        this.inclInTtl = value;
        return this;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public Tax41 setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
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
