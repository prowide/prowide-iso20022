
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details on transaction and conducting counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransactionIdentification9", propOrder = {
    "rptgCtrPty",
    "rptSubmitgNtty"
})
public class TradeTransactionIdentification9 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected OrganisationIdentification9Choice rptgCtrPty;
    @XmlElement(name = "RptSubmitgNtty", required = true)
    protected OrganisationIdentification9Choice rptSubmitgNtty;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public TradeTransactionIdentification9 setRptgCtrPty(OrganisationIdentification9Choice value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the rptSubmitgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getRptSubmitgNtty() {
        return rptSubmitgNtty;
    }

    /**
     * Sets the value of the rptSubmitgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public TradeTransactionIdentification9 setRptSubmitgNtty(OrganisationIdentification9Choice value) {
        this.rptSubmitgNtty = value;
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
