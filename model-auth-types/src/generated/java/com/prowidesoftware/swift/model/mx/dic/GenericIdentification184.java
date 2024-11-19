
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
<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/GenericIdentification184.java
 * Information related to an identification, for example, party identification or account identification.
=======
 * Information about an post trade risk reduction identifier.
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PostTradeRiskReductionIdentifier1.java
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/GenericIdentification184.java
@XmlType(name = "GenericIdentification184", propOrder = {
    "id",
    "src"
})
public class GenericIdentification184 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Src", required = true)
    protected String src;

    /**
     * Gets the value of the id property.
=======
@XmlType(name = "PostTradeRiskReductionIdentifier1", propOrder = {
    "strr",
    "id"
})
public class PostTradeRiskReductionIdentifier1 {

    @XmlElement(name = "Strr", required = true)
    protected String strr;
    @XmlElement(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the strr property.
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PostTradeRiskReductionIdentifier1.java
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/GenericIdentification184.java
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
=======
    public String getStrr() {
        return strr;
    }

    /**
     * Sets the value of the strr property.
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PostTradeRiskReductionIdentifier1.java
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/GenericIdentification184.java
    public GenericIdentification184 setId(String value) {
        this.id = value;
=======
    public PostTradeRiskReductionIdentifier1 setStrr(String value) {
        this.strr = value;
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PostTradeRiskReductionIdentifier1.java
        return this;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/GenericIdentification184.java
    public String getSrc() {
        return src;
=======
    public String getId() {
        return id;
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PostTradeRiskReductionIdentifier1.java
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/GenericIdentification184.java
    public GenericIdentification184 setSrc(String value) {
        this.src = value;
=======
    public PostTradeRiskReductionIdentifier1 setId(String value) {
        this.id = value;
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/PostTradeRiskReductionIdentifier1.java
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
