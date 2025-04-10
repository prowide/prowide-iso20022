
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
 * Provides details on the response for a collateral proposal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposalResponseType1", propOrder = {
    "collPrpslId",
    "tp",
    "rspnTp",
    "rjctnRsn",
    "rjctnInf"
})
public class CollateralProposalResponseType1 {

    @XmlElement(name = "CollPrpslId", required = true)
    protected String collPrpslId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralProposalResponse1Code tp;
    @XmlElement(name = "RspnTp", required = true)
    @XmlSchemaType(name = "string")
    protected Status4Code rspnTp;
    @XmlElement(name = "RjctnRsn")
    @XmlSchemaType(name = "string")
    protected RejectionReasonV021Code rjctnRsn;
    @XmlElement(name = "RjctnInf")
    protected String rjctnInf;

    /**
     * Gets the value of the collPrpslId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrpslId() {
        return collPrpslId;
    }

    /**
     * Sets the value of the collPrpslId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralProposalResponseType1 setCollPrpslId(String value) {
        this.collPrpslId = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponse1Code }
     *     
     */
    public CollateralProposalResponse1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponse1Code }
     *     
     */
    public CollateralProposalResponseType1 setTp(CollateralProposalResponse1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rspnTp property.
     * 
     * @return
     *     possible object is
     *     {@link Status4Code }
     *     
     */
    public Status4Code getRspnTp() {
        return rspnTp;
    }

    /**
     * Sets the value of the rspnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status4Code }
     *     
     */
    public CollateralProposalResponseType1 setRspnTp(Status4Code value) {
        this.rspnTp = value;
        return this;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReasonV021Code }
     *     
     */
    public RejectionReasonV021Code getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReasonV021Code }
     *     
     */
    public CollateralProposalResponseType1 setRjctnRsn(RejectionReasonV021Code value) {
        this.rjctnRsn = value;
        return this;
    }

    /**
     * Gets the value of the rjctnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctnInf() {
        return rjctnInf;
    }

    /**
     * Sets the value of the rjctnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralProposalResponseType1 setRjctnInf(String value) {
        this.rjctnInf = value;
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
