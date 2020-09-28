
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
 * Information on collateral used in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralData3", propOrder = {
    "asstTp",
    "bsktIdr"
})
public class CollateralData3 {

    @XmlElement(name = "AsstTp")
    protected List<CollateralType7Choice> asstTp;
    @XmlElement(name = "BsktIdr")
    protected SecurityIdentification26Choice bsktIdr;

    /**
     * Gets the value of the asstTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the asstTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsstTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralType7Choice }
     * 
     * 
     */
    public List<CollateralType7Choice> getAsstTp() {
        if (asstTp == null) {
            asstTp = new ArrayList<CollateralType7Choice>();
        }
        return this.asstTp;
    }

    /**
     * Gets the value of the bsktIdr property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification26Choice }
     *     
     */
    public SecurityIdentification26Choice getBsktIdr() {
        return bsktIdr;
    }

    /**
     * Sets the value of the bsktIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification26Choice }
     *     
     */
    public CollateralData3 setBsktIdr(SecurityIdentification26Choice value) {
        this.bsktIdr = value;
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
     * Adds a new item to the asstTp list.
     * @see #getAsstTp()
     * 
     */
    public CollateralData3 addAsstTp(CollateralType7Choice asstTp) {
        getAsstTp().add(asstTp);
        return this;
    }

}
