
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
 * Specifies the remittance resource for direct access to the remittance information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Remittance1", propOrder = {
    "ustrd",
    "strd",
    "rltd"
})
public class Remittance1 {

    @XmlElement(name = "Ustrd")
    protected List<String> ustrd;
    @XmlElement(name = "Strd")
    protected List<StructuredRemittanceInformation16> strd;
    @XmlElement(name = "Rltd")
    protected List<RemittanceLocation7> rltd;

    /**
     * Gets the value of the ustrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ustrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUstrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the ustrd property.
     */
    public List<String> getUstrd() {
        if (ustrd == null) {
            ustrd = new ArrayList<>();
        }
        return this.ustrd;
    }

    /**
     * Gets the value of the strd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the strd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StructuredRemittanceInformation16 }
     * 
     * 
     * @return
     *     The value of the strd property.
     */
    public List<StructuredRemittanceInformation16> getStrd() {
        if (strd == null) {
            strd = new ArrayList<>();
        }
        return this.strd;
    }

    /**
     * Gets the value of the rltd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation7 }
     * 
     * 
     * @return
     *     The value of the rltd property.
     */
    public List<RemittanceLocation7> getRltd() {
        if (rltd == null) {
            rltd = new ArrayList<>();
        }
        return this.rltd;
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
     * Adds a new item to the ustrd list.
     * @see #getUstrd()
     * 
     */
    public Remittance1 addUstrd(String ustrd) {
        getUstrd().add(ustrd);
        return this;
    }

    /**
     * Adds a new item to the strd list.
     * @see #getStrd()
     * 
     */
    public Remittance1 addStrd(StructuredRemittanceInformation16 strd) {
        getStrd().add(strd);
        return this;
    }

    /**
     * Adds a new item to the rltd list.
     * @see #getRltd()
     * 
     */
    public Remittance1 addRltd(RemittanceLocation7 rltd) {
        getRltd().add(rltd);
        return this;
    }

}
