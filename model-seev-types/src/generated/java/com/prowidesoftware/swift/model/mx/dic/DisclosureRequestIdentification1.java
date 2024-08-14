
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
 * Information identifying the disclosure request for shareholders identification published by the issuer or third party nominated by the issuer in order to receive the disclosure responses from intermediaries in the custody chain.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisclosureRequestIdentification1", propOrder = {
    "issrDsclsrReqId",
    "finInstrmId",
    "shrhldrsDsclsrRcrdDt"
})
public class DisclosureRequestIdentification1 {

    @XmlElement(name = "IssrDsclsrReqId", required = true)
    protected String issrDsclsrReqId;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "ShrhldrsDsclsrRcrdDt", required = true)
    protected DateFormat46Choice shrhldrsDsclsrRcrdDt;

    /**
     * Gets the value of the issrDsclsrReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrDsclsrReqId() {
        return issrDsclsrReqId;
    }

    /**
     * Sets the value of the issrDsclsrReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DisclosureRequestIdentification1 setIssrDsclsrReqId(String value) {
        this.issrDsclsrReqId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public DisclosureRequestIdentification1 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the shrhldrsDsclsrRcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat46Choice }
     *     
     */
    public DateFormat46Choice getShrhldrsDsclsrRcrdDt() {
        return shrhldrsDsclsrRcrdDt;
    }

    /**
     * Sets the value of the shrhldrsDsclsrRcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat46Choice }
     *     
     */
    public DisclosureRequestIdentification1 setShrhldrsDsclsrRcrdDt(DateFormat46Choice value) {
        this.shrhldrsDsclsrRcrdDt = value;
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
