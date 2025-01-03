
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
 * Set of elements used to provide information on the underlying statement entry.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingStatementEntry2", propOrder = {
    "orgnlGrpInf",
    "orgnlStmtId",
    "orgnlNtryId"
})
public class UnderlyingStatementEntry2 {

    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "OrgnlStmtId")
    protected String orgnlStmtId;
    @XmlElement(name = "OrgnlNtryId")
    protected String orgnlNtryId;

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public UnderlyingStatementEntry2 setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
        return this;
    }

    /**
     * Gets the value of the orgnlStmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlStmtId() {
        return orgnlStmtId;
    }

    /**
     * Sets the value of the orgnlStmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnderlyingStatementEntry2 setOrgnlStmtId(String value) {
        this.orgnlStmtId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNtryId() {
        return orgnlNtryId;
    }

    /**
     * Sets the value of the orgnlNtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UnderlyingStatementEntry2 setOrgnlNtryId(String value) {
        this.orgnlNtryId = value;
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
