
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
 * Provides information about the failure of the settlement of a movement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementFailedStatus1", propOrder = {
    "agtAcctId",
    "clntAcctId",
    "acctOwnrId",
    "rsrcDtls"
})
public class CorporateActionMovementFailedStatus1 {

    @XmlElement(name = "AgtAcctId", required = true)
    protected String agtAcctId;
    @XmlElement(name = "ClntAcctId")
    protected String clntAcctId;
    @XmlElement(name = "AcctOwnrId")
    protected PartyIdentification2Choice acctOwnrId;
    @XmlElement(name = "RsrcDtls", required = true)
    protected List<FailedMovement1> rsrcDtls;

    /**
     * Gets the value of the agtAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgtAcctId() {
        return agtAcctId;
    }

    /**
     * Sets the value of the agtAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionMovementFailedStatus1 setAgtAcctId(String value) {
        this.agtAcctId = value;
        return this;
    }

    /**
     * Gets the value of the clntAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntAcctId() {
        return clntAcctId;
    }

    /**
     * Sets the value of the clntAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionMovementFailedStatus1 setClntAcctId(String value) {
        this.clntAcctId = value;
        return this;
    }

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
    public CorporateActionMovementFailedStatus1 setAcctOwnrId(PartyIdentification2Choice value) {
        this.acctOwnrId = value;
        return this;
    }

    /**
     * Gets the value of the rsrcDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rsrcDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsrcDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FailedMovement1 }
     * 
     * 
     */
    public List<FailedMovement1> getRsrcDtls() {
        if (rsrcDtls == null) {
            rsrcDtls = new ArrayList<FailedMovement1>();
        }
        return this.rsrcDtls;
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
     * Adds a new item to the rsrcDtls list.
     * @see #getRsrcDtls()
     * 
     */
    public CorporateActionMovementFailedStatus1 addRsrcDtls(FailedMovement1 rsrcDtls) {
        getRsrcDtls().add(rsrcDtls);
        return this;
    }

}
