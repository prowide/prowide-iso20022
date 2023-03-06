
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
@XmlType(name = "CollateralMovement1", propOrder = {
    "agrdAmt",
    "mvmntDtls"
})
public class CollateralMovement1 {

    @XmlElement(name = "AgrdAmt", required = true)
    protected ActiveCurrencyAndAmount agrdAmt;
    @XmlElement(name = "MvmntDtls")
    protected List<CollateralMovement1Choice> mvmntDtls;

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
    public CollateralMovement1 setAgrdAmt(ActiveCurrencyAndAmount value) {
        this.agrdAmt = value;
        return this;
    }

    /**
     * Gets the value of the mvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralMovement1Choice }
     * 
     * 
     */
    public List<CollateralMovement1Choice> getMvmntDtls() {
        if (mvmntDtls == null) {
            mvmntDtls = new ArrayList<CollateralMovement1Choice>();
        }
        return this.mvmntDtls;
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
     * Adds a new item to the mvmntDtls list.
     * @see #getMvmntDtls()
     * 
     */
    public CollateralMovement1 addMvmntDtls(CollateralMovement1Choice mvmntDtls) {
        getMvmntDtls().add(mvmntDtls);
        return this;
    }

}
