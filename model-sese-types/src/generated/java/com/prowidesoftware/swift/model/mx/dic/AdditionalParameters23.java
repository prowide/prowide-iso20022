
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
 * Specifies additional parameters to the message or transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalParameters23", propOrder = {
    "preConf",
    "prtlSttlm",
    "trptyAgtCollTxId",
    "clntTrptyCollTxId"
})
public class AdditionalParameters23 {

    @XmlElement(name = "PreConf")
    @XmlSchemaType(name = "string")
    protected PreConfirmation1Code preConf;
    @XmlElement(name = "PrtlSttlm")
    @XmlSchemaType(name = "string")
    protected PartialSettlement2Code prtlSttlm;
    @XmlElement(name = "TrptyAgtCollTxId")
    protected String trptyAgtCollTxId;
    @XmlElement(name = "ClntTrptyCollTxId")
    protected String clntTrptyCollTxId;

    /**
     * Gets the value of the preConf property.
     * 
     * @return
     *     possible object is
     *     {@link PreConfirmation1Code }
     *     
     */
    public PreConfirmation1Code getPreConf() {
        return preConf;
    }

    /**
     * Sets the value of the preConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreConfirmation1Code }
     *     
     */
    public AdditionalParameters23 setPreConf(PreConfirmation1Code value) {
        this.preConf = value;
        return this;
    }

    /**
     * Gets the value of the prtlSttlm property.
     * 
     * @return
     *     possible object is
     *     {@link PartialSettlement2Code }
     *     
     */
    public PartialSettlement2Code getPrtlSttlm() {
        return prtlSttlm;
    }

    /**
     * Sets the value of the prtlSttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialSettlement2Code }
     *     
     */
    public AdditionalParameters23 setPrtlSttlm(PartialSettlement2Code value) {
        this.prtlSttlm = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgtCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtCollTxId() {
        return trptyAgtCollTxId;
    }

    /**
     * Sets the value of the trptyAgtCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalParameters23 setTrptyAgtCollTxId(String value) {
        this.trptyAgtCollTxId = value;
        return this;
    }

    /**
     * Gets the value of the clntTrptyCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntTrptyCollTxId() {
        return clntTrptyCollTxId;
    }

    /**
     * Sets the value of the clntTrptyCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalParameters23 setClntTrptyCollTxId(String value) {
        this.clntTrptyCollTxId = value;
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
