
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
@XmlType(name = "SecuritiesReferenceDeltaStatusReport2Choice", propOrder = {
    "modfdRcrd",
    "newRcrd",
    "termntdRcrd"
})
public class SecuritiesReferenceDeltaStatusReport2Choice {

    @XmlElement(name = "ModfdRcrd")
    protected SecuritiesReferenceDataReport5 modfdRcrd;
    @XmlElement(name = "NewRcrd")
    protected SecuritiesReferenceDataReport5 newRcrd;
    @XmlElement(name = "TermntdRcrd")
    protected SecuritiesReferenceDataReport5 termntdRcrd;

    /**
     * Gets the value of the modfdRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport5 }
     *     
     */
    public SecuritiesReferenceDataReport5 getModfdRcrd() {
        return modfdRcrd;
    }

    /**
     * Sets the value of the modfdRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport5 }
     *     
     */
    public SecuritiesReferenceDeltaStatusReport2Choice setModfdRcrd(SecuritiesReferenceDataReport5 value) {
        this.modfdRcrd = value;
        return this;
    }

    /**
     * Gets the value of the newRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport5 }
     *     
     */
    public SecuritiesReferenceDataReport5 getNewRcrd() {
        return newRcrd;
    }

    /**
     * Sets the value of the newRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport5 }
     *     
     */
    public SecuritiesReferenceDeltaStatusReport2Choice setNewRcrd(SecuritiesReferenceDataReport5 value) {
        this.newRcrd = value;
        return this;
    }

    /**
     * Gets the value of the termntdRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport5 }
     *     
     */
    public SecuritiesReferenceDataReport5 getTermntdRcrd() {
        return termntdRcrd;
    }

    /**
     * Sets the value of the termntdRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport5 }
     *     
     */
    public SecuritiesReferenceDeltaStatusReport2Choice setTermntdRcrd(SecuritiesReferenceDataReport5 value) {
        this.termntdRcrd = value;
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
