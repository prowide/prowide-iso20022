
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies regulatory stipulations that financial institutions must be compliant with in the country, region, and/or area they conduct business.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryStipulations1", propOrder = {
    "ctry",
    "stiptns"
})
public class RegulatoryStipulations1 {

    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "Stiptns", required = true)
    protected List<String> stiptns;

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
    public RegulatoryStipulations1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the stiptns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stiptns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStiptns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStiptns() {
        if (stiptns == null) {
            stiptns = new ArrayList<String>();
        }
        return this.stiptns;
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
     * Adds a new item to the stiptns list.
     * @see #getStiptns()
     * 
     */
    public RegulatoryStipulations1 addStiptns(String stiptns) {
        getStiptns().add(stiptns);
        return this;
    }

}
