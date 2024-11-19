
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
 * Response to a secure input request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
<<<<<<< HEAD:model-casp-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/DeviceSecureInputResponse2.java
@XmlType(name = "DeviceSecureInputResponse2", propOrder = {
    "crdhldrPIN"
})
public class DeviceSecureInputResponse2 {

    @XmlElement(name = "CrdhldrPIN")
    protected OnLinePIN7 crdhldrPIN;
=======
@XmlType(name = "DeviceSecureInputResponse6", propOrder = {
    "crdhldrPIN"
})
public class DeviceSecureInputResponse6 {

    @XmlElement(name = "CrdhldrPIN")
    protected OnLinePIN11 crdhldrPIN;
>>>>>>> origin/main:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/DeviceSecureInputResponse6.java

    /**
     * Gets the value of the crdhldrPIN property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD:model-casp-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/DeviceSecureInputResponse2.java
     *     {@link OnLinePIN7 }
     *     
     */
    public OnLinePIN7 getCrdhldrPIN() {
=======
     *     {@link OnLinePIN11 }
     *     
     */
    public OnLinePIN11 getCrdhldrPIN() {
>>>>>>> origin/main:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/DeviceSecureInputResponse6.java
        return crdhldrPIN;
    }

    /**
     * Sets the value of the crdhldrPIN property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD:model-casp-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/DeviceSecureInputResponse2.java
     *     {@link OnLinePIN7 }
     *     
     */
    public DeviceSecureInputResponse2 setCrdhldrPIN(OnLinePIN7 value) {
=======
     *     {@link OnLinePIN11 }
     *     
     */
    public DeviceSecureInputResponse6 setCrdhldrPIN(OnLinePIN11 value) {
>>>>>>> origin/main:model-common-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/DeviceSecureInputResponse6.java
        this.crdhldrPIN = value;
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
