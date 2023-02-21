
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
 * Expiry and extension information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpiryDetails2", propOrder = {
    "xpryTerms",
    "addtlXpryInf"
})
public class ExpiryDetails2 {

    @XmlElement(name = "XpryTerms")
    protected ExpiryTerms2 xpryTerms;
    @XmlElement(name = "AddtlXpryInf")
    protected List<String> addtlXpryInf;

    /**
     * Gets the value of the xpryTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryTerms2 }
     *     
     */
    public ExpiryTerms2 getXpryTerms() {
        return xpryTerms;
    }

    /**
     * Sets the value of the xpryTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryTerms2 }
     *     
     */
    public ExpiryDetails2 setXpryTerms(ExpiryTerms2 value) {
        this.xpryTerms = value;
        return this;
    }

    /**
     * Gets the value of the addtlXpryInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlXpryInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlXpryInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlXpryInf() {
        if (addtlXpryInf == null) {
            addtlXpryInf = new ArrayList<String>();
        }
        return this.addtlXpryInf;
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
     * Adds a new item to the addtlXpryInf list.
     * @see #getAddtlXpryInf()
     * 
     */
    public ExpiryDetails2 addAddtlXpryInf(String addtlXpryInf) {
        getAddtlXpryInf().add(addtlXpryInf);
        return this;
    }

}
