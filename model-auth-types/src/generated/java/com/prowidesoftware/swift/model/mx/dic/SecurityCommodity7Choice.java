
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
 * Specifies the type of assets subject of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCommodity7Choice", propOrder = {
    "scty",
    "cmmdty"
})
public class SecurityCommodity7Choice {

    @XmlElement(name = "Scty")
    protected List<Security48> scty;
    @XmlElement(name = "Cmmdty")
    protected List<Commodity42> cmmdty;

    /**
     * Gets the value of the scty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scty property.
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
     * @return
     *     The value of the scty property.
     */
    public List<Security48> getScty() {
        if (scty == null) {
            scty = new ArrayList<>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmmdty property.
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
     * @return
     *     The value of the cmmdty property.
     */
    public List<Commodity42> getCmmdty() {
        if (cmmdty == null) {
            cmmdty = new ArrayList<>();
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
    public SecurityCommodity7Choice addScty(Security48 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the cmmdty list.
     * @see #getCmmdty()
     * 
     */
    public SecurityCommodity7Choice addCmmdty(Commodity42 cmmdty) {
        getCmmdty().add(cmmdty);
        return this;
    }

}
