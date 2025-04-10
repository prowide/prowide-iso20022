
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Configuration of the digital signatures if the security module is able to perform digital signatures with an asymmetric key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityConfiguration4", propOrder = {
    "maxCerts",
    "maxSgntrs",
    "dgtlSgntrAlgo"
})
public class ATMSecurityConfiguration4 {

    @XmlElement(name = "MaxCerts")
    protected BigDecimal maxCerts;
    @XmlElement(name = "MaxSgntrs")
    protected BigDecimal maxSgntrs;
    @XmlElement(name = "DgtlSgntrAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm14Code> dgtlSgntrAlgo;

    /**
     * Gets the value of the maxCerts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxCerts() {
        return maxCerts;
    }

    /**
     * Sets the value of the maxCerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMSecurityConfiguration4 setMaxCerts(BigDecimal value) {
        this.maxCerts = value;
        return this;
    }

    /**
     * Gets the value of the maxSgntrs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxSgntrs() {
        return maxSgntrs;
    }

    /**
     * Sets the value of the maxSgntrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ATMSecurityConfiguration4 setMaxSgntrs(BigDecimal value) {
        this.maxSgntrs = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntrAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgtlSgntrAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntrAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm14Code }
     * 
     * 
     */
    public List<Algorithm14Code> getDgtlSgntrAlgo() {
        if (dgtlSgntrAlgo == null) {
            dgtlSgntrAlgo = new ArrayList<Algorithm14Code>();
        }
        return this.dgtlSgntrAlgo;
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

    /**
     * Adds a new item to the dgtlSgntrAlgo list.
     * @see #getDgtlSgntrAlgo()
     * 
     */
    public ATMSecurityConfiguration4 addDgtlSgntrAlgo(Algorithm14Code dgtlSgntrAlgo) {
        getDgtlSgntrAlgo().add(dgtlSgntrAlgo);
        return this;
    }

}
