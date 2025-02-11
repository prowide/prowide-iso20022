
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
 * Reference of a transfer and of a transfer confirmation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferReference16", propOrder = {
    "trfRef",
    "clntRef",
    "trfConfRef",
    "ctrPtyRef",
    "cxlRef",
    "rvslRsn"
})
public class TransferReference16 {

    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "TrfConfRef")
    protected String trfConfRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference10 ctrPtyRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "RvslRsn")
    protected String rvslRsn;

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferReference16 setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public TransferReference16 setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the trfConfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfConfRef() {
        return trfConfRef;
    }

    /**
     * Sets the value of the trfConfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferReference16 setTrfConfRef(String value) {
        this.trfConfRef = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public TransferReference16 setCtrPtyRef(AdditionalReference10 value) {
        this.ctrPtyRef = value;
        return this;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferReference16 setCxlRef(String value) {
        this.cxlRef = value;
        return this;
    }

    /**
     * Gets the value of the rvslRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRvslRsn() {
        return rvslRsn;
    }

    /**
     * Sets the value of the rvslRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferReference16 setRvslRsn(String value) {
        this.rvslRsn = value;
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
