
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Describes the characteristics of a portfolio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Portfolio1", propOrder = {
    "prtflInf"
})
public class Portfolio1 {

    @XmlElement(name = "PrtflInf")
    protected List<String> prtflInf;

    /**
     * Gets the value of the prtflInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prtflInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtflInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the prtflInf property.
     */
    public List<String> getPrtflInf() {
        if (prtflInf == null) {
            prtflInf = new ArrayList<>();
        }
        return this.prtflInf;
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
     * Adds a new item to the prtflInf list.
     * @see #getPrtflInf()
     * 
     */
    public Portfolio1 addPrtflInf(String prtflInf) {
        getPrtflInf().add(prtflInf);
        return this;
    }

}
