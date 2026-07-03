
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
 * Indication that the reports subject of reconciliation do not match.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationResult7", propOrder = {
    "ctrPty1",
    "ctrPty2",
    "mtchgCrit"
})
public class ReconciliationResult7 {

    @XmlElement(name = "CtrPty1", required = true)
    protected OrganisationIdentification9Choice ctrPty1;
    @XmlElement(name = "CtrPty2", required = true)
    protected OrganisationIdentification9Choice ctrPty2;
    @XmlElement(name = "MtchgCrit", required = true)
    protected MatchingCriteria7 mtchgCrit;

    /**
     * Gets the value of the ctrPty1 property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getCtrPty1() {
        return ctrPty1;
    }

    /**
     * Sets the value of the ctrPty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public ReconciliationResult7 setCtrPty1(OrganisationIdentification9Choice value) {
        this.ctrPty1 = value;
        return this;
    }

    /**
     * Gets the value of the ctrPty2 property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public OrganisationIdentification9Choice getCtrPty2() {
        return ctrPty2;
    }

    /**
     * Sets the value of the ctrPty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification9Choice }
     *     
     */
    public ReconciliationResult7 setCtrPty2(OrganisationIdentification9Choice value) {
        this.ctrPty2 = value;
        return this;
    }

    /**
     * Gets the value of the mtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingCriteria7 }
     *     
     */
    public MatchingCriteria7 getMtchgCrit() {
        return mtchgCrit;
    }

    /**
     * Sets the value of the mtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingCriteria7 }
     *     
     */
    public ReconciliationResult7 setMtchgCrit(MatchingCriteria7 value) {
        this.mtchgCrit = value;
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
