
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
 * Provides for each collateral account the report summary and the valuation of each piece of collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral43", propOrder = {
    "acctId",
    "rptSummry",
    "collValtn"
})
public class Collateral43 {

    @XmlElement(name = "AcctId", required = true)
    protected CollateralAccount3 acctId;
    @XmlElement(name = "RptSummry", required = true)
    protected Summary2 rptSummry;
    @XmlElement(name = "CollValtn")
    protected List<CollateralValuation12> collValtn;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccount3 }
     *     
     */
    public CollateralAccount3 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccount3 }
     *     
     */
    public Collateral43 setAcctId(CollateralAccount3 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the rptSummry property.
     * 
     * @return
     *     possible object is
     *     {@link Summary2 }
     *     
     */
    public Summary2 getRptSummry() {
        return rptSummry;
    }

    /**
     * Sets the value of the rptSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary2 }
     *     
     */
    public Collateral43 setRptSummry(Summary2 value) {
        this.rptSummry = value;
        return this;
    }

    /**
     * Gets the value of the collValtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collValtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollValtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValuation12 }
     * 
     * 
     * @return
     *     The value of the collValtn property.
     */
    public List<CollateralValuation12> getCollValtn() {
        if (collValtn == null) {
            collValtn = new ArrayList<>();
        }
        return this.collValtn;
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
     * Adds a new item to the collValtn list.
     * @see #getCollValtn()
     * 
     */
    public Collateral43 addCollValtn(CollateralValuation12 collValtn) {
        getCollValtn().add(collValtn);
        return this;
    }

}
