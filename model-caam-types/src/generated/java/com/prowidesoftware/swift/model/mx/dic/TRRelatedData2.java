
package com.prowidesoftware.swift.model.mx.dic;

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
 * Data block for a TR31 or TR34 key block which contains the key being transported.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRRelatedData2", propOrder = {
    "tr34Cmd",
    "trBlck"
})
public class TRRelatedData2 {

    @XmlElement(name = "TR34Cmd")
    @XmlSchemaType(name = "string")
    protected TR34Command1Code tr34Cmd;
    @XmlElement(name = "TRBlck")
    protected byte[] trBlck;

    /**
     * Gets the value of the tr34Cmd property.
     * 
     * @return
     *     possible object is
     *     {@link TR34Command1Code }
     *     
     */
    public TR34Command1Code getTR34Cmd() {
        return tr34Cmd;
    }

    /**
     * Sets the value of the tr34Cmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TR34Command1Code }
     *     
     */
    public TRRelatedData2 setTR34Cmd(TR34Command1Code value) {
        this.tr34Cmd = value;
        return this;
    }

    /**
     * Gets the value of the trBlck property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTRBlck() {
        return trBlck;
    }

    /**
     * Sets the value of the trBlck property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public TRRelatedData2 setTRBlck(byte[] value) {
        this.trBlck = value;
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
