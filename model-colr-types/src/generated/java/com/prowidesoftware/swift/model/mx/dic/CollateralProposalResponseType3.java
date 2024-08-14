
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "CollateralProposalResponseType3", propOrder = {
    "collPrpslId",
    "tp",
    "rspn"
})
public class CollateralProposalResponseType3 {

    @XmlElement(name = "CollPrpslId", required = true)
    protected String collPrpslId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralProposalResponse1Code tp;
    @XmlElement(name = "Rspn", required = true)
    protected CollateralResponse2 rspn;

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
    public CollateralProposalResponseType3 setCollPrpslId(String value) {
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
    public CollateralProposalResponseType3 setTp(CollateralProposalResponse1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralResponse2 }
     *     
     */
    public CollateralResponse2 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralResponse2 }
     *     
     */
    public CollateralProposalResponseType3 setRspn(CollateralResponse2 value) {
        this.rspn = value;
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
