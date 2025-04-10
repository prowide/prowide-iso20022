
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
@XmlType(name = "SecurityCommodity8", propOrder = {
    "scty",
    "cmmdty"
})
public class SecurityCommodity8 {

    @XmlElement(name = "Scty")
    protected List<Security15> scty;
    @XmlElement(name = "Cmmdty")
    protected List<Commodity20> cmmdty;

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
     * {@link Security15 }
     * 
     * 
     * @return
     *     The value of the scty property.
     */
    public List<Security15> getScty() {
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
     * {@link Commodity20 }
     * 
     * 
     * @return
     *     The value of the cmmdty property.
     */
    public List<Commodity20> getCmmdty() {
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
    public SecurityCommodity8 addScty(Security15 scty) {
        getScty().add(scty);
        return this;
    }

    /**
     * Adds a new item to the cmmdty list.
     * @see #getCmmdty()
     * 
     */
    public SecurityCommodity8 addCmmdty(Commodity20 cmmdty) {
        getCmmdty().add(cmmdty);
        return this;
    }

}
