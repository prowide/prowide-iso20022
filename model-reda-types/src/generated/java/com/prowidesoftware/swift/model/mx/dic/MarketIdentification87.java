
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies the market and purpose for the settlement. 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketIdentification87", propOrder = {
    "ctry",
    "clssfctnTp",
    "sttlmPurp"
})
public class MarketIdentification87 {

    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "ClssfctnTp", required = true)
    protected ClassificationType1Choice clssfctnTp;
    @XmlElement(name = "SttlmPurp")
    protected Purpose3Choice sttlmPurp;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarketIdentification87 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType1Choice }
     *     
     */
    public ClassificationType1Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType1Choice }
     *     
     */
    public MarketIdentification87 setClssfctnTp(ClassificationType1Choice value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPurp property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose3Choice }
     *     
     */
    public Purpose3Choice getSttlmPurp() {
        return sttlmPurp;
    }

    /**
     * Sets the value of the sttlmPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose3Choice }
     *     
     */
    public MarketIdentification87 setSttlmPurp(Purpose3Choice value) {
        this.sttlmPurp = value;
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
