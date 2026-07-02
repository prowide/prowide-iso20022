
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.mx.sys.dic.SwAny;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ToSenderNotification complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToSenderNotification", propOrder = {
    "thirdPartyToSenderInformation",
    "signatureValue"
})
public class ToSenderNotification
    extends Notification
{

    @XmlElement(name = "ThirdPartyToSenderInformation", namespace = "urn:swift:snl:ns.Sw")
    protected SwAny thirdPartyToSenderInformation;
    @XmlElement(name = "SignatureValue", namespace = "urn:swift:snl:ns.SwSec")
    protected String signatureValue;

    /**
     * ThirdPartyToSenderInformation
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getThirdPartyToSenderInformation() {
        return thirdPartyToSenderInformation;
    }

    /**
     * Sets the value of the thirdPartyToSenderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public ToSenderNotification setThirdPartyToSenderInformation(SwAny value) {
        this.thirdPartyToSenderInformation = value;
        return this;
    }

    /**
     * SignatureValue
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureValue() {
        return signatureValue;
    }

    /**
     * Sets the value of the signatureValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ToSenderNotification setSignatureValue(String value) {
        this.signatureValue = value;
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
