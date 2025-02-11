
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
 * Identifies the mandate, which is being accepted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAcceptance1", propOrder = {
    "orgnlMsgInf",
    "accptncRslt",
    "orgnlMndt"
})
public class MandateAcceptance1 {

    @XmlElement(name = "OrgnlMsgInf")
    protected OriginalMessageInformation1 orgnlMsgInf;
    @XmlElement(name = "AccptncRslt", required = true)
    protected AcceptanceResult6 accptncRslt;
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
    public MandateAcceptance1 setOrgnlMsgInf(OriginalMessageInformation1 value) {
        this.orgnlMsgInf = value;
        return this;
    }

    /**
     * Gets the value of the accptncRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptanceResult6 }
     *     
     */
    public AcceptanceResult6 getAccptncRslt() {
        return accptncRslt;
    }

    /**
     * Sets the value of the accptncRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptanceResult6 }
     *     
     */
    public MandateAcceptance1 setAccptncRslt(AcceptanceResult6 value) {
        this.accptncRslt = value;
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
    public MandateAcceptance1 setOrgnlMndt(OriginalMandate1Choice value) {
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
