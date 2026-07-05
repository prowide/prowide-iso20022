
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
 * Choice defining financial instruments that are either new or have been modified. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesReferenceDeltaStatusReport5Choice", propOrder = {
    "modfdRcrd",
    "newRcrd",
    "termntdRcrd",
    "cancRcrd"
})
public class SecuritiesReferenceDeltaStatusReport5Choice {

    @XmlElement(name = "ModfdRcrd")
    protected SecuritiesReferenceDataReport6 modfdRcrd;
    @XmlElement(name = "NewRcrd")
    protected SecuritiesReferenceDataReport6 newRcrd;
    @XmlElement(name = "TermntdRcrd")
    protected SecuritiesReferenceDataReport6 termntdRcrd;
    @XmlElement(name = "CancRcrd")
    protected SecuritiesReferenceDataReport7 cancRcrd;

    /**
     * Gets the value of the modfdRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public SecuritiesReferenceDataReport6 getModfdRcrd() {
        return modfdRcrd;
    }

    /**
     * Sets the value of the modfdRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public SecuritiesReferenceDeltaStatusReport5Choice setModfdRcrd(SecuritiesReferenceDataReport6 value) {
        this.modfdRcrd = value;
        return this;
    }

    /**
     * Gets the value of the newRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public SecuritiesReferenceDataReport6 getNewRcrd() {
        return newRcrd;
    }

    /**
     * Sets the value of the newRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public SecuritiesReferenceDeltaStatusReport5Choice setNewRcrd(SecuritiesReferenceDataReport6 value) {
        this.newRcrd = value;
        return this;
    }

    /**
     * Gets the value of the termntdRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public SecuritiesReferenceDataReport6 getTermntdRcrd() {
        return termntdRcrd;
    }

    /**
     * Sets the value of the termntdRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public SecuritiesReferenceDeltaStatusReport5Choice setTermntdRcrd(SecuritiesReferenceDataReport6 value) {
        this.termntdRcrd = value;
        return this;
    }

    /**
     * Gets the value of the cancRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport7 }
     *     
     */
    public SecuritiesReferenceDataReport7 getCancRcrd() {
        return cancRcrd;
    }

    /**
     * Sets the value of the cancRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport7 }
     *     
     */
    public SecuritiesReferenceDeltaStatusReport5Choice setCancRcrd(SecuritiesReferenceDataReport7 value) {
        this.cancRcrd = value;
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
