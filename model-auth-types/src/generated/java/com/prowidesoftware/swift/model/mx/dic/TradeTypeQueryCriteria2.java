
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates the query criteria related to transaction types.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTypeQueryCriteria2", propOrder = {
    "oprtr",
    "sctiesFincgTxTp",
    "collCmpntTp"
})
public class TradeTypeQueryCriteria2 {

    @XmlElement(name = "Oprtr", required = true)
    @XmlSchemaType(name = "string")
    protected Operation3Code oprtr;
    @XmlElement(name = "SctiesFincgTxTp")
    @XmlSchemaType(name = "string")
    protected List<ExposureType10Code> sctiesFincgTxTp;
    @XmlElement(name = "CollCmpntTp")
    @XmlSchemaType(name = "string")
    protected List<CollateralType6Code> collCmpntTp;

    /**
     * Gets the value of the oprtr property.
     * 
     * @return
     *     possible object is
     *     {@link Operation3Code }
     *     
     */
    public Operation3Code getOprtr() {
        return oprtr;
    }

    /**
     * Sets the value of the oprtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation3Code }
     *     
     */
    public TradeTypeQueryCriteria2 setOprtr(Operation3Code value) {
        this.oprtr = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgTxTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesFincgTxTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesFincgTxTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExposureType10Code }
     * 
     * 
     * @return
     *     The value of the sctiesFincgTxTp property.
     */
    public List<ExposureType10Code> getSctiesFincgTxTp() {
        if (sctiesFincgTxTp == null) {
            sctiesFincgTxTp = new ArrayList<>();
        }
        return this.sctiesFincgTxTp;
    }

    /**
     * Gets the value of the collCmpntTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collCmpntTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollCmpntTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralType6Code }
     * 
     * 
     * @return
     *     The value of the collCmpntTp property.
     */
    public List<CollateralType6Code> getCollCmpntTp() {
        if (collCmpntTp == null) {
            collCmpntTp = new ArrayList<>();
        }
        return this.collCmpntTp;
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
     * Adds a new item to the sctiesFincgTxTp list.
     * @see #getSctiesFincgTxTp()
     * 
     */
    public TradeTypeQueryCriteria2 addSctiesFincgTxTp(ExposureType10Code sctiesFincgTxTp) {
        getSctiesFincgTxTp().add(sctiesFincgTxTp);
        return this;
    }

    /**
     * Adds a new item to the collCmpntTp list.
     * @see #getCollCmpntTp()
     * 
     */
    public TradeTypeQueryCriteria2 addCollCmpntTp(CollateralType6Code collCmpntTp) {
        getCollCmpntTp().add(collCmpntTp);
        return this;
    }

}
