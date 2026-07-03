
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides additional information regarding underlying security details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributesSD7", propOrder = {
    "plcAndNm",
    "issrDesc",
    "ctryOfIncorprtn",
    "pmryXchgFlg",
    "secRegdFlg"
})
public class FinancialInstrumentAttributesSD7 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "IssrDesc")
    protected String issrDesc;
    @XmlElement(name = "CtryOfIncorprtn")
    protected String ctryOfIncorprtn;
    @XmlElement(name = "PmryXchgFlg")
    protected Boolean pmryXchgFlg;
    @XmlElement(name = "SECRegdFlg")
    protected Boolean secRegdFlg;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributesSD7 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the issrDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrDesc() {
        return issrDesc;
    }

    /**
     * Sets the value of the issrDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributesSD7 setIssrDesc(String value) {
        this.issrDesc = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfIncorprtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIncorprtn() {
        return ctryOfIncorprtn;
    }

    /**
     * Sets the value of the ctryOfIncorprtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributesSD7 setCtryOfIncorprtn(String value) {
        this.ctryOfIncorprtn = value;
        return this;
    }

    /**
     * Gets the value of the pmryXchgFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmryXchgFlg() {
        return pmryXchgFlg;
    }

    /**
     * Sets the value of the pmryXchgFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributesSD7 setPmryXchgFlg(Boolean value) {
        this.pmryXchgFlg = value;
        return this;
    }

    /**
     * Gets the value of the secRegdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSECRegdFlg() {
        return secRegdFlg;
    }

    /**
     * Sets the value of the secRegdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public FinancialInstrumentAttributesSD7 setSECRegdFlg(Boolean value) {
        this.secRegdFlg = value;
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
