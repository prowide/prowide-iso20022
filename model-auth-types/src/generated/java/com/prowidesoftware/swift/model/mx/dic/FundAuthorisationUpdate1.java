
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
 * Specifies the attributes for the creation or update of the authorised money market fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundAuthorisationUpdate1", propOrder = {
    "fndNttyId",
    "fndInstrmId",
    "fndAttrbts",
    "fndMgmtCpny",
    "authstnPrd"
})
public class FundAuthorisationUpdate1 {

    @XmlElement(name = "FndNttyId", required = true)
    protected PartyIdentification196 fndNttyId;
    @XmlElement(name = "FndInstrmId")
    protected List<SecurityIdentification31Choice> fndInstrmId;
    @XmlElement(name = "FndAttrbts", required = true)
    protected FinancialInstrumentAttributes100 fndAttrbts;
    @XmlElement(name = "FndMgmtCpny", required = true)
    protected PartyIdentification194 fndMgmtCpny;
    @XmlElement(name = "AuthstnPrd", required = true)
    protected DatePeriod3 authstnPrd;

    /**
     * Gets the value of the fndNttyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification196 }
     *     
     */
    public PartyIdentification196 getFndNttyId() {
        return fndNttyId;
    }

    /**
     * Sets the value of the fndNttyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification196 }
     *     
     */
    public FundAuthorisationUpdate1 setFndNttyId(PartyIdentification196 value) {
        this.fndNttyId = value;
        return this;
    }

    /**
     * Gets the value of the fndInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fndInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification31Choice }
     * 
     * 
     */
    public List<SecurityIdentification31Choice> getFndInstrmId() {
        if (fndInstrmId == null) {
            fndInstrmId = new ArrayList<SecurityIdentification31Choice>();
        }
        return this.fndInstrmId;
    }

    /**
     * Gets the value of the fndAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes100 }
     *     
     */
    public FinancialInstrumentAttributes100 getFndAttrbts() {
        return fndAttrbts;
    }

    /**
     * Sets the value of the fndAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes100 }
     *     
     */
    public FundAuthorisationUpdate1 setFndAttrbts(FinancialInstrumentAttributes100 value) {
        this.fndAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the fndMgmtCpny property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification194 }
     *     
     */
    public PartyIdentification194 getFndMgmtCpny() {
        return fndMgmtCpny;
    }

    /**
     * Sets the value of the fndMgmtCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification194 }
     *     
     */
    public FundAuthorisationUpdate1 setFndMgmtCpny(PartyIdentification194 value) {
        this.fndMgmtCpny = value;
        return this;
    }

    /**
     * Gets the value of the authstnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod3 }
     *     
     */
    public DatePeriod3 getAuthstnPrd() {
        return authstnPrd;
    }

    /**
     * Sets the value of the authstnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod3 }
     *     
     */
    public FundAuthorisationUpdate1 setAuthstnPrd(DatePeriod3 value) {
        this.authstnPrd = value;
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
     * Adds a new item to the fndInstrmId list.
     * @see #getFndInstrmId()
     * 
     */
    public FundAuthorisationUpdate1 addFndInstrmId(SecurityIdentification31Choice fndInstrmId) {
        getFndInstrmId().add(fndInstrmId);
        return this;
    }

}
