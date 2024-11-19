
package com.prowidesoftware.swift.model.mx.dic;

<<<<<<< HEAD:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/RejectedStatusReason56.java
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
=======
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
>>>>>>> origin/main:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/RejectedStatusReason54.java
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Reason for a rejected instruction status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
<<<<<<< HEAD:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/RejectedStatusReason56.java
@XmlType(name = "RejectedStatusReason56", propOrder = {
    "rsnCd",
    "addtlRsnInf"
})
public class RejectedStatusReason56 {

    @XmlElement(name = "RsnCd", required = true)
    protected RejectedReason60Choice rsnCd;
=======
@XmlType(name = "RejectedStatusReason54", propOrder = {
    "rsnCd",
    "addtlRsnInf"
})
public class RejectedStatusReason54 {

    @XmlElement(name = "RsnCd", required = true)
    protected RejectedReason57Choice rsnCd;
>>>>>>> origin/main:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/RejectedStatusReason54.java
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;

    /**
     * Gets the value of the rsnCd property.
     * 
     * @return
     *     possible object is
<<<<<<< HEAD:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/RejectedStatusReason56.java
     *     {@link RejectedReason60Choice }
     *     
     */
    public RejectedReason60Choice getRsnCd() {
=======
     *     {@link RejectedReason57Choice }
     *     
     */
    public RejectedReason57Choice getRsnCd() {
>>>>>>> origin/main:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/RejectedStatusReason54.java
        return rsnCd;
    }

    /**
     * Sets the value of the rsnCd property.
     * 
     * @param value
     *     allowed object is
<<<<<<< HEAD:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/RejectedStatusReason56.java
     *     {@link RejectedReason60Choice }
     *     
     */
    public RejectedStatusReason56 setRsnCd(RejectedReason60Choice value) {
=======
     *     {@link RejectedReason57Choice }
     *     
     */
    public RejectedStatusReason54 setRsnCd(RejectedReason57Choice value) {
>>>>>>> origin/main:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/RejectedStatusReason54.java
        this.rsnCd = value;
        return this;
    }

    /**
     * Gets the value of the addtlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Sets the value of the addtlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/RejectedStatusReason56.java
    public RejectedStatusReason56 setAddtlRsnInf(String value) {
=======
    public RejectedStatusReason54 setAddtlRsnInf(String value) {
>>>>>>> origin/main:model-seev-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/RejectedStatusReason54.java
        this.addtlRsnInf = value;
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
