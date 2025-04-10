
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
@XmlType(name = "CollateralProposalResponseType2", propOrder = {
    "collPrpslId",
    "tp",
    "rspn"
})
public class CollateralProposalResponseType2 {

    @XmlElement(name = "CollPrpslId", required = true)
    protected String collPrpslId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralProposalResponse1Code tp;
    @XmlElement(name = "Rspn", required = true)
    protected CollateralResponse1 rspn;

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
    public CollateralProposalResponseType2 setCollPrpslId(String value) {
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
    public CollateralProposalResponseType2 setTp(CollateralProposalResponse1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralResponse1 }
     *     
     */
    public CollateralResponse1 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralResponse1 }
     *     
     */
    public CollateralProposalResponseType2 setRspn(CollateralResponse1 value) {
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
