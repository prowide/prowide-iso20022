
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
 * Choice of format for the matching status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingStatus4Choice", propOrder = {
    "mtchd",
    "umtchd",
    "prtry"
})
public class MatchingStatus4Choice {

    @XmlElement(name = "Mtchd")
    protected NoSpecifiedReason1 mtchd;
    @XmlElement(name = "Umtchd")
    protected UnmatchedStatus3Choice umtchd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason2 prtry;

    /**
     * Gets the value of the mtchd property.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getMtchd() {
        return mtchd;
    }

    /**
     * Sets the value of the mtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public MatchingStatus4Choice setMtchd(NoSpecifiedReason1 value) {
        this.mtchd = value;
        return this;
    }

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedStatus3Choice }
     *     
     */
    public UnmatchedStatus3Choice getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedStatus3Choice }
     *     
     */
    public MatchingStatus4Choice setUmtchd(UnmatchedStatus3Choice value) {
        this.umtchd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason2 }
     *     
     */
    public ProprietaryStatusAndReason2 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason2 }
     *     
     */
    public MatchingStatus4Choice setPrtry(ProprietaryStatusAndReason2 value) {
        this.prtry = value;
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
