
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
 * Provides information about the securities movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityMovement1", propOrder = {
    "mvmntId",
    "sctyId",
    "sctiesQty",
    "acctDtls"
})
public class SecurityMovement1 {

    @XmlElement(name = "MvmntId")
    protected String mvmntId;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification7 sctyId;
    @XmlElement(name = "SctiesQty", required = true)
    protected UnitOrFaceAmount1Choice sctiesQty;
    @XmlElement(name = "AcctDtls", required = true)
    protected List<SecuritiesAccount12> acctDtls;

    /**
     * Gets the value of the mvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvmntId() {
        return mvmntId;
    }

    /**
     * Sets the value of the mvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityMovement1 setMvmntId(String value) {
        this.mvmntId = value;
        return this;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityMovement1 setSctyId(SecurityIdentification7 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public SecurityMovement1 setSctiesQty(UnitOrFaceAmount1Choice value) {
        this.sctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the acctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesAccount12 }
     * 
     * 
     */
    public List<SecuritiesAccount12> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new ArrayList<SecuritiesAccount12>();
        }
        return this.acctDtls;
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
     * Adds a new item to the acctDtls list.
     * @see #getAcctDtls()
     * 
     */
    public SecurityMovement1 addAcctDtls(SecuritiesAccount12 acctDtls) {
        getAcctDtls().add(acctDtls);
        return this;
    }

}
