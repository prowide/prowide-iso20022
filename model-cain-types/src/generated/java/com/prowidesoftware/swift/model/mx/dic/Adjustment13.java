
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Describes each adjustment made to the original price.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adjustment13", propOrder = {
    "tp",
    "addtlTp",
    "desc",
    "rsn",
    "prmtnCd",
    "pctg",
    "amt",
    "taxOnOrgnlAmt"
})
public class Adjustment13 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "AddtlTp")
    protected String addtlTp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "Rsn")
    protected String rsn;
    @XmlElement(name = "PrmtnCd")
    protected String prmtnCd;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Amt")
    protected BigDecimal amt;
    @XmlElement(name = "TaxOnOrgnlAmt")
    protected Boolean taxOnOrgnlAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Adjustment13 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the addtlTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTp() {
        return addtlTp;
    }

    /**
     * Sets the value of the addtlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Adjustment13 setAddtlTp(String value) {
        this.addtlTp = value;
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
    public Adjustment13 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Adjustment13 setRsn(String value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the prmtnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmtnCd() {
        return prmtnCd;
    }

    /**
     * Sets the value of the prmtnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Adjustment13 setPrmtnCd(String value) {
        this.prmtnCd = value;
        return this;
    }

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Adjustment13 setPctg(BigDecimal value) {
        this.pctg = value;
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
    public Adjustment13 setAmt(BigDecimal value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the taxOnOrgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxOnOrgnlAmt() {
        return taxOnOrgnlAmt;
    }

    /**
     * Sets the value of the taxOnOrgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Adjustment13 setTaxOnOrgnlAmt(Boolean value) {
        this.taxOnOrgnlAmt = value;
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
