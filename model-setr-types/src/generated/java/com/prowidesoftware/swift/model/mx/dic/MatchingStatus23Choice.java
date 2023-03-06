
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
 * Choice of status for the matching.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingStatus23Choice", propOrder = {
    "mtchd",
    "mtchdWthTlrnce",
    "mtchgAllgd",
    "umtchd",
    "prtrySts"
})
public class MatchingStatus23Choice {

    @XmlElement(name = "Mtchd")
    protected ProprietaryReason1 mtchd;
    @XmlElement(name = "MtchdWthTlrnce")
    protected ProprietaryReason1 mtchdWthTlrnce;
    @XmlElement(name = "MtchgAllgd")
    protected MatchingReason4Choice mtchgAllgd;
    @XmlElement(name = "Umtchd")
    protected MatchingReason1Choice umtchd;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason1 prtrySts;

    /**
     * Gets the value of the mtchd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getMtchd() {
        return mtchd;
    }

    /**
     * Sets the value of the mtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public MatchingStatus23Choice setMtchd(ProprietaryReason1 value) {
        this.mtchd = value;
        return this;
    }

    /**
     * Gets the value of the mtchdWthTlrnce property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public ProprietaryReason1 getMtchdWthTlrnce() {
        return mtchdWthTlrnce;
    }

    /**
     * Sets the value of the mtchdWthTlrnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason1 }
     *     
     */
    public MatchingStatus23Choice setMtchdWthTlrnce(ProprietaryReason1 value) {
        this.mtchdWthTlrnce = value;
        return this;
    }

    /**
     * Gets the value of the mtchgAllgd property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingReason4Choice }
     *     
     */
    public MatchingReason4Choice getMtchgAllgd() {
        return mtchgAllgd;
    }

    /**
     * Sets the value of the mtchgAllgd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingReason4Choice }
     *     
     */
    public MatchingStatus23Choice setMtchgAllgd(MatchingReason4Choice value) {
        this.mtchgAllgd = value;
        return this;
    }

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingReason1Choice }
     *     
     */
    public MatchingReason1Choice getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingReason1Choice }
     *     
     */
    public MatchingStatus23Choice setUmtchd(MatchingReason1Choice value) {
        this.umtchd = value;
        return this;
    }

    /**
     * Gets the value of the prtrySts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public ProprietaryStatusAndReason1 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Sets the value of the prtrySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason1 }
     *     
     */
    public MatchingStatus23Choice setPrtrySts(ProprietaryStatusAndReason1 value) {
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
