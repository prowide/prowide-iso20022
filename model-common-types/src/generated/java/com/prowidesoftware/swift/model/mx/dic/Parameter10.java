
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
 * Parameters of the asymmetric encryption algorithm.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter10", propOrder = {
    "ncrptnFrmt",
    "dgstAlgo",
    "mskGnrtrAlgo"
})
public class Parameter10 {

    @XmlElement(name = "NcrptnFrmt")
    @XmlSchemaType(name = "string")
    protected EncryptionFormat2Code ncrptnFrmt;
    @XmlElement(name = "DgstAlgo")
    @XmlSchemaType(name = "string")
    protected Algorithm16Code dgstAlgo;
    @XmlElement(name = "MskGnrtrAlgo")
    protected AlgorithmIdentification18 mskGnrtrAlgo;

    /**
     * Gets the value of the ncrptnFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionFormat2Code }
     *     
     */
    public EncryptionFormat2Code getNcrptnFrmt() {
        return ncrptnFrmt;
    }

    /**
     * Sets the value of the ncrptnFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionFormat2Code }
     *     
     */
    public Parameter10 setNcrptnFrmt(EncryptionFormat2Code value) {
        this.ncrptnFrmt = value;
        return this;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm16Code }
     *     
     */
    public Algorithm16Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm16Code }
     *     
     */
    public Parameter10 setDgstAlgo(Algorithm16Code value) {
        this.dgstAlgo = value;
        return this;
    }

    /**
     * Gets the value of the mskGnrtrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification18 }
     *     
     */
    public AlgorithmIdentification18 getMskGnrtrAlgo() {
        return mskGnrtrAlgo;
    }

    /**
     * Sets the value of the mskGnrtrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification18 }
     *     
     */
    public Parameter10 setMskGnrtrAlgo(AlgorithmIdentification18 value) {
        this.mskGnrtrAlgo = value;
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
