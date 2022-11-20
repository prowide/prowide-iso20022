
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
@XmlType(name = "ReconciliationResult10", propOrder = {
    "ctrPty1",
    "ctrPty2",
    "mtchgCrit"
})
public class ReconciliationResult10 {

    @XmlElement(name = "CtrPty1", required = true)
    protected OrganisationIdentification15Choice ctrPty1;
    @XmlElement(name = "CtrPty2", required = true)
    protected OrganisationIdentification15Choice ctrPty2;
    @XmlElement(name = "MtchgCrit", required = true)
    protected MatchingCriteria10 mtchgCrit;

    /**
     * Gets the value of the ctrPty1 property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getCtrPty1() {
        return ctrPty1;
    }

    /**
     * Sets the value of the ctrPty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public ReconciliationResult10 setCtrPty1(OrganisationIdentification15Choice value) {
        this.ctrPty1 = value;
        return this;
    }

    /**
     * Gets the value of the ctrPty2 property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getCtrPty2() {
        return ctrPty2;
    }

    /**
     * Sets the value of the ctrPty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public ReconciliationResult10 setCtrPty2(OrganisationIdentification15Choice value) {
        this.ctrPty2 = value;
        return this;
    }

    /**
     * Gets the value of the mtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingCriteria10 }
     *     
     */
    public MatchingCriteria10 getMtchgCrit() {
        return mtchgCrit;
    }

    /**
     * Sets the value of the mtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingCriteria10 }
     *     
     */
    public ReconciliationResult10 setMtchgCrit(MatchingCriteria10 value) {
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
