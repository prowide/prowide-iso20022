
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
@XmlType(name = "Collateral53", propOrder = {
    "acctId",
    "blckChainAdrOrWllt",
    "rptSummry",
    "collValtn"
})
public class Collateral53 {

    @XmlElement(name = "AcctId")
    protected CollateralAccount3 acctId;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet5 blckChainAdrOrWllt;
    @XmlElement(name = "RptSummry", required = true)
    protected Summary3 rptSummry;
    @XmlElement(name = "CollValtn")
    protected List<CollateralValuation13> collValtn;

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
    public Collateral53 setAcctId(CollateralAccount3 value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public BlockChainAddressWallet5 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public Collateral53 setBlckChainAdrOrWllt(BlockChainAddressWallet5 value) {
        this.blckChainAdrOrWllt = value;
        return this;
    }

    /**
     * Gets the value of the rptSummry property.
     * 
     * @return
     *     possible object is
     *     {@link Summary3 }
     *     
     */
    public Summary3 getRptSummry() {
        return rptSummry;
    }

    /**
     * Sets the value of the rptSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Summary3 }
     *     
     */
    public Collateral53 setRptSummry(Summary3 value) {
        this.rptSummry = value;
        return this;
    }

    /**
     * Gets the value of the collValtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collValtn property.
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
     * {@link CollateralValuation13 }
     * 
     * 
     */
    public List<CollateralValuation13> getCollValtn() {
        if (collValtn == null) {
            collValtn = new ArrayList<CollateralValuation13>();
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
    public Collateral53 addCollValtn(CollateralValuation13 collValtn) {
        getCollValtn().add(collValtn);
        return this;
    }

}
