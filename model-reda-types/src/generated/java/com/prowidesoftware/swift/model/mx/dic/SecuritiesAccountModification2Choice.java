
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies which information are involved by a modification request for securities account reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountModification2Choice", propOrder = {
    "sysSctiesAcct",
    "sysRstrctn",
    "mktSpcfcAttr"
})
public class SecuritiesAccountModification2Choice {

    @XmlElement(name = "SysSctiesAcct")
    protected SystemSecuritiesAccount5 sysSctiesAcct;
    @XmlElement(name = "SysRstrctn")
    protected SystemRestriction1 sysRstrctn;
    @XmlElement(name = "MktSpcfcAttr")
    protected MarketSpecificAttribute1 mktSpcfcAttr;

    /**
     * Gets the value of the sysSctiesAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SystemSecuritiesAccount5 }
     *     
     */
    public SystemSecuritiesAccount5 getSysSctiesAcct() {
        return sysSctiesAcct;
    }

    /**
     * Sets the value of the sysSctiesAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemSecuritiesAccount5 }
     *     
     */
    public SecuritiesAccountModification2Choice setSysSctiesAcct(SystemSecuritiesAccount5 value) {
        this.sysSctiesAcct = value;
        return this;
    }

    /**
     * Gets the value of the sysRstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link SystemRestriction1 }
     *     
     */
    public SystemRestriction1 getSysRstrctn() {
        return sysRstrctn;
    }

    /**
     * Sets the value of the sysRstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemRestriction1 }
     *     
     */
    public SecuritiesAccountModification2Choice setSysRstrctn(SystemRestriction1 value) {
        this.sysRstrctn = value;
        return this;
    }

    /**
     * Gets the value of the mktSpcfcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSpecificAttribute1 }
     *     
     */
    public MarketSpecificAttribute1 getMktSpcfcAttr() {
        return mktSpcfcAttr;
    }

    /**
     * Sets the value of the mktSpcfcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSpecificAttribute1 }
     *     
     */
    public SecuritiesAccountModification2Choice setMktSpcfcAttr(MarketSpecificAttribute1 value) {
        this.mktSpcfcAttr = value;
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

}
