
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
 * Provides the agreed amount and the collateral movement direction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMovement7", propOrder = {
    "agrdAmt",
    "mvmntDrctn"
})
public class CollateralMovement7 {

    @XmlElement(name = "AgrdAmt", required = true)
    protected ActiveCurrencyAndAmount agrdAmt;
    @XmlElement(name = "MvmntDrctn")
    protected List<CollateralMovement4Choice> mvmntDrctn;

    /**
     * Gets the value of the agrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAgrdAmt() {
        return agrdAmt;
    }

    /**
     * Sets the value of the agrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralMovement7 setAgrdAmt(ActiveCurrencyAndAmount value) {
        this.agrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the mvmntDrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mvmntDrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMvmntDrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralMovement4Choice }
     * 
     * 
     */
    public List<CollateralMovement4Choice> getMvmntDrctn() {
        if (mvmntDrctn == null) {
            mvmntDrctn = new ArrayList<CollateralMovement4Choice>();
        }
        return this.mvmntDrctn;
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
     * Adds a new item to the mvmntDrctn list.
     * @see #getMvmntDrctn()
     * 
     */
    public CollateralMovement7 addMvmntDrctn(CollateralMovement4Choice mvmntDrctn) {
        getMvmntDrctn().add(mvmntDrctn);
        return this;
    }

}
