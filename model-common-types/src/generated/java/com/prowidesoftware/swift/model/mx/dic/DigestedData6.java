
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Digest computed on the identified data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigestedData6", propOrder = {
    "vrsn",
    "dgstAlgo",
    "ncpsltdCntt",
    "dgst"
})
public class DigestedData6 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "DgstAlgo", required = true)
    protected AlgorithmIdentification36 dgstAlgo;
    @XmlElement(name = "NcpsltdCntt", required = true)
    protected EncapsulatedContent3 ncpsltdCntt;
    @XmlElement(name = "Dgst", required = true)
    protected byte[] dgst;

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public DigestedData6 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification36 }
     *     
     */
    public AlgorithmIdentification36 getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification36 }
     *     
     */
    public DigestedData6 setDgstAlgo(AlgorithmIdentification36 value) {
        this.dgstAlgo = value;
        return this;
    }

    /**
     * Gets the value of the ncpsltdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public EncapsulatedContent3 getNcpsltdCntt() {
        return ncpsltdCntt;
    }

    /**
     * Sets the value of the ncpsltdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public DigestedData6 setNcpsltdCntt(EncapsulatedContent3 value) {
        this.ncpsltdCntt = value;
        return this;
    }

    /**
     * Gets the value of the dgst property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDgst() {
        return dgst;
    }

    /**
     * Sets the value of the dgst property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public DigestedData6 setDgst(byte[] value) {
        this.dgst = value;
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
