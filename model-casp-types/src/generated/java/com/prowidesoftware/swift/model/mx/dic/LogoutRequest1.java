
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
<<<<<<< HEAD:model-casp-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/LogoutRequest1.java
 * Content of the Logout Request message.
=======
 * Additional information with update description and date.
>>>>>>> origin/main:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/UpdatedAdditionalInformation18.java
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
<<<<<<< HEAD:model-casp-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/LogoutRequest1.java
@XmlType(name = "LogoutRequest1", propOrder = {
    "mntncAllwd"
})
public class LogoutRequest1 {

    @XmlElement(name = "MntncAllwd")
    protected Boolean mntncAllwd;

    /**
     * Gets the value of the mntncAllwd property.
=======
@XmlType(name = "UpdatedAdditionalInformation18", propOrder = {
    "addtlInf"
})
public class UpdatedAdditionalInformation18 {

    @XmlElement(name = "AddtlInf", required = true)
    protected String addtlInf;

    /**
     * Gets the value of the addtlInf property.
>>>>>>> origin/main:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/UpdatedAdditionalInformation18.java
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
<<<<<<< HEAD:model-casp-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/LogoutRequest1.java
    public Boolean isMntncAllwd() {
        return mntncAllwd;
    }

    /**
     * Sets the value of the mntncAllwd property.
=======
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
>>>>>>> origin/main:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/UpdatedAdditionalInformation18.java
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
<<<<<<< HEAD:model-casp-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/LogoutRequest1.java
    public LogoutRequest1 setMntncAllwd(Boolean value) {
        this.mntncAllwd = value;
=======
    public UpdatedAdditionalInformation18 setAddtlInf(String value) {
        this.addtlInf = value;
>>>>>>> origin/main:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/UpdatedAdditionalInformation18.java
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
