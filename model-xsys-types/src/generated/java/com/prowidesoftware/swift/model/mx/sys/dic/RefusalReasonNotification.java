
package com.prowidesoftware.swift.model.mx.sys.dic;

import com.prowidesoftware.swift.model.mx.sys.dic.SwAny;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for RefusalReasonNotification complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefusalReasonNotification", propOrder = {
    "thirdPartyRefusalReason",
    "signatureValue"
})
public class RefusalReasonNotification
    extends Notification
{

    @XmlElement(name = "ThirdPartyRefusalReason", namespace = "urn:swift:snl:ns.Sw")
    protected SwAny thirdPartyRefusalReason;
    @XmlElement(name = "SignatureValue", namespace = "urn:swift:snl:ns.SwSec")
    protected String signatureValue;

    /**
     * ThirdPartyRefusalReason
     * 
     * @return
     *     possible object is
     *     {@link SwAny }
     *     
     */
    public SwAny getThirdPartyRefusalReason() {
        return thirdPartyRefusalReason;
    }

    /**
     * Sets the value of the thirdPartyRefusalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwAny }
     *     
     */
    public RefusalReasonNotification setThirdPartyRefusalReason(SwAny value) {
        this.thirdPartyRefusalReason = value;
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
    public RefusalReasonNotification setSignatureValue(String value) {
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
