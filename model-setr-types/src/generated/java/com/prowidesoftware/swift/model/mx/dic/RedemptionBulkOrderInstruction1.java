
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
 * Information about a redemption bulk order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionBulkOrderInstruction1", propOrder = {
    "blkOrdrDtls",
    "intrmyDtls",
    "cpyDtls",
    "xtnsn"
})
public class RedemptionBulkOrderInstruction1 {

    @XmlElement(name = "BlkOrdrDtls", required = true)
    protected RedemptionBulkOrder2 blkOrdrDtls;
    @XmlElement(name = "IntrmyDtls")
    protected List<Intermediary4> intrmyDtls;
    @XmlElement(name = "CpyDtls")
    protected CopyInformation1 cpyDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the blkOrdrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionBulkOrder2 }
     *     
     */
    public RedemptionBulkOrder2 getBlkOrdrDtls() {
        return blkOrdrDtls;
    }

    /**
     * Sets the value of the blkOrdrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionBulkOrder2 }
     *     
     */
    public RedemptionBulkOrderInstruction1 setBlkOrdrDtls(RedemptionBulkOrder2 value) {
        this.blkOrdrDtls = value;
        return this;
    }

    /**
     * Gets the value of the intrmyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary4 }
     * 
     * 
     * @return
     *     The value of the intrmyDtls property.
     */
    public List<Intermediary4> getIntrmyDtls() {
        if (intrmyDtls == null) {
            intrmyDtls = new ArrayList<>();
        }
        return this.intrmyDtls;
    }

    /**
     * Gets the value of the cpyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CopyInformation1 }
     *     
     */
    public CopyInformation1 getCpyDtls() {
        return cpyDtls;
    }

    /**
     * Sets the value of the cpyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyInformation1 }
     *     
     */
    public RedemptionBulkOrderInstruction1 setCpyDtls(CopyInformation1 value) {
        this.cpyDtls = value;
        return this;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
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
     * Adds a new item to the intrmyDtls list.
     * @see #getIntrmyDtls()
     * 
     */
    public RedemptionBulkOrderInstruction1 addIntrmyDtls(Intermediary4 intrmyDtls) {
        getIntrmyDtls().add(intrmyDtls);
        return this;
    }

    /**
     * Adds a new item to the xtnsn list.
     * @see #getXtnsn()
     * 
     */
    public RedemptionBulkOrderInstruction1 addXtnsn(Extension1 xtnsn) {
        getXtnsn().add(xtnsn);
        return this;
    }

}
