
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
 * Characteristics of one or all standing orders set by the member and managed by the transaction administrator.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderOrAll1Choice", propOrder = {
    "stgOrdr",
    "allStgOrdrs"
})
public class StandingOrderOrAll1Choice {

    @XmlElement(name = "StgOrdr")
    protected List<StandingOrderIdentification2> stgOrdr;
    @XmlElement(name = "AllStgOrdrs")
    protected List<StandingOrderIdentification3> allStgOrdrs;

    /**
     * Gets the value of the stgOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stgOrdr property.
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
     * {@link StandingOrderIdentification2 }
     * 
     * 
     * @return
     *     The value of the stgOrdr property.
     */
    public List<StandingOrderIdentification2> getStgOrdr() {
        if (stgOrdr == null) {
            stgOrdr = new ArrayList<>();
        }
        return this.stgOrdr;
    }

    /**
     * Gets the value of the allStgOrdrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allStgOrdrs property.
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
     * {@link StandingOrderIdentification3 }
     * 
     * 
     * @return
     *     The value of the allStgOrdrs property.
     */
    public List<StandingOrderIdentification3> getAllStgOrdrs() {
        if (allStgOrdrs == null) {
            allStgOrdrs = new ArrayList<>();
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
    public StandingOrderOrAll1Choice addStgOrdr(StandingOrderIdentification2 stgOrdr) {
        getStgOrdr().add(stgOrdr);
        return this;
    }

    /**
     * Adds a new item to the allStgOrdrs list.
     * @see #getAllStgOrdrs()
     * 
     */
    public StandingOrderOrAll1Choice addAllStgOrdrs(StandingOrderIdentification3 allStgOrdrs) {
        getAllStgOrdrs().add(allStgOrdrs);
        return this;
    }

}
