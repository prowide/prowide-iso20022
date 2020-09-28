
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
 * Safekeeping or investment account. A safekeeping account is an account on which a securities entry is made. An investment account is an account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingAccount1", propOrder = {
    "id",
    "fngbInd",
    "nm",
    "dsgnt",
    "intrmyInf",
    "acctOwnr",
    "acctSvcr"
})
public class SafekeepingAccount1 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentificationFormatChoice id;
    @XmlElement(name = "FngbInd")
    protected boolean fngbInd;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary1> intrmyInf;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification1Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification1Choice acctSvcr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationFormatChoice }
     *     
     */
    public AccountIdentificationFormatChoice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationFormatChoice }
     *     
     */
    public SafekeepingAccount1 setId(AccountIdentificationFormatChoice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the fngbInd property.
     * 
     */
    public boolean isFngbInd() {
        return fngbInd;
    }

    /**
     * Sets the value of the fngbInd property.
     * 
     */
    public SafekeepingAccount1 setFngbInd(boolean value) {
        this.fngbInd = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SafekeepingAccount1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the dsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsgnt() {
        return dsgnt;
    }

    /**
     * Sets the value of the dsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SafekeepingAccount1 setDsgnt(String value) {
        this.dsgnt = value;
        return this;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary1 }
     * 
     * 
     */
    public List<Intermediary1> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<Intermediary1>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public PartyIdentification1Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public SafekeepingAccount1 setAcctOwnr(PartyIdentification1Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public PartyIdentification1Choice getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification1Choice }
     *     
     */
    public SafekeepingAccount1 setAcctSvcr(PartyIdentification1Choice value) {
        this.acctSvcr = value;
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
     * Adds a new item to the intrmyInf list.
     * @see #getIntrmyInf()
     * 
     */
    public SafekeepingAccount1 addIntrmyInf(Intermediary1 intrmyInf) {
        getIntrmyInf().add(intrmyInf);
        return this;
    }

}
