
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
 * Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount30", propOrder = {
    "acct",
    "dsgnt",
    "ownr",
    "svcr",
    "subAcct"
})
public class InvestmentAccount30 {

    @XmlElement(name = "Acct", required = true)
    protected SecuritiesAccount5 acct;
    @XmlElement(name = "Dsgnt")
    protected String dsgnt;
    @XmlElement(name = "Ownr")
    protected List<PartyIdentification2Choice> ownr;
    @XmlElement(name = "Svcr")
    protected PartyIdentification2Choice svcr;
    @XmlElement(name = "SubAcct")
    protected SubAccount3 subAcct;

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount5 }
     *     
     */
    public SecuritiesAccount5 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount5 }
     *     
     */
    public InvestmentAccount30 setAcct(SecuritiesAccount5 value) {
        this.acct = value;
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
    public InvestmentAccount30 setDsgnt(String value) {
        this.dsgnt = value;
        return this;
    }

    /**
     * Gets the value of the ownr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ownr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification2Choice }
     * 
     * 
     * @return
     *     The value of the ownr property.
     */
    public List<PartyIdentification2Choice> getOwnr() {
        if (ownr == null) {
            ownr = new ArrayList<>();
        }
        return this.ownr;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public InvestmentAccount30 setSvcr(PartyIdentification2Choice value) {
        this.svcr = value;
        return this;
    }

    /**
     * Gets the value of the subAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount3 }
     *     
     */
    public SubAccount3 getSubAcct() {
        return subAcct;
    }

    /**
     * Sets the value of the subAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount3 }
     *     
     */
    public InvestmentAccount30 setSubAcct(SubAccount3 value) {
        this.subAcct = value;
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
     * Adds a new item to the ownr list.
     * @see #getOwnr()
     * 
     */
    public InvestmentAccount30 addOwnr(PartyIdentification2Choice ownr) {
        getOwnr().add(ownr);
        return this;
    }

}
