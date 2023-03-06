
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
 * Provides information about the securities movement resulting from the election instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionSecuritiesMovement2", propOrder = {
    "sctyId",
    "pstngDtTm",
    "pstngId",
    "pstngQty",
    "acctDtls"
})
public class CorporateActionSecuritiesMovement2 {

    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification7 sctyId;
    @XmlElement(name = "PstngDtTm")
    protected DateAndDateTimeChoice pstngDtTm;
    @XmlElement(name = "PstngId")
    protected String pstngId;
    @XmlElement(name = "PstngQty", required = true)
    protected UnitOrFaceAmount1Choice pstngQty;
    @XmlElement(name = "AcctDtls", required = true)
    protected List<SecuritiesAccount9> acctDtls;

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
    public CorporateActionSecuritiesMovement2 setSctyId(SecurityIdentification7 value) {
        this.sctyId = value;
        return this;
    }

    /**
     * Gets the value of the pstngDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPstngDtTm() {
        return pstngDtTm;
    }

    /**
     * Sets the value of the pstngDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public CorporateActionSecuritiesMovement2 setPstngDtTm(DateAndDateTimeChoice value) {
        this.pstngDtTm = value;
        return this;
    }

    /**
     * Gets the value of the pstngId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstngId() {
        return pstngId;
    }

    /**
     * Sets the value of the pstngId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionSecuritiesMovement2 setPstngId(String value) {
        this.pstngId = value;
        return this;
    }

    /**
     * Gets the value of the pstngQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getPstngQty() {
        return pstngQty;
    }

    /**
     * Sets the value of the pstngQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public CorporateActionSecuritiesMovement2 setPstngQty(UnitOrFaceAmount1Choice value) {
        this.pstngQty = value;
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
     * {@link SecuritiesAccount9 }
     * 
     * 
     */
    public List<SecuritiesAccount9> getAcctDtls() {
        if (acctDtls == null) {
            acctDtls = new ArrayList<SecuritiesAccount9>();
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
    public CorporateActionSecuritiesMovement2 addAcctDtls(SecuritiesAccount9 acctDtls) {
        getAcctDtls().add(acctDtls);
        return this;
    }

}
