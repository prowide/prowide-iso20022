
package com.prowidesoftware.swift.model.mx.dic;

<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/FloatingRateIdentification8Choice.java
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
=======
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/TradeCounterpartyRelationship1Choice.java
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/FloatingRateIdentification8Choice.java
 * Identifies various types of floating rates.
=======
 * Specifies the relationship type between parties to the transaction.
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/TradeCounterpartyRelationship1Choice.java
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/FloatingRateIdentification8Choice.java
@XmlType(name = "FloatingRateIdentification8Choice", propOrder = {
    "cd",
    "prtry"
})
public class FloatingRateIdentification8Choice {
=======
@XmlType(name = "TradeCounterpartyRelationship1Choice", propOrder = {
    "cd",
    "prtry"
})
public class TradeCounterpartyRelationship1Choice {
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/TradeCounterpartyRelationship1Choice.java

    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/FloatingRateIdentification8Choice.java
    public FloatingRateIdentification8Choice setCd(String value) {
=======
    public TradeCounterpartyRelationship1Choice setCd(String value) {
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/TradeCounterpartyRelationship1Choice.java
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
<<<<<<< HEAD:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/FloatingRateIdentification8Choice.java
    public FloatingRateIdentification8Choice setPrtry(String value) {
=======
    public TradeCounterpartyRelationship1Choice setPrtry(String value) {
>>>>>>> origin/main:model-auth-types/src/generated/java/com/prowidesoftware/swift/model/mx/dic/TradeCounterpartyRelationship1Choice.java
        this.prtry = value;
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
