
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
 * Identification of a party and its role.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary36", propOrder = {
    "id",
    "lglNttyIdr",
    "acct",
    "wvdTrlrComssnInd",
    "role",
    "pmryComAdr",
    "scndryComAdr",
    "nmAndAdr"
})
public class Intermediary36 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification72Choice id;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;
    @XmlElement(name = "Acct")
    protected Account20 acct;
    @XmlElement(name = "WvdTrlrComssnInd")
    protected Boolean wvdTrlrComssnInd;
    @XmlElement(name = "Role")
    protected PartyRole2Choice role;
    @XmlElement(name = "PmryComAdr")
    protected List<CommunicationAddress6> pmryComAdr;
    @XmlElement(name = "ScndryComAdr")
    protected List<CommunicationAddress6> scndryComAdr;
    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress4 nmAndAdr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification72Choice }
     *     
     */
    public PartyIdentification72Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification72Choice }
     *     
     */
    public Intermediary36 setId(PartyIdentification72Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the lglNttyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNttyIdr() {
        return lglNttyIdr;
    }

    /**
     * Sets the value of the lglNttyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Intermediary36 setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
        return this;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account20 }
     *     
     */
    public Account20 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account20 }
     *     
     */
    public Intermediary36 setAcct(Account20 value) {
        this.acct = value;
        return this;
    }

    /**
     * Gets the value of the wvdTrlrComssnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWvdTrlrComssnInd() {
        return wvdTrlrComssnInd;
    }

    /**
     * Sets the value of the wvdTrlrComssnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Intermediary36 setWvdTrlrComssnInd(Boolean value) {
        this.wvdTrlrComssnInd = value;
        return this;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole2Choice }
     *     
     */
    public PartyRole2Choice getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole2Choice }
     *     
     */
    public Intermediary36 setRole(PartyRole2Choice value) {
        this.role = value;
        return this;
    }

    /**
     * Gets the value of the pmryComAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmryComAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmryComAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationAddress6 }
     * 
     * 
     */
    public List<CommunicationAddress6> getPmryComAdr() {
        if (pmryComAdr == null) {
            pmryComAdr = new ArrayList<CommunicationAddress6>();
        }
        return this.pmryComAdr;
    }

    /**
     * Gets the value of the scndryComAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scndryComAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScndryComAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationAddress6 }
     * 
     * 
     */
    public List<CommunicationAddress6> getScndryComAdr() {
        if (scndryComAdr == null) {
            scndryComAdr = new ArrayList<CommunicationAddress6>();
        }
        return this.scndryComAdr;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress4 }
     *     
     */
    public NameAndAddress4 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress4 }
     *     
     */
    public Intermediary36 setNmAndAdr(NameAndAddress4 value) {
        this.nmAndAdr = value;
        return this;
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
     * Adds a new item to the pmryComAdr list.
     * @see #getPmryComAdr()
     * 
     */
    public Intermediary36 addPmryComAdr(CommunicationAddress6 pmryComAdr) {
        getPmryComAdr().add(pmryComAdr);
        return this;
    }

    /**
     * Adds a new item to the scndryComAdr list.
     * @see #getScndryComAdr()
     * 
     */
    public Intermediary36 addScndryComAdr(CommunicationAddress6 scndryComAdr) {
        getScndryComAdr().add(scndryComAdr);
        return this;
    }

}
