
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
 * Provides the collateral status of an instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralStatus3Choice", propOrder = {
    "pdg",
    "prtry"
})
public class CollateralStatus3Choice {

    @XmlElement(name = "Pdg")
    protected List<ProprietaryReason4> pdg;
    @XmlElement(name = "Prtry")
    protected List<ProprietaryStatusAndReason6> prtry;

    /**
     * Gets the value of the pdg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryReason4 }
     * 
     * 
     */
    public List<ProprietaryReason4> getPdg() {
        if (pdg == null) {
            pdg = new ArrayList<ProprietaryReason4>();
        }
        return this.pdg;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryStatusAndReason6 }
     * 
     * 
     */
    public List<ProprietaryStatusAndReason6> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<ProprietaryStatusAndReason6>();
        }
        return this.prtry;
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
     * Adds a new item to the pdg list.
     * @see #getPdg()
     * 
     */
    public CollateralStatus3Choice addPdg(ProprietaryReason4 pdg) {
        getPdg().add(pdg);
        return this;
    }

    /**
     * Adds a new item to the prtry list.
     * @see #getPrtry()
     * 
     */
    public CollateralStatus3Choice addPrtry(ProprietaryStatusAndReason6 prtry) {
        getPrtry().add(prtry);
        return this;
    }

}
