
package com.prowidesoftware.swift.model.mx.dic;

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
 * Provides additional information regarding corporate action details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionSD4", propOrder = {
    "plcAndNm",
    "newParVal",
    "odParVal",
    "xchgFeeReqrdFlg",
    "ctdnShellFlg",
    "mustAllShrsBeSubmittdFlg",
    "ltryDtls",
    "qlfdDvddTaxInd",
    "srvvgCpny",
    "frgnIncmSrcFlg"
})
public class CorporateActionSD4 {

    @XmlElement(name = "PlcAndNm", required = true)
    protected String plcAndNm;
    @XmlElement(name = "NewParVal")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount newParVal;
    @XmlElement(name = "OdParVal")
    protected RestrictedFINActiveCurrencyAnd13DecimalAmount odParVal;
    @XmlElement(name = "XchgFeeReqrdFlg")
    protected Boolean xchgFeeReqrdFlg;
    @XmlElement(name = "CtdnShellFlg")
    protected Boolean ctdnShellFlg;
    @XmlElement(name = "MustAllShrsBeSubmittdFlg")
    protected Boolean mustAllShrsBeSubmittdFlg;
    @XmlElement(name = "LtryDtls")
    protected CorporateActionSD6 ltryDtls;
    @XmlElement(name = "QlfdDvddTaxInd")
    @XmlSchemaType(name = "string")
    protected QualifiedDividendTax1Code qlfdDvddTaxInd;
    @XmlElement(name = "SrvvgCpny")
    protected String srvvgCpny;
    @XmlElement(name = "FrgnIncmSrcFlg")
    protected Boolean frgnIncmSrcFlg;

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
    public CorporateActionSD4 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the newParVal property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getNewParVal() {
        return newParVal;
    }

    /**
     * Sets the value of the newParVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public CorporateActionSD4 setNewParVal(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.newParVal = value;
        return this;
    }

    /**
     * Gets the value of the odParVal property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public RestrictedFINActiveCurrencyAnd13DecimalAmount getOdParVal() {
        return odParVal;
    }

    /**
     * Sets the value of the odParVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictedFINActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public CorporateActionSD4 setOdParVal(RestrictedFINActiveCurrencyAnd13DecimalAmount value) {
        this.odParVal = value;
        return this;
    }

    /**
     * Gets the value of the xchgFeeReqrdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXchgFeeReqrdFlg() {
        return xchgFeeReqrdFlg;
    }

    /**
     * Sets the value of the xchgFeeReqrdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD4 setXchgFeeReqrdFlg(Boolean value) {
        this.xchgFeeReqrdFlg = value;
        return this;
    }

    /**
     * Gets the value of the ctdnShellFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtdnShellFlg() {
        return ctdnShellFlg;
    }

    /**
     * Sets the value of the ctdnShellFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD4 setCtdnShellFlg(Boolean value) {
        this.ctdnShellFlg = value;
        return this;
    }

    /**
     * Gets the value of the mustAllShrsBeSubmittdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustAllShrsBeSubmittdFlg() {
        return mustAllShrsBeSubmittdFlg;
    }

    /**
     * Sets the value of the mustAllShrsBeSubmittdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD4 setMustAllShrsBeSubmittdFlg(Boolean value) {
        this.mustAllShrsBeSubmittdFlg = value;
        return this;
    }

    /**
     * Gets the value of the ltryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD6 }
     *     
     */
    public CorporateActionSD6 getLtryDtls() {
        return ltryDtls;
    }

    /**
     * Sets the value of the ltryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD6 }
     *     
     */
    public CorporateActionSD4 setLtryDtls(CorporateActionSD6 value) {
        this.ltryDtls = value;
        return this;
    }

    /**
     * Gets the value of the qlfdDvddTaxInd property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedDividendTax1Code }
     *     
     */
    public QualifiedDividendTax1Code getQlfdDvddTaxInd() {
        return qlfdDvddTaxInd;
    }

    /**
     * Sets the value of the qlfdDvddTaxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedDividendTax1Code }
     *     
     */
    public CorporateActionSD4 setQlfdDvddTaxInd(QualifiedDividendTax1Code value) {
        this.qlfdDvddTaxInd = value;
        return this;
    }

    /**
     * Gets the value of the srvvgCpny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrvvgCpny() {
        return srvvgCpny;
    }

    /**
     * Sets the value of the srvvgCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionSD4 setSrvvgCpny(String value) {
        this.srvvgCpny = value;
        return this;
    }

    /**
     * Gets the value of the frgnIncmSrcFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrgnIncmSrcFlg() {
        return frgnIncmSrcFlg;
    }

    /**
     * Sets the value of the frgnIncmSrcFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public CorporateActionSD4 setFrgnIncmSrcFlg(Boolean value) {
        this.frgnIncmSrcFlg = value;
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
