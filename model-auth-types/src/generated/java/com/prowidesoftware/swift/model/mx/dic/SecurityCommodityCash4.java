
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
 * Indication of the type of assets subject of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCommodityCash4", propOrder = {
    "scty",
    "cmmdty",
    "csh"
})
public class SecurityCommodityCash4 {

    @XmlElement(name = "Scty")
    protected List<Security48> scty;
    @XmlElement(name = "Cmmdty")
    protected List<Commodity42> cmmdty;
    @XmlElement(name = "Csh")
    protected List<CashCompare3> csh;

    /**
     * Gets the value of the scty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Security48 }
     * 
     * 
     */
    public List<Security48> getScty() {
        if (scty == null) {
            scty = new ArrayList<Security48>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cmmdty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmmdty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commodity42 }
     * 
     * 
     */
    public List<Commodity42> getCmmdty() {
        if (cmmdty == null) {
            cmmdty = new ArrayList<Commodity42>();
        }
        return this.cmmdty;
    }

    /**
     * Gets the value of the csh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the csh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashCompare3 }
     * 
     * 
     */
    public List<CashCompare3> getCsh() {
        if (csh == null) {
            csh = new ArrayList<CashCompare3>();
        }
        return this.csh;
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
     * Adds a new item to the scty list.
     * @see #getScty()
     * 
     */
    public SecurityCommodityCash4 addScty(Security48 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the cmmdty list.
     * @see #getCmmdty()
     * 
     */
    public SecurityCommodityCash4 addCmmdty(Commodity42 cmmdty) {
        getCmmdty().add(cmmdty);
        return this;
    }

    /**
     * Adds a new item to the csh list.
     * @see #getCsh()
     * 
     */
    public SecurityCommodityCash4 addCsh(CashCompare3 csh) {
        getCsh().add(csh);
        return this;
    }

}
