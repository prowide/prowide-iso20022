
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
 * Provides for each collateral account the report summary and the valuation of each piece of collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Collateral5", propOrder = {
    "acctId",
    "rptSummry",
    "collValtnDtls"
})
public class Collateral5 {

    @XmlElement(name = "AcctId", required = true)
    protected CollateralAccount1 acctId;
    @XmlElement(name = "RptSummry", required = true)
    protected Summary1 rptSummry;
    @XmlElement(name = "CollValtnDtls")
    protected List<CollateralValuation1> collValtnDtls;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccount1 }
     *     
     */
    public CollateralAccount1 getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccount1 }
     *     
     */
    public Collateral5 setAcctId(CollateralAccount1 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the rptSummry property.
     * 
     * @return
     *     possible object is
     *     {@link Summary1 }
     *     
     */
    public Summary1 getRptSummry() {
        return rptSummry;
    }

    /**
     * Sets the value of the rptSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary1 }
     *     
     */
    public Collateral5 setRptSummry(Summary1 value) {
        this.rptSummry = value;
        return this;
    }

    /**
     * Gets the value of the collValtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collValtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollValtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralValuation1 }
     * 
     * 
     */
    public List<CollateralValuation1> getCollValtnDtls() {
        if (collValtnDtls == null) {
            collValtnDtls = new ArrayList<CollateralValuation1>();
        }
        return this.collValtnDtls;
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
     * Adds a new item to the collValtnDtls list.
     * @see #getCollValtnDtls()
     * 
     */
    public Collateral5 addCollValtnDtls(CollateralValuation1 collValtnDtls) {
        getCollValtnDtls().add(collValtnDtls);
        return this;
    }

}
