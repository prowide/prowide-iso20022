
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
 * Identifies the mandate to be cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateCancellation1", propOrder = {
    "orgnlMsgInf",
    "cxlRsn",
    "orgnlMndt"
})
public class MandateCancellation1 {

    @XmlElement(name = "OrgnlMsgInf")
    protected OriginalMessageInformation1 orgnlMsgInf;
    @XmlElement(name = "CxlRsn", required = true)
    protected CancellationReasonInformation2 cxlRsn;
    @XmlElement(name = "OrgnlMndt", required = true)
    protected OriginalMandate1Choice orgnlMndt;

    /**
     * Gets the value of the orgnlMsgInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessageInformation1 }
     *     
     */
    public OriginalMessageInformation1 getOrgnlMsgInf() {
        return orgnlMsgInf;
    }

    /**
     * Sets the value of the orgnlMsgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessageInformation1 }
     *     
     */
    public MandateCancellation1 setOrgnlMsgInf(OriginalMessageInformation1 value) {
        this.orgnlMsgInf = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReasonInformation2 }
     *     
     */
    public CancellationReasonInformation2 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReasonInformation2 }
     *     
     */
    public MandateCancellation1 setCxlRsn(CancellationReasonInformation2 value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMndt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMandate1Choice }
     *     
     */
    public OriginalMandate1Choice getOrgnlMndt() {
        return orgnlMndt;
    }

    /**
     * Sets the value of the orgnlMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMandate1Choice }
     *     
     */
    public MandateCancellation1 setOrgnlMndt(OriginalMandate1Choice value) {
        this.orgnlMndt = value;
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
