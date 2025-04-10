
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
 * Characteristics of one or all standing orders set by the member and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderOrAll4Choice", propOrder = {
    "stgOrdr",
    "allStgOrdrs"
})
public class StandingOrderOrAll4Choice {

    @XmlElement(name = "StgOrdr")
    protected List<StandingOrderIdentification8> stgOrdr;
    @XmlElement(name = "AllStgOrdrs")
    protected List<StandingOrderIdentification9> allStgOrdrs;

    /**
     * Gets the value of the stgOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stgOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStgOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandingOrderIdentification8 }
     * 
     * 
     */
    public List<StandingOrderIdentification8> getStgOrdr() {
        if (stgOrdr == null) {
            stgOrdr = new ArrayList<StandingOrderIdentification8>();
        }
        return this.stgOrdr;
    }

    /**
     * Gets the value of the allStgOrdrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allStgOrdrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllStgOrdrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandingOrderIdentification9 }
     * 
     * 
     */
    public List<StandingOrderIdentification9> getAllStgOrdrs() {
        if (allStgOrdrs == null) {
            allStgOrdrs = new ArrayList<StandingOrderIdentification9>();
        }
        return this.allStgOrdrs;
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
     * Adds a new item to the stgOrdr list.
     * @see #getStgOrdr()
     * 
     */
    public StandingOrderOrAll4Choice addStgOrdr(StandingOrderIdentification8 stgOrdr) {
        getStgOrdr().add(stgOrdr);
        return this;
    }

    /**
     * Adds a new item to the allStgOrdrs list.
     * @see #getAllStgOrdrs()
     * 
     */
    public StandingOrderOrAll4Choice addAllStgOrdrs(StandingOrderIdentification9 allStgOrdrs) {
        getAllStgOrdrs().add(allStgOrdrs);
        return this;
    }

}
