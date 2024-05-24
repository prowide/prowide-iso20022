
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Parameters of the RSASSA-PSS digital signature algorithm (RSA signature algorithm with appendix: Probabilistic Signature Scheme).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter8", propOrder = {
    "dgstAlgo",
    "mskGnrtrAlgo",
    "saltLngth",
    "trlrFld"
})
public class Parameter8 {

    @XmlElement(name = "DgstAlgo", required = true)
    @XmlSchemaType(name = "string")
    protected Algorithm11Code dgstAlgo;
    @XmlElement(name = "MskGnrtrAlgo", required = true)
    protected AlgorithmIdentification12 mskGnrtrAlgo;
    @XmlElement(name = "SaltLngth", required = true)
    protected BigDecimal saltLngth;
    @XmlElement(name = "TrlrFld")
    protected BigDecimal trlrFld;

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm11Code }
     *     
     */
    public Algorithm11Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm11Code }
     *     
     */
    public Parameter8 setDgstAlgo(Algorithm11Code value) {
        this.dgstAlgo = value;
        return this;
    }

    /**
     * Gets the value of the mskGnrtrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification12 }
     *     
     */
    public AlgorithmIdentification12 getMskGnrtrAlgo() {
        return mskGnrtrAlgo;
    }

    /**
     * Sets the value of the mskGnrtrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification12 }
     *     
     */
    public Parameter8 setMskGnrtrAlgo(AlgorithmIdentification12 value) {
        this.mskGnrtrAlgo = value;
        return this;
    }

    /**
     * Gets the value of the saltLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaltLngth() {
        return saltLngth;
    }

    /**
     * Sets the value of the saltLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Parameter8 setSaltLngth(BigDecimal value) {
        this.saltLngth = value;
        return this;
    }

    /**
     * Gets the value of the trlrFld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrlrFld() {
        return trlrFld;
    }

    /**
     * Sets the value of the trlrFld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Parameter8 setTrlrFld(BigDecimal value) {
        this.trlrFld = value;
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
