
package com.prowidesoftware.swift.model.mx.dic;

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
 * Indicates the reason for which the contract has not been cleared.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonClearingReason2", propOrder = {
    "clrXmptnXcptn",
    "nonClrRsnInf"
})
public class NonClearingReason2 {

    @XmlElement(name = "ClrXmptnXcptn", required = true)
    @XmlSchemaType(name = "string")
    protected List<ClearingExemptionException1Code> clrXmptnXcptn;
    @XmlElement(name = "NonClrRsnInf")
    protected String nonClrRsnInf;

    /**
     * Gets the value of the clrXmptnXcptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clrXmptnXcptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrXmptnXcptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingExemptionException1Code }
     * 
     * 
     */
    public List<ClearingExemptionException1Code> getClrXmptnXcptn() {
        if (clrXmptnXcptn == null) {
            clrXmptnXcptn = new ArrayList<ClearingExemptionException1Code>();
        }
        return this.clrXmptnXcptn;
    }

    /**
     * Gets the value of the nonClrRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonClrRsnInf() {
        return nonClrRsnInf;
    }

    /**
     * Sets the value of the nonClrRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NonClearingReason2 setNonClrRsnInf(String value) {
        this.nonClrRsnInf = value;
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

    /**
     * Adds a new item to the clrXmptnXcptn list.
     * @see #getClrXmptnXcptn()
     * 
     */
    public NonClearingReason2 addClrXmptnXcptn(ClearingExemptionException1Code clrXmptnXcptn) {
        getClrXmptnXcptn().add(clrXmptnXcptn);
        return this;
    }

}
