
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
 * Information for the first side of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralType7Choice", propOrder = {
    "scty",
    "csh",
    "cmmdty"
})
public class CollateralType7Choice {

    @XmlElement(name = "Scty")
    protected List<HaircutPortfolioSecurityIdentification1> scty;
    @XmlElement(name = "Csh")
    protected List<ActiveOrHistoricCurrencyAndAmount> csh;
    @XmlElement(name = "Cmmdty")
    protected List<Commodity3> cmmdty;

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
     * {@link HaircutPortfolioSecurityIdentification1 }
     * 
     * 
     */
    public List<HaircutPortfolioSecurityIdentification1> getScty() {
        if (scty == null) {
            scty = new ArrayList<HaircutPortfolioSecurityIdentification1>();
        }
        return this.scty;
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
     * {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * 
     */
    public List<ActiveOrHistoricCurrencyAndAmount> getCsh() {
        if (csh == null) {
            csh = new ArrayList<ActiveOrHistoricCurrencyAndAmount>();
        }
        return this.csh;
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
     * {@link Commodity3 }
     * 
     * 
     */
    public List<Commodity3> getCmmdty() {
        if (cmmdty == null) {
            cmmdty = new ArrayList<Commodity3>();
        }
        return this.cmmdty;
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
    public CollateralType7Choice addScty(HaircutPortfolioSecurityIdentification1 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the csh list.
     * @see #getCsh()
     * 
     */
    public CollateralType7Choice addCsh(ActiveOrHistoricCurrencyAndAmount csh) {
        getCsh().add(csh);
        return this;
    }

    /**
     * Adds a new item to the cmmdty list.
     * @see #getCmmdty()
     * 
     */
    public CollateralType7Choice addCmmdty(Commodity3 cmmdty) {
        getCmmdty().add(cmmdty);
        return this;
    }

}
