
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
 * Provides information for the first side of the transaction on the type of collateral.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralType21", propOrder = {
    "scty",
    "csh",
    "cmmdty"
})
public class CollateralType21 {

    @XmlElement(name = "Scty")
    protected List<Security52> scty;
    @XmlElement(name = "Csh")
    protected List<AmountHaircutMargin1> csh;
    @XmlElement(name = "Cmmdty")
    protected List<Commodity43> cmmdty;

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
     * {@link Security52 }
     * 
     * 
     */
    public List<Security52> getScty() {
        if (scty == null) {
            scty = new ArrayList<Security52>();
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
     * {@link AmountHaircutMargin1 }
     * 
     * 
     */
    public List<AmountHaircutMargin1> getCsh() {
        if (csh == null) {
            csh = new ArrayList<AmountHaircutMargin1>();
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
     * {@link Commodity43 }
     * 
     * 
     */
    public List<Commodity43> getCmmdty() {
        if (cmmdty == null) {
            cmmdty = new ArrayList<Commodity43>();
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
    public CollateralType21 addScty(Security52 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the csh list.
     * @see #getCsh()
     * 
     */
    public CollateralType21 addCsh(AmountHaircutMargin1 csh) {
        getCsh().add(csh);
        return this;
    }

    /**
     * Adds a new item to the cmmdty list.
     * @see #getCmmdty()
     * 
     */
    public CollateralType21 addCmmdty(Commodity43 cmmdty) {
        getCmmdty().add(cmmdty);
        return this;
    }

}
