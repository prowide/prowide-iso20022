
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
 * Provides additional information on the collateral proposal(s), that is either in cash, securities or other types.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralResponse2", propOrder = {
    "sctiesCollRspn",
    "cshCollRspn",
    "othrCollRspn"
})
public class CollateralResponse2 {

    @XmlElement(name = "SctiesCollRspn")
    protected List<SecuritiesCollateralResponse1> sctiesCollRspn;
    @XmlElement(name = "CshCollRspn")
    protected List<CashCollateralResponse2> cshCollRspn;
    @XmlElement(name = "OthrCollRspn")
    protected List<OtherCollateralResponse2> othrCollRspn;

    /**
     * Gets the value of the sctiesCollRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesCollRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesCollRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesCollateralResponse1 }
     * 
     * 
     * @return
     *     The value of the sctiesCollRspn property.
     */
    public List<SecuritiesCollateralResponse1> getSctiesCollRspn() {
        if (sctiesCollRspn == null) {
            sctiesCollRspn = new ArrayList<>();
        }
        return this.sctiesCollRspn;
    }

    /**
     * Gets the value of the cshCollRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshCollRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshCollRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashCollateralResponse2 }
     * 
     * 
     * @return
     *     The value of the cshCollRspn property.
     */
    public List<CashCollateralResponse2> getCshCollRspn() {
        if (cshCollRspn == null) {
            cshCollRspn = new ArrayList<>();
        }
        return this.cshCollRspn;
    }

    /**
     * Gets the value of the othrCollRspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrCollRspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCollRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherCollateralResponse2 }
     * 
     * 
     * @return
     *     The value of the othrCollRspn property.
     */
    public List<OtherCollateralResponse2> getOthrCollRspn() {
        if (othrCollRspn == null) {
            othrCollRspn = new ArrayList<>();
        }
        return this.othrCollRspn;
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
     * Adds a new item to the sctiesCollRspn list.
     * @see #getSctiesCollRspn()
     * 
     */
    public CollateralResponse2 addSctiesCollRspn(SecuritiesCollateralResponse1 sctiesCollRspn) {
        getSctiesCollRspn().add(sctiesCollRspn);
        return this;
    }

    /**
     * Adds a new item to the cshCollRspn list.
     * @see #getCshCollRspn()
     * 
     */
    public CollateralResponse2 addCshCollRspn(CashCollateralResponse2 cshCollRspn) {
        getCshCollRspn().add(cshCollRspn);
        return this;
    }

    /**
     * Adds a new item to the othrCollRspn list.
     * @see #getOthrCollRspn()
     * 
     */
    public CollateralResponse2 addOthrCollRspn(OtherCollateralResponse2 othrCollRspn) {
        getOthrCollRspn().add(othrCollRspn);
        return this;
    }

}
