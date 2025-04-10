
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
 * Provides the collateral details for the secured markets.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuredCollateral2Choice", propOrder = {
    "snglColl",
    "mltplColl",
    "poolColl",
    "othrColl"
})
public class SecuredCollateral2Choice {

    @XmlElement(name = "SnglColl")
    protected CollateralValuation6 snglColl;
    @XmlElement(name = "MltplColl")
    protected List<CollateralValuation6> mltplColl;
    @XmlElement(name = "PoolColl")
    protected CollateralValuation6 poolColl;
    @XmlElement(name = "OthrColl")
    protected List<CollateralValuation7> othrColl;

    /**
     * Gets the value of the snglColl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValuation6 }
     *     
     */
    public CollateralValuation6 getSnglColl() {
        return snglColl;
    }

    /**
     * Sets the value of the snglColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValuation6 }
     *     
     */
    public SecuredCollateral2Choice setSnglColl(CollateralValuation6 value) {
        this.snglColl = value;
        return this;
    }

    /**
     * Gets the value of the mltplColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mltplColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMltplColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValuation6 }
     * 
     * 
     * @return
     *     The value of the mltplColl property.
     */
    public List<CollateralValuation6> getMltplColl() {
        if (mltplColl == null) {
            mltplColl = new ArrayList<>();
        }
        return this.mltplColl;
    }

    /**
     * Gets the value of the poolColl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValuation6 }
     *     
     */
    public CollateralValuation6 getPoolColl() {
        return poolColl;
    }

    /**
     * Sets the value of the poolColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValuation6 }
     *     
     */
    public SecuredCollateral2Choice setPoolColl(CollateralValuation6 value) {
        this.poolColl = value;
        return this;
    }

    /**
     * Gets the value of the othrColl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrColl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrColl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValuation7 }
     * 
     * 
     * @return
     *     The value of the othrColl property.
     */
    public List<CollateralValuation7> getOthrColl() {
        if (othrColl == null) {
            othrColl = new ArrayList<>();
        }
        return this.othrColl;
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
     * Adds a new item to the mltplColl list.
     * @see #getMltplColl()
     * 
     */
    public SecuredCollateral2Choice addMltplColl(CollateralValuation6 mltplColl) {
        getMltplColl().add(mltplColl);
        return this;
    }

    /**
     * Adds a new item to the othrColl list.
     * @see #getOthrColl()
     * 
     */
    public SecuredCollateral2Choice addOthrColl(CollateralValuation7 othrColl) {
        getOthrColl().add(othrColl);
        return this;
    }

}
