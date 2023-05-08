
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between selected investment plans issued during previous years or all investment plans.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousYear2Choice", propOrder = {
    "allPrvsYrs",
    "spcfcPrvsYrs"
})
public class PreviousYear2Choice {

    @XmlElement(name = "AllPrvsYrs")
    protected String allPrvsYrs;
    @XmlElement(name = "SpcfcPrvsYrs")
    @XmlSchemaType(name = "gYear")
    protected List<XMLGregorianCalendar> spcfcPrvsYrs;

    /**
     * Gets the value of the allPrvsYrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllPrvsYrs() {
        return allPrvsYrs;
    }

    /**
     * Sets the value of the allPrvsYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PreviousYear2Choice setAllPrvsYrs(String value) {
        this.allPrvsYrs = value;
        return this;
    }

    /**
     * Gets the value of the spcfcPrvsYrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spcfcPrvsYrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpcfcPrvsYrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     * @return
     *     The value of the spcfcPrvsYrs property.
     */
    public List<XMLGregorianCalendar> getSpcfcPrvsYrs() {
        if (spcfcPrvsYrs == null) {
            spcfcPrvsYrs = new ArrayList<>();
        }
        return this.spcfcPrvsYrs;
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
     * Adds a new item to the spcfcPrvsYrs list.
     * @see #getSpcfcPrvsYrs()
     * 
     */
    public PreviousYear2Choice addSpcfcPrvsYrs(XMLGregorianCalendar spcfcPrvsYrs) {
        getSpcfcPrvsYrs().add(spcfcPrvsYrs);
        return this;
    }

}
