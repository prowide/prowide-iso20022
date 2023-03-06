
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
 * Provides information about the entitlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entitlement1", propOrder = {
    "acctOwnrId",
    "acctId",
    "sctiesDstrbtnDtls",
    "cshDstrbtnDtls"
})
public class Entitlement1 {

    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "SctiesDstrbtnDtls")
    protected List<SecuritiesEntitlement1> sctiesDstrbtnDtls;
    @XmlElement(name = "CshDstrbtnDtls")
    protected List<CashEntitlement1> cshDstrbtnDtls;

    /**
     * Gets the value of the acctOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctOwnrId() {
        return acctOwnrId;
    }

    /**
     * Sets the value of the acctOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public Entitlement1 setAcctOwnrId(PartyIdentification2Choice value) {
        this.acctOwnrId = value;
        return this;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Entitlement1 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesDstrbtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesDstrbtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesDstrbtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesEntitlement1 }
     * 
     * 
     */
    public List<SecuritiesEntitlement1> getSctiesDstrbtnDtls() {
        if (sctiesDstrbtnDtls == null) {
            sctiesDstrbtnDtls = new ArrayList<SecuritiesEntitlement1>();
        }
        return this.sctiesDstrbtnDtls;
    }

    /**
     * Gets the value of the cshDstrbtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshDstrbtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshDstrbtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashEntitlement1 }
     * 
     * 
     */
    public List<CashEntitlement1> getCshDstrbtnDtls() {
        if (cshDstrbtnDtls == null) {
            cshDstrbtnDtls = new ArrayList<CashEntitlement1>();
        }
        return this.cshDstrbtnDtls;
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
     * Adds a new item to the sctiesDstrbtnDtls list.
     * @see #getSctiesDstrbtnDtls()
     * 
     */
    public Entitlement1 addSctiesDstrbtnDtls(SecuritiesEntitlement1 sctiesDstrbtnDtls) {
        getSctiesDstrbtnDtls().add(sctiesDstrbtnDtls);
        return this;
    }

    /**
     * Adds a new item to the cshDstrbtnDtls list.
     * @see #getCshDstrbtnDtls()
     * 
     */
    public Entitlement1 addCshDstrbtnDtls(CashEntitlement1 cshDstrbtnDtls) {
        getCshDstrbtnDtls().add(cshDstrbtnDtls);
        return this;
    }

}
