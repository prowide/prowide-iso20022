
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
 * Provides additional information on the collateral account of the party delivering/receiving the collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAccount4", propOrder = {
    "id",
    "asstHldg"
})
public class CollateralAccount4 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification165 id;
    @XmlElement(name = "AsstHldg", required = true)
    protected List<AssetHolding1> asstHldg;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public CollateralAccount4 setId(GenericIdentification165 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the asstHldg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the asstHldg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsstHldg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetHolding1 }
     * 
     * 
     * @return
     *     The value of the asstHldg property.
     */
    public List<AssetHolding1> getAsstHldg() {
        if (asstHldg == null) {
            asstHldg = new ArrayList<>();
        }
        return this.asstHldg;
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
     * Adds a new item to the asstHldg list.
     * @see #getAsstHldg()
     * 
     */
    public CollateralAccount4 addAsstHldg(AssetHolding1 asstHldg) {
        getAsstHldg().add(asstHldg);
        return this;
    }

}
