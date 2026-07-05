
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
 * Instruction from an investor to sell investment fund units back to the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionMultipleOrder5", propOrder = {
    "mstrRef",
    "plcOfTrad",
    "xpryDtTm",
    "invstmtAcctDtls",
    "indvOrdrDtls"
})
public class RedemptionMultipleOrder5 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification3Choice plcOfTrad;
    @XmlElement(name = "XpryDtTm")
    protected DateAndDateTimeChoice xpryDtTm;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount33 invstmtAcctDtls;
    @XmlElement(name = "IndvOrdrDtls", required = true)
    protected RedemptionOrder11 indvOrdrDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionMultipleOrder5 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification3Choice }
     *     
     */
    public PlaceOfTradeIdentification3Choice getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification3Choice }
     *     
     */
    public RedemptionMultipleOrder5 setPlcOfTrad(PlaceOfTradeIdentification3Choice value) {
        this.plcOfTrad = value;
        return this;
    }

    /**
     * Gets the value of the xpryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpryDtTm() {
        return xpryDtTm;
    }

    /**
     * Sets the value of the xpryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public RedemptionMultipleOrder5 setXpryDtTm(DateAndDateTimeChoice value) {
        this.xpryDtTm = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount33 }
     *     
     */
    public InvestmentAccount33 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount33 }
     *     
     */
    public RedemptionMultipleOrder5 setInvstmtAcctDtls(InvestmentAccount33 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the indvOrdrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionOrder11 }
     *     
     */
    public RedemptionOrder11 getIndvOrdrDtls() {
        return indvOrdrDtls;
    }

    /**
     * Sets the value of the indvOrdrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionOrder11 }
     *     
     */
    public RedemptionMultipleOrder5 setIndvOrdrDtls(RedemptionOrder11 value) {
        this.indvOrdrDtls = value;
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
