
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
@XmlType(name = "TradeTransactionIdentification17", propOrder = {
    "techRcrdId",
    "rptgCtrPty",
    "rptSubmitgNtty",
    "nttyRspnsblForRpt"
})
public class TradeTransactionIdentification17 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "RptgCtrPty", required = true)
    protected OrganisationIdentification15Choice rptgCtrPty;
    @XmlElement(name = "RptSubmitgNtty", required = true)
    protected OrganisationIdentification15Choice rptSubmitgNtty;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected OrganisationIdentification15Choice nttyRspnsblForRpt;

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
    public TradeTransactionIdentification17 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TradeTransactionIdentification17 setRptgCtrPty(OrganisationIdentification15Choice value) {
        this.rptgCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the rptSubmitgNtty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getRptSubmitgNtty() {
        return rptSubmitgNtty;
    }

    /**
     * Sets the value of the rptSubmitgNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TradeTransactionIdentification17 setRptSubmitgNtty(OrganisationIdentification15Choice value) {
        this.rptSubmitgNtty = value;
        return this;
    }

    /**
     * Gets the value of the nttyRspnsblForRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getNttyRspnsblForRpt() {
        return nttyRspnsblForRpt;
    }

    /**
     * Sets the value of the nttyRspnsblForRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public TradeTransactionIdentification17 setNttyRspnsblForRpt(OrganisationIdentification15Choice value) {
        this.nttyRspnsblForRpt = value;
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
