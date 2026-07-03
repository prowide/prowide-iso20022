
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
 * Order to invest the investor's principal in an investment fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionMultipleOrder5", propOrder = {
    "mstrRef",
    "plcOfTrad",
    "xpryDtTm",
    "invstmtAcctDtls",
    "indvOrdrDtls"
})
public class SubscriptionMultipleOrder5 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification3Choice plcOfTrad;
    @XmlElement(name = "XpryDtTm")
    protected DateAndDateTimeChoice xpryDtTm;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount33 invstmtAcctDtls;
    @XmlElement(name = "IndvOrdrDtls", required = true)
    protected SubscriptionOrder11 indvOrdrDtls;

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
    public SubscriptionMultipleOrder5 setMstrRef(String value) {
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
    public SubscriptionMultipleOrder5 setPlcOfTrad(PlaceOfTradeIdentification3Choice value) {
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
    public SubscriptionMultipleOrder5 setXpryDtTm(DateAndDateTimeChoice value) {
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
    public SubscriptionMultipleOrder5 setInvstmtAcctDtls(InvestmentAccount33 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the indvOrdrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionOrder11 }
     *     
     */
    public SubscriptionOrder11 getIndvOrdrDtls() {
        return indvOrdrDtls;
    }

    /**
     * Sets the value of the indvOrdrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionOrder11 }
     *     
     */
    public SubscriptionMultipleOrder5 setIndvOrdrDtls(SubscriptionOrder11 value) {
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
