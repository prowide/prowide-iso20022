
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
 * Execution of a redemption order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionMultipleExecution4", propOrder = {
    "mstrRef",
    "plcOfTrad",
    "invstmtAcctDtls",
    "indvExctnDtls"
})
public class RedemptionMultipleExecution4 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification3Choice plcOfTrad;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount33 invstmtAcctDtls;
    @XmlElement(name = "IndvExctnDtls", required = true)
    protected RedemptionExecution12 indvExctnDtls;

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
    public RedemptionMultipleExecution4 setMstrRef(String value) {
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
    public RedemptionMultipleExecution4 setPlcOfTrad(PlaceOfTradeIdentification3Choice value) {
        this.plcOfTrad = value;
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
    public RedemptionMultipleExecution4 setInvstmtAcctDtls(InvestmentAccount33 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the indvExctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionExecution12 }
     *     
     */
    public RedemptionExecution12 getIndvExctnDtls() {
        return indvExctnDtls;
    }

    /**
     * Sets the value of the indvExctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionExecution12 }
     *     
     */
    public RedemptionMultipleExecution4 setIndvExctnDtls(RedemptionExecution12 value) {
        this.indvExctnDtls = value;
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
