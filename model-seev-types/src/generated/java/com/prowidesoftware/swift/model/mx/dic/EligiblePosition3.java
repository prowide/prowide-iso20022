
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the voting entitlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligiblePosition3", propOrder = {
    "acctId",
    "acctOwnr",
    "hldgBal",
    "rghtsHldr"
})
public class EligiblePosition3 {

    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification9Choice acctOwnr;
    @XmlElement(name = "HldgBal")
    protected List<HoldingBalance6> hldgBal;
    @XmlElement(name = "RghtsHldr")
    protected List<PartyIdentification9Choice> rghtsHldr;

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
    public EligiblePosition3 setAcctId(String value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public PartyIdentification9Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification9Choice }
     *     
     */
    public EligiblePosition3 setAcctOwnr(PartyIdentification9Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the hldgBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hldgBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHldgBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingBalance6 }
     * 
     * 
     */
    public List<HoldingBalance6> getHldgBal() {
        if (hldgBal == null) {
            hldgBal = new ArrayList<HoldingBalance6>();
        }
        return this.hldgBal;
    }

    /**
     * Gets the value of the rghtsHldr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rghtsHldr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRghtsHldr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification9Choice }
     * 
     * 
     */
    public List<PartyIdentification9Choice> getRghtsHldr() {
        if (rghtsHldr == null) {
            rghtsHldr = new ArrayList<PartyIdentification9Choice>();
        }
        return this.rghtsHldr;
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
     * Adds a new item to the hldgBal list.
     * @see #getHldgBal()
     * 
     */
    public EligiblePosition3 addHldgBal(HoldingBalance6 hldgBal) {
        getHldgBal().add(hldgBal);
        return this;
    }

    /**
     * Adds a new item to the rghtsHldr list.
     * @see #getRghtsHldr()
     * 
     */
    public EligiblePosition3 addRghtsHldr(PartyIdentification9Choice rghtsHldr) {
        getRghtsHldr().add(rghtsHldr);
        return this;
    }

}
