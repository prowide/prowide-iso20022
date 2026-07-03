
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
 * Choice of status for the matching.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingStatus35Choice", propOrder = {
    "mtchd",
    "mtchdWthTlrnce",
    "mtchgAllgd",
    "umtchd",
    "prtrySts"
})
public class MatchingStatus35Choice {

    @XmlElement(name = "Mtchd")
    protected ProprietaryReason4 mtchd;
    @XmlElement(name = "MtchdWthTlrnce")
    protected ProprietaryReason4 mtchdWthTlrnce;
    @XmlElement(name = "MtchgAllgd")
    protected MatchingReason5Choice mtchgAllgd;
    @XmlElement(name = "Umtchd")
    protected MatchingReason6Choice umtchd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Gets the value of the mtchd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getMtchd() {
        return mtchd;
    }

    /**
     * Sets the value of the mtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public MatchingStatus35Choice setMtchd(ProprietaryReason4 value) {
        this.mtchd = value;
        return this;
    }

    /**
     * Gets the value of the mtchdWthTlrnce property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getMtchdWthTlrnce() {
        return mtchdWthTlrnce;
    }

    /**
     * Sets the value of the mtchdWthTlrnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public MatchingStatus35Choice setMtchdWthTlrnce(ProprietaryReason4 value) {
        this.mtchdWthTlrnce = value;
        return this;
    }

    /**
     * Gets the value of the mtchgAllgd property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingReason5Choice }
     *     
     */
    public MatchingReason5Choice getMtchgAllgd() {
        return mtchgAllgd;
    }

    /**
     * Sets the value of the mtchgAllgd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingReason5Choice }
     *     
     */
    public MatchingStatus35Choice setMtchgAllgd(MatchingReason5Choice value) {
        this.mtchgAllgd = value;
        return this;
    }

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingReason6Choice }
     *     
     */
    public MatchingReason6Choice getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingReason6Choice }
     *     
     */
    public MatchingStatus35Choice setUmtchd(MatchingReason6Choice value) {
        this.umtchd = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public MatchingStatus35Choice setPrtrySts(ProprietaryStatusAndReason6 value) {
        this.prtrySts = value;
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
