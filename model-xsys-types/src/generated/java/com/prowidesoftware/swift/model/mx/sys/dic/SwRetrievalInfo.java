
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for RetrievalInfo complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievalInfo", propOrder = {
    "retrievalDirection",
    "retrievalSnFRef",
    "retrievalUserRef",
    "retrievalSeq",
    "retrievalFinal"
})
public class SwRetrievalInfo {

    @XmlElement(name = "RetrievalDirection", required = true)
    protected String retrievalDirection;
    @XmlElement(name = "RetrievalSnFRef")
    protected String retrievalSnFRef;
    @XmlElement(name = "RetrievalUserRef")
    protected String retrievalUserRef;
    @XmlElement(name = "RetrievalSeq", required = true)
    protected String retrievalSeq;
    @XmlElement(name = "RetrievalFinal", required = true)
    protected String retrievalFinal;

    /**
     * Gets the value of the retrievalDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalDirection() {
        return retrievalDirection;
    }

    /**
     * Sets the value of the retrievalDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRetrievalInfo setRetrievalDirection(String value) {
        this.retrievalDirection = value;
        return this;
    }

    /**
     * Gets the value of the retrievalSnFRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalSnFRef() {
        return retrievalSnFRef;
    }

    /**
     * Sets the value of the retrievalSnFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRetrievalInfo setRetrievalSnFRef(String value) {
        this.retrievalSnFRef = value;
        return this;
    }

    /**
     * Gets the value of the retrievalUserRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalUserRef() {
        return retrievalUserRef;
    }

    /**
     * Sets the value of the retrievalUserRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRetrievalInfo setRetrievalUserRef(String value) {
        this.retrievalUserRef = value;
        return this;
    }

    /**
     * Gets the value of the retrievalSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalSeq() {
        return retrievalSeq;
    }

    /**
     * Sets the value of the retrievalSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRetrievalInfo setRetrievalSeq(String value) {
        this.retrievalSeq = value;
        return this;
    }

    /**
     * Gets the value of the retrievalFinal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalFinal() {
        return retrievalFinal;
    }

    /**
     * Sets the value of the retrievalFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwRetrievalInfo setRetrievalFinal(String value) {
        this.retrievalFinal = value;
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
