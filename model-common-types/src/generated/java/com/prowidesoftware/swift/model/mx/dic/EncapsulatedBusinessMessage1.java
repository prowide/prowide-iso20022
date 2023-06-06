
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Defines an encapsulated form of an ISO 20022 message and, if present, its associated Business Application Header. The encapsulation guarantees uniqueness of ID/IDREFs though the use of the Prefix element. This element can be added during message preparation to ID/IDREFs. In order to verify the signature in the Hdr element or inside the encapsulated message, for each occurrence of an ID orIDREF that possesses the same value as a prefix, the prefix part is removed before signature verification. This is not done for surrounding signatures.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncapsulatedBusinessMessage1", propOrder = {
    "hdr",
    "prfx",
    "prtl",
    "msg"
})
public class EncapsulatedBusinessMessage1 {

    @XmlElement(name = "Hdr")
    protected BusinessApplicationHeader1 hdr;
    @XmlElement(name = "Prfx")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String prfx;
    @XmlElement(name = "Prtl")
    protected boolean prtl;
    @XmlElement(name = "Msg", required = true)
    protected StrictPayload msg;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeader1 }
     *     
     */
    public BusinessApplicationHeader1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeader1 }
     *     
     */
    public EncapsulatedBusinessMessage1 setHdr(BusinessApplicationHeader1 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the prfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrfx() {
        return prfx;
    }

    /**
     * Sets the value of the prfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public EncapsulatedBusinessMessage1 setPrfx(String value) {
        this.prfx = value;
        return this;
    }

    /**
     * Gets the value of the prtl property.
     * 
     */
    public boolean isPrtl() {
        return prtl;
    }

    /**
     * Sets the value of the prtl property.
     * 
     */
    public EncapsulatedBusinessMessage1 setPrtl(boolean value) {
        this.prtl = value;
        return this;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link StrictPayload }
     *     
     */
    public StrictPayload getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrictPayload }
     *     
     */
    public EncapsulatedBusinessMessage1 setMsg(StrictPayload value) {
        this.msg = value;
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
