
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
 * Provides the details of the collateral used in the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCollateralData18Choice", propOrder = {
    "rpTrad",
    "buySellBck",
    "sctiesLndg",
    "mrgnLndg"
})
public class TransactionCollateralData18Choice {

    @XmlElement(name = "RpTrad")
    protected Collateral52 rpTrad;
    @XmlElement(name = "BuySellBck")
    protected Collateral52 buySellBck;
    @XmlElement(name = "SctiesLndg")
    protected CollateralFlag13Choice sctiesLndg;
    @XmlElement(name = "MrgnLndg")
    protected List<Security55> mrgnLndg;

    /**
     * Gets the value of the rpTrad property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral52 }
     *     
     */
    public Collateral52 getRpTrad() {
        return rpTrad;
    }

    /**
     * Sets the value of the rpTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral52 }
     *     
     */
    public TransactionCollateralData18Choice setRpTrad(Collateral52 value) {
        this.rpTrad = value;
        return this;
    }

    /**
     * Gets the value of the buySellBck property.
     * 
     * @return
     *     possible object is
     *     {@link Collateral52 }
     *     
     */
    public Collateral52 getBuySellBck() {
        return buySellBck;
    }

    /**
     * Sets the value of the buySellBck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Collateral52 }
     *     
     */
    public TransactionCollateralData18Choice setBuySellBck(Collateral52 value) {
        this.buySellBck = value;
        return this;
    }

    /**
     * Gets the value of the sctiesLndg property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralFlag13Choice }
     *     
     */
    public CollateralFlag13Choice getSctiesLndg() {
        return sctiesLndg;
    }

    /**
     * Sets the value of the sctiesLndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralFlag13Choice }
     *     
     */
    public TransactionCollateralData18Choice setSctiesLndg(CollateralFlag13Choice value) {
        this.sctiesLndg = value;
        return this;
    }

    /**
     * Gets the value of the mrgnLndg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrgnLndg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnLndg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Security55 }
     * 
     * 
     * @return
     *     The value of the mrgnLndg property.
     */
    public List<Security55> getMrgnLndg() {
        if (mrgnLndg == null) {
            mrgnLndg = new ArrayList<>();
        }
        return this.mrgnLndg;
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
     * Adds a new item to the mrgnLndg list.
     * @see #getMrgnLndg()
     * 
     */
    public TransactionCollateralData18Choice addMrgnLndg(Security55 mrgnLndg) {
        getMrgnLndg().add(mrgnLndg);
        return this;
    }

}
