
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
 * Specifies the data elements related to additional data for the investigation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalRequestData1Choice", propOrder = {
    "reqdDbtAuthstn",
    "reqdCompstn",
    "reqdValtn",
    "reqNrrtv"
})
public class AdditionalRequestData1Choice {

    @XmlElement(name = "ReqdDbtAuthstn")
    protected DebitAuthorisation3 reqdDbtAuthstn;
    @XmlElement(name = "ReqdCompstn")
    protected CompensationRequest1 reqdCompstn;
    @XmlElement(name = "ReqdValtn")
    protected AdjustmentRequest1 reqdValtn;
    @XmlElement(name = "ReqNrrtv")
    protected String reqNrrtv;

    /**
     * Gets the value of the reqdDbtAuthstn property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorisation3 }
     *     
     */
    public DebitAuthorisation3 getReqdDbtAuthstn() {
        return reqdDbtAuthstn;
    }

    /**
     * Sets the value of the reqdDbtAuthstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorisation3 }
     *     
     */
    public AdditionalRequestData1Choice setReqdDbtAuthstn(DebitAuthorisation3 value) {
        this.reqdDbtAuthstn = value;
        return this;
    }

    /**
     * Gets the value of the reqdCompstn property.
     * 
     * @return
     *     possible object is
     *     {@link CompensationRequest1 }
     *     
     */
    public CompensationRequest1 getReqdCompstn() {
        return reqdCompstn;
    }

    /**
     * Sets the value of the reqdCompstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationRequest1 }
     *     
     */
    public AdditionalRequestData1Choice setReqdCompstn(CompensationRequest1 value) {
        this.reqdCompstn = value;
        return this;
    }

    /**
     * Gets the value of the reqdValtn property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentRequest1 }
     *     
     */
    public AdjustmentRequest1 getReqdValtn() {
        return reqdValtn;
    }

    /**
     * Sets the value of the reqdValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentRequest1 }
     *     
     */
    public AdditionalRequestData1Choice setReqdValtn(AdjustmentRequest1 value) {
        this.reqdValtn = value;
        return this;
    }

    /**
     * Gets the value of the reqNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqNrrtv() {
        return reqNrrtv;
    }

    /**
     * Sets the value of the reqNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalRequestData1Choice setReqNrrtv(String value) {
        this.reqNrrtv = value;
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
