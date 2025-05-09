
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
 * Provides the return indicators and the investigation result.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnIndicator1", propOrder = {
    "rspnPrd",
    "authrtyReqTp",
    "invstgtnRslt",
    "addtlInf"
})
public class ReturnIndicator1 {

    @XmlElement(name = "RspnPrd")
    protected DateOrDateTimePeriodChoice rspnPrd;
    @XmlElement(name = "AuthrtyReqTp", required = true)
    protected AuthorityRequestType1 authrtyReqTp;
    @XmlElement(name = "InvstgtnRslt", required = true)
    protected InvestigationResult1Choice invstgtnRslt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the rspnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public DateOrDateTimePeriodChoice getRspnPrd() {
        return rspnPrd;
    }

    /**
     * Sets the value of the rspnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriodChoice }
     *     
     */
    public ReturnIndicator1 setRspnPrd(DateOrDateTimePeriodChoice value) {
        this.rspnPrd = value;
        return this;
    }

    /**
     * Gets the value of the authrtyReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequestType1 }
     *     
     */
    public AuthorityRequestType1 getAuthrtyReqTp() {
        return authrtyReqTp;
    }

    /**
     * Sets the value of the authrtyReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequestType1 }
     *     
     */
    public ReturnIndicator1 setAuthrtyReqTp(AuthorityRequestType1 value) {
        this.authrtyReqTp = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationResult1Choice }
     *     
     */
    public InvestigationResult1Choice getInvstgtnRslt() {
        return invstgtnRslt;
    }

    /**
     * Sets the value of the invstgtnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationResult1Choice }
     *     
     */
    public ReturnIndicator1 setInvstgtnRslt(InvestigationResult1Choice value) {
        this.invstgtnRslt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReturnIndicator1 setAddtlInf(String value) {
        this.addtlInf = value;
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
