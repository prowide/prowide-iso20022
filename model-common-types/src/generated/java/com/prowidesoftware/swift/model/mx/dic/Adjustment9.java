
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
@XmlType(name = "Adjustment9", propOrder = {
    "tp",
    "addtlTp",
    "desc",
    "rsn",
    "prmtnCd",
    "pctg",
    "adjstmntAmt",
    "taxClctdOnOrgnlAmt"
})
public class Adjustment9 {

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
    @XmlElement(name = "AdjstmntAmt")
    protected BigDecimal adjstmntAmt;
    @XmlElement(name = "TaxClctdOnOrgnlAmt")
    protected Boolean taxClctdOnOrgnlAmt;

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
    public Adjustment9 setTp(String value) {
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
    public Adjustment9 setAddtlTp(String value) {
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
    public Adjustment9 setDesc(String value) {
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
    public Adjustment9 setRsn(String value) {
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
    public Adjustment9 setPrmtnCd(String value) {
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
    public Adjustment9 setPctg(BigDecimal value) {
        this.pctg = value;
        return this;
    }

    /**
     * Gets the value of the adjstmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjstmntAmt() {
        return adjstmntAmt;
    }

    /**
     * Sets the value of the adjstmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Adjustment9 setAdjstmntAmt(BigDecimal value) {
        this.adjstmntAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxClctdOnOrgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxClctdOnOrgnlAmt() {
        return taxClctdOnOrgnlAmt;
    }

    /**
     * Sets the value of the taxClctdOnOrgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Adjustment9 setTaxClctdOnOrgnlAmt(Boolean value) {
        this.taxClctdOnOrgnlAmt = value;
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
